package com.ds;

import org.junit.Test;

import junit.framework.Assert;

public class QueueTest {
	private Queue<Integer> queue;
	
	@Test
	public void testEnQueue() {
		this.queue = new Queue<Integer>(5);
		this.queue.enQueue(10);
		this.queue.enQueue(20);
		this.queue.enQueue(30);
		this.queue.enQueue(40);
		this.queue.enQueue(50);
		//this.queue.print();
	}
	
	@Test
	public void testDeQueue(){
		this.queue = new Queue<Integer>(5);
		this.queue.enQueue(10);
		this.queue.enQueue(20);
		this.queue.enQueue(30);
		this.queue.enQueue(40);
		this.queue.enQueue(50);
		Assert.assertEquals(10,this.queue.deQueue().intValue());
		this.queue.print();
	}
	
	@Test
	public void testPeek(){
		this.queue = new Queue<Integer>(5);
		this.queue.enQueue(10);
		this.queue.enQueue(20);
		this.queue.enQueue(30);
		this.queue.enQueue(40);
		this.queue.enQueue(50);
		Assert.assertEquals(10,this.queue.peek().intValue());
	}

}
