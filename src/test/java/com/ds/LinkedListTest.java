package com.ds;

import org.junit.Before;
import org.junit.Test;

import com.ds.LinkedList;

import junit.framework.Assert;

public class LinkedListTest {
	private LinkedList linkedList;
	
	@Before
	public void setUp() throws Exception {
		this.linkedList = new LinkedList();
		this.linkedList.push(1);
		this.linkedList.push(2);
		this.linkedList.push(3);
		this.linkedList.push(4);
		this.linkedList.push(5);
	}
	

	@Test
	public void testGetLength() {
		Assert.assertEquals(5, this.linkedList.getLength());
	}
	
	@Test
	public void testFindNthElement() {
		Assert.assertEquals(4,linkedList.get(3).getData());
	}
}