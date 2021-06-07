package com.quest.ds.bst;

public class BstTree {
	public Node root;
	
	public int height(Node node) {
		if(node == null)
			return 0;
		
		return max(height(node.rightChild) + 1, height(node.leftChild) + 1);
	}

	private int max(int rightTreeHeight, int leftTreeHeight) {
		return rightTreeHeight >= leftTreeHeight ? rightTreeHeight : leftTreeHeight;
	}
}