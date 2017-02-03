package com.linkedlist;

public class LinkedList {
	public Node<Integer> head;
	public int listSize;

	LinkedList() {
		head = new Node<Integer>(0);
		listSize = 0;
	}

	public void add(int data) {
		Node<Integer> current = head;

		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node<Integer>(data);
		listSize++;
	}

	public void add(int data, int index) {

	}
}
