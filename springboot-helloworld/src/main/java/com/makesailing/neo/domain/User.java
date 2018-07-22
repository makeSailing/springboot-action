package com.makesailing.neo.domain;

import com.makesailing.neo.annotation.AllowedValues;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.validation.constraints.DecimalMin;
import lombok.Data;

/**
 * #
 *
 * @author <a href="mailto:jamie.li@wolaidai.com">jamie.li</a>
 * @date 2018/7/17 15:14
 */
@Data
public class User implements Serializable {


	private String name;


	//	@Pattern(regexp = "[1-9]\\d*\\.?\\d*",message = "意外保障费只能为正整数或正小数  ")
	@DecimalMin(value = "0", message = "意外保障费最小为0    元")
	private BigDecimal earning;

	@AllowedValues(value = {"7", "9"}, message = "only could be 7 or 9")
	private int age;
}


