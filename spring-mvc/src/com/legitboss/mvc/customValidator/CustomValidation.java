package com.legitboss.mvc.customValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CustomValidatorImplementor.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomValidation {
	
	public String value() default "111";
	
	public String message() default "must start with 111";

	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {}; 
}
