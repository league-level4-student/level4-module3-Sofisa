package _02_gotta_catchem_all;

public class ExceptionMethods {

	public static double divide(double a, double b) {
		double quotient = a / b;
		if (b == 0.0) {
			throw new IllegalArgumentException();
		}
		return quotient;
	}

	public static String reverseString(String s) {
		byte[] chunks = s.getBytes();
		byte[] result = new byte[chunks.length];

		if (s == "  ") {
			throw new IllegalStateException();
		}
		for (int i = 0; i < result.length; i++) {
			result[i] = chunks[chunks.length - i - 1];

		}
		return new String(result);

	}

}
