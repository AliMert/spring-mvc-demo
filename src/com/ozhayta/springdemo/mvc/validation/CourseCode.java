package com.ozhayta.springdemo.mvc.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseConstraintValidator.class)
@Target({ FIELD, METHOD })
@Retention(RUNTIME)
public @interface CourseCode {
		
	// define default course code
	public String value() default "LUV";
	
	// define default error message
	public String message() default "must start with LUV";	
	
	// define default groups
	public Class<?>[] groups() default {};
	
	//define defaults payloads
	public Class<? extends Payload>[] payload() default {};
}
