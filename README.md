# AndroidFormValidator
Simple Android Form Validator Class
#How to use
simply paste the class folder to your project and use following code for validation
```java
void someEvent() {
	editText1=(EditText) findViewById(.........);
	editText2=(EditText) findViewById(.........);
	
	boolean valid=new FormValidator()
		.add(editText1,"Guests Required")
		.add(editText2, "Phone Number?")
		.validate();
		
		if(valid) {
			//do some
		}
		else
		{
			//do something
		}
}
```

#The function add has following uses
```java
	FormValidator add(View control, String message,String initialText)
```

Where
	* View control, control you want to validate
	* message, string which will be displayed when control is invalid
	* initialText,initial string like placeholder for button controls, if control has this string, invalid is fired