/*
 * Copyright 2000-2013 JetBrains s.r.o.
 * Copyright 2014-2015 AS3Boyan
 * Copyright 2014-2014 Elias Ku
 * Copyright 2018 Ilya Malanin
 * Copyright 2019 Eric Bishton
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.plugins.haxe.model.type;

import com.intellij.plugins.haxe.lang.psi.*;
import com.intellij.plugins.haxe.model.HaxeMethodModel;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.intellij.plugins.haxe.model.type.HaxeTypeResolver.getTypeFromTypeOrAnonymous;

public class SpecificFunctionReference extends SpecificTypeReference {
  private static final String DELIMITER = "->";

  public static class StdFunctionReference extends SpecificFunctionReference {
    public StdFunctionReference(@NotNull PsiElement context) {
      super(new ArrayList<Argument>(), SpecificTypeReference.getDynamic(context).createHolder(), null, context);
    }
  }


  final public List<Argument> arguments;
  final public ResultHolder returnValue;

  @Nullable final public HaxeMethodModel method;

  public SpecificFunctionReference(List<Argument> arguments,
                                   ResultHolder returnValue,
                                   @Nullable HaxeMethodModel method,
                                   @NotNull PsiElement context) {
    super(context);

    this.arguments = arguments;
    this.returnValue = returnValue;
    this.method = method;
  }

  // This is an adapter to deal with the function-type mismatch between the old resolver
  // and the models.
  // TODO: Technical debt: Need to unify the resolver and the models.
  public static SpecificFunctionReference create(HaxeSpecificFunction func) {
    if (null == func) return null;

    HaxeGenericSpecialization specialization = func.getSpecialization();
    HaxeGenericResolver resolver = specialization.toGenericResolver(func);

    LinkedList<Argument> args = new LinkedList<>();
    List<HaxeFunctionArgument> arguments = func.getFunctionArgumentList();
    for (int i = 0; i < arguments.size(); i++) {
      HaxeFunctionArgument arg = arguments.get(i);
      ResultHolder result = determineType(func, resolver, arg.getFunctionType(), arg.getTypeOrAnonymous());
     args.add(new Argument(i, null != arg.getOptionalMark(), result, arg.getName()));
    }

    HaxeFunctionReturnType returnType = func.getFunctionReturnType();
    ResultHolder returnResult = determineType(func, resolver, returnType.getFunctionType(), returnType.getTypeOrAnonymous());

    return new SpecificFunctionReference(args, returnResult, null, func);
  }

  private static ResultHolder determineType(PsiElement context, HaxeGenericResolver resolver, HaxeFunctionType fnType, HaxeTypeOrAnonymous toa) {
    ResultHolder fnResult;
    if (null != toa) {
      ResultHolder result = getTypeFromTypeOrAnonymous(toa);
      if (null != result.getClassType()) {
        return SpecificHaxeClassReference.propagateGenericsToType(result.getClassType(), resolver).createHolder();
      }
      return result;
    }

    return create(new HaxeSpecificFunction(fnType, resolver.getSpecialization(context))).createHolder();
  }


  @Override
  public SpecificFunctionReference withConstantValue(Object constantValue) {
    return new SpecificFunctionReference(arguments, returnValue, method, context);
  }

  public int getNonOptionalArgumentsCount() {
    if (arguments.isEmpty()) return 0;

    return (int)arguments.stream()
      .filter(argument -> !argument.isOptional())
      .count();
  }

  public List<Argument> getArguments() {
    return arguments;
  }

  public ResultHolder getReturnType() {
    return returnValue;
  }

  @Override
  public String toString() {
    StringBuilder out = new StringBuilder();

    final boolean notSingleArgument = arguments.size() > 1;
    if (notSingleArgument) out.append('(');
    for (int n = 0; n < arguments.size(); n++) {
      if (n > 0) out.append(", ");
      Argument argument = arguments.get(n);
      out.append(argument.toStringWithoutConstant());
    }
    if (notSingleArgument) out.append(')');

    out.append(DELIMITER);
    out.append(returnValue.toStringWithoutConstant());

    return out.toString();
  }

  @Override
  public String toStringWithoutConstant() {
    return toString();
  }

  @Override
  public boolean canBeTypeVariable() {
    return false;
  }

  public static class Argument {
    final private int index;
    final private boolean optional;
    final private String name;
    final private ResultHolder type;

    public Argument(int index, boolean optional, ResultHolder type, @Nullable String name) {
      this.index = index;
      this.optional = optional;
      this.name = name;
      this.type = type;
    }

    public boolean isOptional() {
      return optional;
    }

    public int getIndex() {
      return index;
    }

    public String getName() {
      return name;
    }

    public boolean hasName() {
      return name != null;
    }

    public ResultHolder getType() {
      return type;
    }

    public String toString() {
      return buildStringRepresentation(true);
    }

    public String toStringWithoutConstant() {
      return buildStringRepresentation(false);
    }

    @NotNull
    private String buildStringRepresentation(final boolean withConstantValue) {
      StringBuilder builder = new StringBuilder();
      if (isOptional()) builder.append('?');
      if (withConstantValue && hasName()) {
        builder.append(getName());
        builder.append(':');
      }

      if (withConstantValue) {
        builder.append(type.toString());
      } else {
        builder.append(type.toStringWithoutConstant());
      }

      return builder.toString();
    }

    public boolean isVoid() {
      return type.getType().isVoid();
    }

    public boolean isInvalid() {
      return type.getType().isInvalid();
    }

    public boolean canAssign(Argument argument) {
      return this.isOptional() == argument.isOptional() && type.canAssign(argument.type);
    }
  }
}

