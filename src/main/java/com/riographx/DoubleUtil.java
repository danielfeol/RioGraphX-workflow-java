package com.riographx;

public class DoubleUtil {
	
	/**
	 * If two double values differ less than this value, they are considered equal.
	 */
	public static final double DOUBLE_EQUALITY_THRESHOLD = 1E-8;
	
	/**
	 * Checks if two double values can be considered equal.
	 * 
	 * @param a The first double value.
	 * @param b The second double value.
	 * @return boolean True if two values can be considered equal, false otherwise.
	 */
	public static boolean equals(double a, double b) {
		double c = a - b;
		return c < DOUBLE_EQUALITY_THRESHOLD && 
		       c > -DOUBLE_EQUALITY_THRESHOLD; 
	}
	
	/**
	 * Checks if two arrays of doubles could be consireded equal according to
	 * {@see equals(double, double)}.
	 * 
	 * @param a The first array.
	 * @param b The second array.
	 * @return boolean True if two arrays could be considered equal, false otherwise.
	 */
	public static boolean equals(double[] a, double[] b) {
		if(a.length != b.length)
			return false;
		for(int i = 0; i < a.length; i++)
			if(!equals(a[i], b[i]))
				return false;
		return true;
	}

	/**
	 * Checks if two matrices of doubles could be consireded equal according to
	 * {@see equals(double, double)}.
	 * 
	 * @param a The first matrix.
	 * @param b The second matrix.
	 * @return boolean True if two matrices could be considered equal, false otherwise.
	 */
	public static boolean equals(double[][] a, double[][] b) {
		if(a.length != b.length)
			return false;
		for(int i = 0; i < a.length; i++)
			if(!equals(a[i], b[i]))
				return false;
		return true;
	}
}