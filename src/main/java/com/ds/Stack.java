package com.ds;

/**
 * Stack data structure.
 * @author aponnaia
 *
 */
public class Stack{
	
	Node last;
	
	/**
	 * Add new element in to stack.
	 * @param data
	 */
	public void push(int data){
		Node newNode = new Node(data);
		if(last == null){
			last = newNode;
		}else{
			newNode.next = last;
			last = newNode;
		}
	}
	
	/**
	 * Removes top element from stack.
	 * @return
	 */
	public int pop(){
		int lastVal = last.data;
		last = last.next;
		return lastVal;
	}
	
	/**
	 * returns value from top element.
	 * @return
	 */
	public int peek(){
		return last.data;
	}
	
	/**
	 * returns 1-based index of stack if element exists, else returns -1.
	 */
	public int search(int val){
		Node node = last;
		int index =0;
		while(node != null){
			if(node.data == val){
				index++;
				return index;
			}else{
				node = node.next;
			}
		}
		return -1;
		
	}
	
	/**
	 * check if stack is empty.
	 * @return
	 */
	public boolean empty(){
		if(last == null){
			return true;
		}
		return false;
	}
	
	
	/**
	 * print all elements in stack.
	 */
	
	public void print(){
		Node node = last;
		while(node != null){
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	/**
	 * Node inner class.
	 * @author aponnaia
	 *
	 */
	private class Node{
		private Node next;
		private int data;
		
		Node(int data){
			this.data = data;
		}
	}
	
}
