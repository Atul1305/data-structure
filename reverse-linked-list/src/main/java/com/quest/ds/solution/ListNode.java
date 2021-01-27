package com.quest.ds.solution;

public class ListNode {
	int val;
	public ListNode next;
	
	public ListNode(int x) {
		val = x;
	}
	
	@Override
	public String toString() {
		return val + ",";
	}
}
