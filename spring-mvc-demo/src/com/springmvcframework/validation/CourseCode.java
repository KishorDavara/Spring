/**
 * 
 */
package com.springmvcframework.validation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


/**
 * @author KDavara
 *
 */

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RUNTIME)
public @interface CourseCode {
	
	//define default course code
	public String value() default "LUV";
	
	//define default error message
	public String message() default "must start with LUV";
	
	//define default groups
	public Class<?>[] groups() default {};
	
	//define default payloads
	public Class<? extends Payload>[] payload() default {};
}
