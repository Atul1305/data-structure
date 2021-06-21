package com.quest.ds.bst.algo;

import java.util.ArrayList;
import java.util.List;

import com.quest.ds.bst.Node;

public class AllPossibleTreesFromInorder {
	
	Node node;
	
	public void execute(int in[]) {
        int n = in.length;
        AllPossibleTreesFromInorder tree = new AllPossibleTreesFromInorder();
        List<Node> trees = tree.getTrees(in, 0, n - 1);
        System.out.println("Preorder traversal of different binary trees are:");
        for (int i = 0; i < trees.size(); i++) {
            tree.preOrder(trees.get(i));
            System.out.println("");
        }
	}
	
	private List<Node> getTrees(int arr[], int start, int end){
		List<Node> trees = new ArrayList<>();
		
		if(start > end) {
			trees.add(null);
			return trees;
		}
		
		for (int i = start; i < end; i++) {
			List<Node> lTrees = getTrees(arr, start, i-1);
			List<Node> rTrees = getTrees(arr, i+1, end);
			
			for (int j = 0; j < lTrees.size(); j++) {
				for (int k = 0; k < rTrees.size(); k++) {
					Node node = new Node(arr[i]);
					node.leftChild = lTrees.get(j);
					node.rightChild = rTrees.get(k);
					trees.add(node);
				}
			}
		}
		return trees;
	}
	
	private void preOrder(Node node) {
		if(node != null) {
			System.out.println(node.val + " ");
			preOrder(node.leftChild);
			preOrder(node.rightChild);
		}
	}
}