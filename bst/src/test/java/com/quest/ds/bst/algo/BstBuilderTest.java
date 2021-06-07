package com.quest.ds.bst.algo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.quest.ds.bst.BstTree;
import com.quest.ds.bst.Node;

public class BstBuilderTest {

	@Test
	public void test_BstBuilt() {
		// Given
		List<Integer> inputNodeValues = new ArrayList<>();
		inputNodeValues.add(2);
		inputNodeValues.add(0);
		inputNodeValues.add(-1);
		inputNodeValues.add(4);
		inputNodeValues.add(3);
		inputNodeValues.add(7);
		inputNodeValues.add(1);
		inputNodeValues.add(8);

		// Then
		BstBuilder bstBuilder = new BstBuilder();
		BstTree bstTree = bstBuilder.buildTree(inputNodeValues);

		// Verify
		Node resultNode = verify(bstTree.root, new Node(4));

		System.out.println(resultNode);

	}

	private Node verify(Node currentNode, Node node) {
		return traverse(currentNode, node);
	}

	private Node traverse(Node currentNode, Node node) {
		Node foundNode = null;
		if (currentNode.val == node.val) {
			foundNode = currentNode;
		} else {
			if (currentNode.leftChild != null) {
				foundNode = traverse(currentNode.leftChild, node);
			}
			if (currentNode.rightChild != null) {
				foundNode = traverse(currentNode.rightChild, node);
			}
		}
		
		return foundNode;
	}

}
