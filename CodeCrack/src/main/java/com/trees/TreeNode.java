package com.trees;

public class TreeNode<T> {
	TreeNode<T> right = null;
	TreeNode<T> left = null;
	T data;

	public TreeNode(T data) {
		this.data = data;
	}

}
