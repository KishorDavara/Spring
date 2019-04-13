/**
 * 
 */
package com.springmvcframework.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author KDavara
 *
 */
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String courseCodePrefix;

	public void initialize(CourseCode courseCode) {
		this.courseCodePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
		boolean result;
		if (code != null) {
			result = code.startsWith(courseCodePrefix);
		} else {
			result = true;
		}

		return result;
	}

}
