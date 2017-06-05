package com.webApp.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.webApp.form.CustomerForm;


public class CustomerValidator implements Validator {

 public boolean supports(Class<?> paramClass) {
     return CustomerForm.class.equals(paramClass);
 }

 public void validate(Object obj, Errors errors) {
	 
     ValidationUtils.rejectIfEmptyOrWhitespace(errors,"firstName","error.firstName");
     ValidationUtils.rejectIfEmptyOrWhitespace(errors,"lastName","error.lastName");
     ValidationUtils.rejectIfEmptyOrWhitespace(errors,"dateOfBirth","error.dateOfBirth");
     ValidationUtils.rejectIfEmptyOrWhitespace(errors,"username","error.username");
     ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password","error.password");

 }
}