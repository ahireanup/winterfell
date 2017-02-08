package com.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
	
	public ArrayList<Integer> traverseLevelOrder(TreeNode<Integer> root) {
		if(root ==null) return null;
		
		Queue <TreeNode<Integer>> queue = new LinkedList<TreeNode<Integer>>();
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			TreeNode <Integer> current =queue.remove();
			results.add(current.data);
			if(current.left!=null)
				queue.add(current.left);
			if(current.right!=null)
				queue.add(current.right);	
		}
		return results;
		
	}

	public static void main (String [] args) {
		
		TreeNode<Integer> root = new TreeNode<Integer>(1);

		root.left = new TreeNode<Integer>(2);
		root.right = new TreeNode<Integer>(3);

		root.left.left = new TreeNode<Integer>(4);
		root.left.right = new TreeNode<Integer>(5);

		root.right.left = new TreeNode<Integer>(6);
		root.right.right = new TreeNode<Integer>(7);

		LevelOrder lo = new LevelOrder ();
		ArrayList <Integer> results = lo.traverseLevelOrder(root);
		for (int i : results) {
			System.out.print (i + " ");		
		}
		
	}
}
