# AndroidFormValidator
Simple Android Form Validator Class
#How to use
simply paste the class folder to your project and use following code for validation
```java
void someEvent() {
	editText1=(EditText) findViewById(.........);
	editText2=(EditText) findViewById(.........);
	new FormValidator().add(new ValidationRule(txt).add(ValidationRule.REQUIRED,"Required").add(ValidationRule.EMAIL,"Invalid Email")).validate();
	
	boolean valid=new FormValidator()
		.add(
			 new ValidationRule(editText1)
			.add(ValidationRule.REQUIRED,"Required")
			.add(ValidationRule.EMAIL,"Invalid Email")
		)
		.add(
			new ValidationRule(editText2)
			.add(ValidationRule.REQUIRED,"Required")
			.add(ValidationRule.MIN_LENGTH,"5","Min 5 chars Required")
		
		)
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
```
	* View control, control you want to validate
	* message, string which will be displayed when control is invalid
	* initialText,initial string like placeholder for button controls, if control has this string, invalid is fired
```
