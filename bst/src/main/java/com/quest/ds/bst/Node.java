package com.quest.ds.bst;

public class Node {
	
	public final Integer val;
	public Integer height;
	public Node rightChild;
	public Node leftChild;
	
	public Node(Integer val) {
		this.val = val;
		this.height = 1;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String rightchildValue = rightChild == null ? "Null": Integer.toString(rightChild.val);
		String leftchildValue = leftChild == null ? "Null": Integer.toString(leftChild.val);
		
		return "Node[ val = "+ val +", leftChildValue = " + leftchildValue + ", rightChildValue = " + rightchildValue + "]";
	}
}