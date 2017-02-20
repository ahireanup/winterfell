package com.trees;
/*
 * Given a non-empty array of integers, return the k most frequent elements.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Pair {
	int num;
	int count;

	public Pair(int num, int count) {
		this.num = num;
		this.count = count;
	}
}

public class TopKFrequent {

	public static List<Integer> topK(int[] arr, int k) {
		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int a : arr) {
			if (hashmap.containsKey(a)) {
				hashmap.put(a, hashmap.get(a) + 1);
			} else {
				hashmap.put(a, 1);
			}
		}

		PriorityQueue<Pair> minHeap = new PriorityQueue<Pair>(new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				return o1.count - o2.count;
			}

		});
		for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
			Pair p = new Pair(entry.getKey(), entry.getValue());
			minHeap.offer(p);
		}

		List<Integer> result = new ArrayList<Integer>();

		while (k > 0) {
			result.add(minHeap.poll().num);
			k--;

		}
		return result;

	}

	public static void main(String[] args) {

		int[] a = { 4, 4, 4, 8, 8, 1, 1, 1, 1, 6, 6, 6, 6, 6, 6, 6, 7, 7, 2 };

		List<Integer> result = topK(a, 2);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));

		}

	}
}
