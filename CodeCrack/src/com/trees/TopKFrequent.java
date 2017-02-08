package com.trees;
/*
 * Given a non-empty array of integers, return the k most frequent elements.
 */

import java.util.HashMap;

public class TopKFrequent {

	public int topK(int[] arr) {
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int a : arr) {
			if (hashmap.containsKey(a)) {
				hashmap.put(a, hashmap.get(a) + 1);
			} else {
				hashmap.put(a, 1);
			}
		}

		return 0;

	}
}
