package com.sagar.android.utils;
import java.util.HashMap;
import java.util.List;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class FormValidator {
	FormValidator mInstance;
	String initialText;
	//Drawable icon;
	HashMap<View,String> objects=new HashMap<View, String>();
	HashMap<View,String> initial=new HashMap<View, String>();
	public FormValidator() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	
	public FormValidator add(View control, String message){
		this.objects.put(control, message);
		return this;
	}
	
	public FormValidator add(View control, String message,String initialText){
		this.objects.put(control, message);
		this.initial.put(control, initialText);
		return this;
	}
	
	public boolean validate(){
		boolean result=true;
		for(View name : objects.keySet()){
			if(name instanceof EditText) {
				if(((EditText) name).getText().toString().length()==0){
					((EditText) name).setError(objects.get(name));
					result=false;
				}
				else
				{
					((EditText) name).setError(null);
				}
			}
			else if(name instanceof Button) {
				if(((Button) name).getText().toString().length()==0 || initial.get(name).equals(((Button) name).getText().toString())){
					((Button) name).setError(objects.get(name));
					result=false;
				}
				else
				{
					((Button) name).setError(null);
				}
				
				
			}
			
			
			
		}
		
		return result;
		
	}
	
	
	
	
	

}
