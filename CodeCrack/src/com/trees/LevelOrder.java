package com.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
	
	public ArrayList<Integer> traverseLevelOrder(Node root) {
		if(root ==null) return null;
		
		Queue <Node> queue = new LinkedList<Node>();
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node current =queue.remove();
			results.add(current.data);
			if(current.left!=null)
				queue.add(current.left);
			if(current.right!=null)
				queue.add(current.right);
			
		}
		return results;
		
	}

	public static void main (String [] args) {
		
		Node root = new Node(1);

		root.left = new Node(2);
		root.right = new Node(3);

		root.left.left = new Node(4);
		root.left.right = new Node(5);

		root.right.left = new Node(6);
		root.right.right = new Node(7);

		LevelOrder lo = new LevelOrder ();
		ArrayList <Integer> results = lo.traverseLevelOrder(root);
		for (int i : results) {
			System.out.print (i + " ");
			
		}
		
	}
}
