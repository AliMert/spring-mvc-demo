package com.ozhayta.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode thCourseCode) {
		coursePrefix = thCourseCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result = false;
		
		if (theCode == null) {
			String message = "is required (custom Annotation)";
			setMessage(theConstraintValidatorContext, message);
			return result;
		} else if (theCode.length() >= 10) {
			String message = "Course code length should be less than 10 characters";
			setMessage(theConstraintValidatorContext, message);
			return result;
		}
		
		result = theCode.startsWith(coursePrefix);
		return result;
	}
	
	private void setMessage(ConstraintValidatorContext theConstraintValidatorContext, String message) {
		theConstraintValidatorContext.disableDefaultConstraintViolation();
		theConstraintValidatorContext.buildConstraintViolationWithTemplate(message).addConstraintViolation();
	}

}
