package com.quest.ds.solution;

public class Solution {
		
	public ListNode reverseLinkedList(ListNode head) {
		ListNode prev = null;
		
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		
		return prev;
	}
	
	public void print(ListNode head) {
		while(head != null) {
			System.out.print(head.val + ",");
			head = head.next;
		}
	}
	
}
