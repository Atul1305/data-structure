package com.quest.ds.bst.algo;

import org.junit.Test;

public class WritePostorderFromInAndPreorderTest {

	@Test
	public void test() {
		WritePostorderFromInAndPreorder testClass = new WritePostorderFromInAndPreorder();
		int inorder[] = { 4, 2, 5, 1, 3, 6 };
		int preorder[] = { 1, 2, 4, 5, 3, 6 };
		int n = inorder.length;
		System.out.println("Postorder traversal " );
		testClass.printPostOrder(inorder, preorder, n);
	}

}
