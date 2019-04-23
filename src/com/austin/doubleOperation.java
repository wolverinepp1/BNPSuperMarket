package com.austin;

import java.math.BigDecimal;

/*To avoid the double operation lose precision*/
public class doubleOperation
{
	public static double addDouble(double m1, double m2) {
		BigDecimal p1 = new BigDecimal(Double.toString(m1));
		BigDecimal p2 = new BigDecimal(Double.toString(m2));
		return p1.add(p2).doubleValue();
	}

	public static double subDouble(double m1, double m2) {
		BigDecimal p1 = new BigDecimal(Double.toString(m1));
		BigDecimal p2 = new BigDecimal(Double.toString(m2));
		return p1.subtract(p2).doubleValue();
	}


	public static double mul(double m1, double m2) {
		BigDecimal p1 = new BigDecimal(Double.toString(m1));
		BigDecimal p2 = new BigDecimal(Double.toString(m2));
		return p1.multiply(p2).doubleValue();
	}

	public static double div(double m1, double m2, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("Parameter error");
		}
		BigDecimal p1 = new BigDecimal(Double.toString(m1));
		BigDecimal p2 = new BigDecimal(Double.toString(m2));
		return p1.divide(p2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

}
