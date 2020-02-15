package com.legitboss.mvc.customValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomValidatorImplementor implements ConstraintValidator<CustomValidation,String>{
	//ConstrainValidator is an inbuilt validation class in javax of type Annotation Class
	
	private String registerNumber;
	
	@Override
	public void initialize(CustomValidation custValidation){
		registerNumber = custValidation.value();
	}
	
	@Override
	public boolean isValid(String input, ConstraintValidatorContext constValidatorContext) {
		return input.startsWith(registerNumber);
	} 
	
}
