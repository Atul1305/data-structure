package com.quest.ds.bst.algo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.quest.ds.bst.BstTree;

public class TraverseWithStackTest {

	@Test
	public void test() {
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
		
		TraverseWithStack traverseWithStack = new TraverseWithStack();
		traverseWithStack.traverse(bstTree);
	}

}
