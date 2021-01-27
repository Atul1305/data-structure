package com.quest.ds;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.quest.ds.solution.ListNode;
import com.quest.ds.solution.Solution;

/**
 * Unit test for simple App.
 */
public class SolutionTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue1()
    {
    	ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        
        ListNode result = new Solution().reverseLinkedList(head);
        
        new Solution().print(result);
    	assertTrue( true );
    }
}
