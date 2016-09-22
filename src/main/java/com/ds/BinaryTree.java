package com.ds;

/**
 * Custom binary tree.
 * @author aponnaia
 *
 */
public class BinaryTree {
	private Node root;
	
	
	/**
	 * Constuctor to initialize root node
	 * @param data
	 */
	public BinaryTree(int data) {
		this.root = new Node(data);
	}
	
	/**
	 * Add new node to left / right depends on supplied value
	 * @param data
	 */
	public void add(int data)
    {
		Node node = new Node(data);
		Node parentNode = searchForParentNode(this.root,data);
		if(parentNode.getData() < data){
			parentNode.setLeft(node);
		}else{
			parentNode.setRight(node);
		}
    }
	
	/**
	 * Search node to insert new node
	 * @param node
	 * @param data
	 * @return
	 */
	private Node searchForParentNode(Node node , int data) {
		if(node.getData() < data && node.getLeft() != null){
			return searchForParentNode(node.getLeft(),data);
		}else if(node.getData() > data && node.getRight() != null){
			return searchForParentNode(node.getRight(),data);
		}else {
			return node;
		}
	}

	/**
	 * Node data structure to store data with left & right node
	 * @author aponnaia
	 *
	 */
	class Node{
		private int data;
	    private Node left;
	    private Node right;
	    Node (int data) {
	        this.data = data;
	        right = null;
	        left = null;
	    }
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
	}
	
}
