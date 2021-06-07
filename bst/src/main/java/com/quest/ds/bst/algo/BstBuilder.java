package com.quest.ds.bst.algo;

import java.util.List;

import com.quest.ds.bst.BstTree;
import com.quest.ds.bst.Node;

public class BstBuilder {

	private BstTree bstTree;

	public BstBuilder() {
		bstTree = new BstTree();
	}

	public BstTree buildTree(List<Integer> values) {
		if(values == null || values.isEmpty()) {
			return bstTree;
		}
		
		bstTree.root = new Node(values.get(0));

		for (int i = 1; i < values.size(); i++) {
			addNode(bstTree.root, new Node(values.get(i)));
		}

		return bstTree;
	}

	private void addNode(Node root, Node node) {
		traverse(root, node);
	}

	private void traverse(Node currentNode, Node node) {
		if (currentNode.val > node.val) {
			if (currentNode.leftChild == null) {
				currentNode.leftChild = node;
				// System.out.println("Left Child assigned: " + currentNode);
				return;
			} else {
				traverse(currentNode.leftChild, node);
			}
		}

		if (currentNode.val < node.val) {
			if (currentNode.rightChild == null) {
				currentNode.rightChild = node;
				// System.out.println("Right Child assigned: " + currentNode);
				return;
			}else {
				traverse(currentNode.rightChild, node);
			}
		}
	}
}
