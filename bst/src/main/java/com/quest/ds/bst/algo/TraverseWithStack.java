package com.quest.ds.bst.algo;

import java.util.Stack;

import com.quest.ds.bst.BstTree;
import com.quest.ds.bst.Node;

public class TraverseWithStack {

	private Stack<Node> stack;

	public TraverseWithStack() {
		stack = new Stack<>();
	}

	public void traverse(BstTree bstTree) {
		Node currentNode = bstTree.root;

		while (currentNode != null || stack.size() > 0) {
			while (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.leftChild;
			}
			currentNode = stack.pop();
			
			System.out.println(currentNode.val);
			
			currentNode = currentNode.rightChild;
		}

	}
}
