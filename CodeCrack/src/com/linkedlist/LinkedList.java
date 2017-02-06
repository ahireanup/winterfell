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

		Node<Integer> current = head;
		int count = 0;
		while (count < index - 1) {
			current = current.next;
			count++;
		}

		Node<Integer> newNode = new Node<Integer>(data);
		newNode.next = current.next;
		current.next = newNode;
		listSize++;

	}

	public static void main(String[] args) {

	}
}
