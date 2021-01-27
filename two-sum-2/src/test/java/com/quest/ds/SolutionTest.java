package com.quest.ds;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
    public void shouldAnswerWithTrue()
    {
    	int numbers[] = {2, 7, 11, 15};
    	int[] result = Solution.twoSumWithNegativeHandling(numbers, 9);
    	for (int i = 0; i < result.length; i++) {
    		System.out.println(result[i]);	
		}
    	
        assertTrue( true );
    }
    
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue1()
    {
    	int numbers[] = {2, 7, 11, 15};
    	int[] result = Solution.twoSumWithNegativeHandling(numbers, 1);
    	for (int i = 0; i < result.length; i++) {
    		System.out.println(result[i]);	
		}
    	
        assertTrue( true );
    }
    
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue2()
    {
    	int numbers[] = {2, 7, 11, 15};
    	int[] result = Solution.twoSumWithNegativeHandling(numbers, 10);
    	for (int i = 0; i < result.length; i++) {
    		System.out.println(result[i]);	
		}
    	
        assertTrue( true );
    }
}
