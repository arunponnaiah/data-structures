package com.ds.list;
/**
 * Custom linked list implementation.
 * @author aponnaia
 */
public class LinkedList {
	private Node head;
	
	/**
	 * Insert in to linkedlist
	 * @param data
	 */
	public void push(int data){
		Node node = new Node(data);
		if(head == null)
			head =node;
		else{
			Node lastElement = findLastElement(head);
			lastElement.setNext(node);
		}
			
	}
	
	/**
	 * Function to find last element in linkedlist is to check if node.next is null.
	 */
	private Node findLastElement(Node node) {
		if(node.getNext() == null )
			return node;
		else{
			Node nextNode = node.getNext();
			return findLastElement(nextNode);
		}
	}

	/**
	 * High level method to print data in all nodes.
	 */
	public void printAll(){
		print(head);
		
	}

	/**
	 * Iterate list to print data in each node.
	 * @param node
	 */
	private void print(Node node) {
		System.out.println(node.getData());
		if(node.getNext() != null){
			print(node.getNext());
		}
	}
	
	
	/**
	 * Main method to add nodes to linked list and print them all.
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		
		list.printAll();
	}
}
