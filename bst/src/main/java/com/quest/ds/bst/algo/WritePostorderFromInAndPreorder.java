package com.quest.ds.bst.algo;

import java.util.Arrays;

public class WritePostorderFromInAndPreorder {
	
	private int search(int[] inorder, int rootValue, int n) {
		for(int i=0; i<n; i++) {
			if(inorder[i] == rootValue) {
				return i;
			}
		}
		return -1;
	}

	public void printPostOrder(int[] inorder, int[] preorder, int n) { 
		int root = search(inorder, preorder[0], n);
		
		if(root != 0) {
			printPostOrder(inorder,
					Arrays.copyOfRange(preorder, 1, n),
					root);
		}
		
		if(root != n-1) {
			printPostOrder(Arrays.copyOfRange(inorder, root+1, n), 
					Arrays.copyOfRange(preorder, 1+root, n),
					n-root-1);
		}
		
		System.out.print(preorder[0] + " ");
	}
}
