package com.ds;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class StackTest {
private Stack stack;

	@Before
	public void setUp() throws Exception {
		this.stack= new Stack();
	}

	@Test
	public void testPop() {
		this.stack.push(10);
		this.stack.push(20);
		this.stack.push(30);
		this.stack.push(40);
		this.stack.push(50);
		System.out.println("-----1st pop---");
		this.stack.print();
		Assert.assertEquals(50, this.stack.pop());
		System.out.println("-----2nd pop---");
		this.stack.print();
		Assert.assertEquals(40, this.stack.pop());
		System.out.println("-----3rd pop---");
		this.stack.print();
		Assert.assertEquals(30, this.stack.pop());
	}
	
	@Test
	public void testPeek(){
		this.stack.push(10);
		this.stack.push(20);
		this.stack.push(30);
		Assert.assertEquals(30, this.stack.peek());
	}
	
	@Test
	public void testEmpty(){
		Assert.assertEquals(true, this.stack.empty());
	}
	
	@Test
	public void testSearch(){
		this.stack.push(10);
		this.stack.push(20);
		Assert.assertEquals(-1, this.stack.search(30));
	}
}
