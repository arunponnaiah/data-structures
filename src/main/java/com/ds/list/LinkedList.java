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
	 * find nth element
	 */
	public Node get(int index){
		int count =0;
		return get(head,count,index);
	}
	
	
	/**
	 * Iterator to iterate over LinkedList
	 * @param node
	 * @param count
	 * @param index
	 * @return
	 */
	private Node get(Node node,int count,int index) {
		if(node==null || count== index)
			return node;
		count++;
		return get(node.getNext(),count,index);
	}
	
	/**
	 * Returns length of list
	 * @return
	 */
	public int getLength(){
		int length=0;
		return this.iterate(head,length);
		
	}

	
	/**
	 * Iterator function to assist getLength() function
	 * @return
	 */
	private int iterate(Node node, int length) {
		if(node ==null)
			return length;
		length++;
		return iterate(node.getNext(), length);
	}
}
