package com.tms.client.annotations;

import org.apache.commons.lang3.StringUtils;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NullOrNotBlankValidator implements ConstraintValidator<NullOrNotBlank, Object> {

	public void initialize(NullOrNotBlank parameters) {
	}

	public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
		/*
		 * return switch (value) { case null -> false; case Integer intValue -> intValue
		 * != null; case String strValue -> StringUtils.isNotEmpty(strValue); default ->
		 * false; };
		 */
		if (value == null) {
			return false;
		} else if (value instanceof Integer) {
			Integer intValue = (Integer) value;
			return intValue != null;
		} else if (value instanceof String) {
			String strValue = (String) value;
			return strValue != null;
		} else if (value instanceof Boolean) {
			Boolean booValue = (Boolean) value;
			return booValue != null;
		}
		else {
			return value != null;
		}
	}
}
