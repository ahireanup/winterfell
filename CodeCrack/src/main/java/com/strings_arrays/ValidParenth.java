package com.strings_arrays;

import java.util.HashMap;

/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 */
public class ValidParenth {

	public static boolean isValid(String str) {

		if (str.length() <= 1) {
			return false;
		} else if (str.length() % 2 != 0) {
			return false;
		}

		HashMap<Character, Character> charMap = new HashMap<Character, Character>();
		charMap.put('[', ']');
		charMap.put('(', ')');
		charMap.put('{', '}');

		int i = 0;
		int j = str.length() - 1;
		char[] arr = str.toCharArray();
		while (i <= j) {
			if (charMap.containsKey(arr[i])) {
				if (charMap.get(arr[i]) != arr[j]) {
					return false;
				}
			} else {
				return false;
			}
			i++;
			j--;

		}

		return true;
	}

	public static void main(String[] args) {

		boolean result = isValid("[[[[]]]");
		System.out.println(result);
		;
	}

}
