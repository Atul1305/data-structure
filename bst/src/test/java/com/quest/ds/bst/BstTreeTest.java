package com.quest.ds.bst;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.quest.ds.bst.algo.BstBuilder;

import static junit.framework.Assert.*;

public class BstTreeTest {

	@Test
	public void test_Height() {
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
		inputNodeValues.add(10);

		// Then
		BstBuilder bstBuilder = new BstBuilder();
		BstTree bstTree = bstBuilder.buildTree(inputNodeValues);
		
		assertEquals(5, bstTree.height(bstTree.root));
	}

}
