package com.ds;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {
	private BinaryTree binaryTree;

	@Before
	public void setUp() throws Exception {
		this.binaryTree = new BinaryTree(10);
	}

	@Test
	public void testAddNewNode() {
		this.binaryTree.add(5);
		this.binaryTree.add(7);
		this.binaryTree.add(15);
		this.binaryTree.add(17);
	}

}
