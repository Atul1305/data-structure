package com.quest.PascalTriangle;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.quest.PascalTriangle.solution.Solution;

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
        Solution solution = new Solution();
        List<List<Integer>> result = solution.generate(2);
        System.out.println(result);
    	assertTrue( true );
    }
    
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue1()
    {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.generate(5);
        System.out.println(result);
    	assertTrue( true );
    }
}
