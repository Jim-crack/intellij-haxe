// Generated by Haxe 4.0.0-preview.5+7eb789f54
package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class DynamicObject extends haxe.lang.HxObject
{
	public DynamicObject(haxe.lang.EmptyObject empty)
	{
		//line 42 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public DynamicObject(java.lang.String[] fields, java.lang.Object[] dynamics, java.lang.String[] fields_f, double[] dynamics_f)
	{
		//line 61 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		haxe.lang.DynamicObject.__hx_ctor_haxe_lang_DynamicObject(((haxe.lang.DynamicObject) (this) ), ((java.lang.String[]) (fields) ), ((java.lang.Object[]) (dynamics) ), ((java.lang.String[]) (fields_f) ), ((double[]) (dynamics_f) ));
	}
	
	
	public DynamicObject()
	{
		//line 53 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		haxe.lang.DynamicObject.__hx_ctor_haxe_lang_DynamicObject(((haxe.lang.DynamicObject) (this) ));
	}
	
	
	protected static void __hx_ctor_haxe_lang_DynamicObject(haxe.lang.DynamicObject __hx_this, java.lang.String[] fields, java.lang.Object[] dynamics, java.lang.String[] fields_f, double[] dynamics_f)
	{
		//line 63 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_fields = fields;
		//line 64 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_dynamics = dynamics;
		//line 65 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_fields_f = fields_f;
		//line 66 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_dynamics_f = dynamics_f;
		//line 67 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_length = fields.length;
		//line 68 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_length_f = fields_f.length;
	}
	
	
	protected static void __hx_ctor_haxe_lang_DynamicObject(haxe.lang.DynamicObject __hx_this)
	{
		//line 55 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_fields = new java.lang.String[0];
		//line 56 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_dynamics = new java.lang.Object[0];
		//line 57 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_fields_f = new java.lang.String[0];
		//line 58 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_dynamics_f = new double[0];
	}
	
	
	public java.lang.String[] __hx_fields;
	
	public java.lang.Object[] __hx_dynamics;
	
	public java.lang.String[] __hx_fields_f;
	
	public double[] __hx_dynamics_f;
	
	public int __hx_length;
	
	public int __hx_length_f;
	
	public boolean __hx_deleteField(java.lang.String field)
	{
		//line 73 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields, this.__hx_length);
		//line 74 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 76 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			haxe.lang.FieldLookup.removeString(this.__hx_fields, this.__hx_length, res);
			//line 77 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			haxe.lang.FieldLookup.removeDynamic(this.__hx_dynamics, this.__hx_length, res);
			//line 78 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			this.__hx_length--;
			//line 79 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return true;
		}
		
		//line 81 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		int res1 = haxe.lang.FieldLookup.findHash(field, this.__hx_fields_f, this.__hx_length_f);
		//line 82 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (( res1 >= 0 )) 
		{
			//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			haxe.lang.FieldLookup.removeString(this.__hx_fields_f, this.__hx_length_f, res1);
			//line 85 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			haxe.lang.FieldLookup.removeFloat(this.__hx_dynamics_f, this.__hx_length_f, res1);
			//line 86 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			this.__hx_length_f--;
			//line 87 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return true;
		}
		
		//line 89 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		return false;
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 94 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields, this.__hx_length);
		//line 95 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 97 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return this.__hx_dynamics[res];
		}
		
		//line 99 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields_f, this.__hx_length_f);
		//line 100 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 102 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return this.__hx_dynamics_f[res];
		}
		
		//line 105 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (isCheck) 
		{
			//line 105 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return haxe.lang.Runtime.undefined;
		}
		else
		{
			//line 105 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return null;
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 110 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields, this.__hx_length);
		//line 111 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 113 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return this.__hx_dynamics[res] = value;
		}
		else
		{
			//line 115 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			int res1 = haxe.lang.FieldLookup.findHash(field, this.__hx_fields_f, this.__hx_length_f);
			//line 116 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			if (( res1 >= 0 )) 
			{
				//line 118 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				if (haxe.lang.Runtime.isDouble(value)) 
				{
					//line 120 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
					return this.__hx_dynamics_f[res1] = ((double) (haxe.lang.Runtime.toDouble(value)) );
				}
				
				//line 123 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				haxe.lang.FieldLookup.removeString(this.__hx_fields_f, this.__hx_length_f, res1);
				//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				haxe.lang.FieldLookup.removeFloat(this.__hx_dynamics_f, this.__hx_length_f, res1);
				//line 125 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				this.__hx_length_f--;
			}
			
		}
		
		//line 129 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		this.__hx_fields = haxe.lang.FieldLookup.insertString(this.__hx_fields, this.__hx_length,  ~ (res) , field);
		//line 130 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		this.__hx_dynamics = haxe.lang.FieldLookup.insertDynamic(this.__hx_dynamics, this.__hx_length,  ~ (res) , value);
		//line 131 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		this.__hx_length++;
		//line 132 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		return value;
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 137 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields_f, this.__hx_length_f);
		//line 138 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 140 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return this.__hx_dynamics_f[res];
		}
		
		//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields, this.__hx_length);
		//line 143 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 145 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return ((double) (haxe.lang.Runtime.toDouble(this.__hx_dynamics[res])) );
		}
		
		//line 148 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		return 0.0;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 153 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields_f, this.__hx_length_f);
		//line 154 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 156 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return this.__hx_dynamics_f[res] = value;
		}
		else
		{
			//line 158 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			int res1 = haxe.lang.FieldLookup.findHash(field, this.__hx_fields, this.__hx_length);
			//line 159 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			if (( res1 >= 0 )) 
			{
				//line 162 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				haxe.lang.FieldLookup.removeString(this.__hx_fields, this.__hx_length, res1);
				//line 163 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				haxe.lang.FieldLookup.removeDynamic(this.__hx_dynamics, this.__hx_length, res1);
				//line 164 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				this.__hx_length--;
			}
			
		}
		
		//line 168 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		this.__hx_fields_f = haxe.lang.FieldLookup.insertString(this.__hx_fields_f, this.__hx_length_f,  ~ (res) , field);
		//line 169 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		this.__hx_dynamics_f = haxe.lang.FieldLookup.insertFloat(this.__hx_dynamics_f, this.__hx_length_f,  ~ (res) , value);
		//line 170 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		this.__hx_length_f++;
		//line 171 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		return value;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 176 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		{
			//line 176 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			int _g = 0;
			//line 176 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			int _g1 = this.__hx_length;
			//line 176 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			while (( _g < _g1 ))
			{
				//line 176 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				int i = _g++;
				//line 178 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				baseArr.push(this.__hx_fields[i]);
			}
			
		}
		
		//line 180 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		{
			//line 180 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			int _g2 = 0;
			//line 180 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			int _g3 = this.__hx_length_f;
			//line 180 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			while (( _g2 < _g3 ))
			{
				//line 180 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				int i1 = _g2++;
				//line 182 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				baseArr.push(this.__hx_fields_f[i1]);
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 188 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (haxe.lang.Runtime.valEq(field, "toString")) 
		{
			//line 190 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return this.toString();
		}
		
		//line 192 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		haxe.lang.Function fn = ((haxe.lang.Function) (this.__hx_getField(field, false, false, false)) );
		//line 193 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (( fn == null )) 
		{
			//line 195 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			throw haxe.lang.HaxeException.wrap(( ( "Cannot invoke field " + field ) + ": It does not exist" ));
		}
		
		//line 198 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		return fn.__hx_invokeDynamic(dynargs);
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 203 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		haxe.lang.Function ts = ((haxe.lang.Function) (this.__hx_getField("toString", false, false, false)) );
		//line 204 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if (( ts != null )) 
		{
			//line 205 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			return haxe.lang.Runtime.toString(ts.__hx_invoke0_o());
		}
		
		//line 206 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		haxe.root.StringBuf ret = new haxe.root.StringBuf();
		//line 207 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		ret.add(haxe.lang.Runtime.toString("{"));
		//line 208 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		boolean first = true;
		//line 209 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		{
			//line 209 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			int _g = 0;
			//line 209 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			haxe.root.Array<java.lang.String> _g1 = haxe.root.Reflect.fields(this);
			//line 209 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			while (( _g < _g1.length ))
			{
				//line 209 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				java.lang.String f = _g1.__get(_g);
				//line 209 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				 ++ _g;
				//line 211 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				if (first) 
				{
					//line 212 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
					first = false;
				}
				else
				{
					//line 214 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
					ret.add(haxe.lang.Runtime.toString(","));
				}
				
				//line 215 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				ret.add(haxe.lang.Runtime.toString(" "));
				//line 215 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				ret.add(haxe.lang.Runtime.toString(f));
				//line 216 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				ret.add(haxe.lang.Runtime.toString(" : "));
				//line 217 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
				ret.add(((java.lang.Object) (haxe.root.Reflect.field(this, f)) ));
			}
			
		}
		
		//line 219 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		if ( ! (first) ) 
		{
			//line 219 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
			ret.add(haxe.lang.Runtime.toString(" "));
		}
		
		//line 220 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		ret.add(haxe.lang.Runtime.toString("}"));
		//line 221 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		return ret.toString();
	}
	
	
}


