package com.trees;

import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/** -s
 * Implement a merging iterator iter1: 1 2 2 3 4 <- sorted 
 * iter2: 1 1 1 2 5 <-sorted
 * iter3: 0 7 
 * iter4: 2 2 4 6 ..... 
 * Merging Iterator: 1 1 1 1 2 2 3 4 5 0
 * 1 1
 */
public class MergingIterator implements Iterator {

	List<Iterator<Integer>> iters;

	PriorityQueue<Integer> values;

	public MergingIterator(List<Iterator<Integer>> iters) {

		this.iters = iters;

		for (Iterator<Integer> iter : iters) {
			if(iter.hasNext()) {
			values.offer(iter.next());
			}
		}

	}

	@Override
	public boolean hasNext() {
		Boolean result=false;
	 if(values.peek()!=null) {
		 result=true;
	 }
	 return result;
	}

	@Override
	public Integer next() {
		return values.poll();
	}

}
