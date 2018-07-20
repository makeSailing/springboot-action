package com.makesailing.neo.annotation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import com.makesailing.neo.annotation.AllowedValues.AllowedIntegerValuesValidator;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;

@Documented
@Constraint(validatedBy = {AllowedIntegerValuesValidator.class})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@ReportAsSingleViolation
public @interface AllowedValues {

	String message() default "";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String[] value() default {};

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
}