package com.strings_arrays;

public class ReverseString {

	public static String reverseString(String s) {

		if (s.length() <= 1) {

			return s;

		}
		char[] arr = s.toCharArray();

		StringBuffer buffer = new StringBuffer();

		for (int i = arr.length - 1; i >= 0; i--) {
			buffer.append(arr[i]);
		}

		return buffer.toString();

	}

	public static void main(String[] args) {

		System.out.println(reverseString("ABC"));
		;

	}

}
