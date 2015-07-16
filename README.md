# AndroidFormValidator
Simple Android Form Validator Library which can validate both EditText and Buttons
#How to use
simply paste the class folder to your project and use following code for validation
```java
void someEvent() {
	editText1=(EditText) findViewById(.........);
	editText2=(EditText) findViewById(.........);
	
	
	boolean valid=new FormValidator()
			.add(
				 new ValidationRule(editText1)
				.add(ValidationRule.REQUIRED,"Required")
				)
			.add(
				new ValidationRule(editText2)
				.add(ValidationRule.EMAIL,"Invalid Email")
				).validate();
		
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
	FormValidator add(ValidationRule rule)
```

Where
```
	* rule object can be initialized with different rules. Supported Rules are 
	REQUIRED,EMAIL,MIN_LENGTH,NOT_EQUALTO,EQUALTO and more can be added;
	
```
