package com.makesailing.neo.annotation;

import java.util.ArrayList;
import java.util.List;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AllowedIntegerValuesValidator implements ConstraintValidator<AllowedValues, Integer> {

	private List<Integer> valueList;

	@Override
	public void initialize(AllowedValues constraintAnnotation) {
		valueList = new ArrayList<>();
		for (String val : constraintAnnotation.value()) {
			valueList.add(Integer.parseInt(val));
		}
	}

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		if (!valueList.contains(value)) {
			return false;
		}
		return true;
	}
}