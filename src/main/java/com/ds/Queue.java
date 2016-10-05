package com.ds;

/**
 * Array based implementation of queue. 
 * @author arunponnaiah
 *
 */
public class Queue<T> {
	private T[] queue;
	private int head;
	private int tail;
	private int size;
	
	public Queue(int size) {
		this.size = size;
		queue = (T[]) new Object[size];
		head = -1;
		tail = -1;
	}
	
	/**
	 * Add an element in to queue.
	 * @param data
	 */
	public void enQueue(T element){
		if(tail >= this.size  ){
			throw new IllegalStateException("Queue is full");
		}
		if(head ==-1)
			head++;
		tail++;
		queue[tail]=element;
	}
	
	/**
	 * Remove an element from queue.
	 * @return
	 */
	public T deQueue(){
		if(head == -1){
			throw new IllegalStateException("Queue is empty");
		}
		T headVal = queue[head];
		queue[head] = null;
		head++;
		this.size--;
		return headVal;
	}
	
	/**
	 * Returns head element of queue.
	 * @return
	 */
	public T peek(){
		if(head == -1){
			throw new IllegalStateException("Queue is empty");
		}
		return queue[head];
	}
	
	/**
	 * print all elements in queue.
	 */
	public void print(){
		if(head == -1){
			throw new IllegalStateException("Queue is empty");
		}
		System.out.println("--------printing queue-------");
		for(int i=head;i<=tail;i++){
			System.out.println(queue[i].toString());
		}
	}
	
	/**
	 * Returns size of queue.
	 * @return
	 */
	public int size(){
		return tail;
	}
}
