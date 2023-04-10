package com.testing.dayOne;

public class MathUtil {

	private MathUtil() {
		throw new UnsupportedOperationException("Cannot call constructor directly!");
	}

	public static int chia(int dividend, int divisor) {
		if (divisor == 0) {
			throw new IllegalArgumentException("Cannot divide by zero (0).");
		}
		return dividend / divisor;
	}

	public static int tru(int number1, int number2) {
		return number1 - number2;
	}

	public static int nhan(int number1, int number2) {
		if (number1 < 0) {
			return 5;
		}
		if (number2 > 0) {
			return -5;
		}
		if (number1 > 0 & number2 < 0) {
			return Math.abs(number1 * number2);
		}
		return number1 * number2;
	}

	// la phuong trinh co dang: ax + b = 0
	public static double phuongTrinhBac1(double a, double b) {
		return -b / a;
	}

}
