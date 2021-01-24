package com.quest.algo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.quest.algo.solution.Solution;

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
    	char[][] grid = new char[][]{ {'1','1','0','0','0'},
           							  {'1','1','0','1','0'},
           							  {'1','1','0','0','0'},
           							  {'0','0','0','0','0'}};
            
         int result = Solution.numIslands(grid);
            
        assertTrue(result == 2);
    }
    
    @Test
    public void shouldAnswerWithTrue2()
    {
    	char[][] grid = new char[][]{ {'1','1','0','0','0'},
           							  {'1','1','1','1','0'},
           							  {'1','1','0','0','0'},
           							  {'0','0','0','0','0'}};
            
         int result = Solution.numIslands(grid);
            
        assertTrue(result == 1);
    }
    
    @Test
    public void shouldAnswerWithTrue3()
    {
    	char[][] grid = new char[][]{ {'1','0','1','0','0'},
           							  {'1','0','1','1','0'},
           							  {'1','1','0','0','0'},
           							  {'0','0','0','1','1'}};
            
         int result = Solution.numIslands(grid);
            
        assertTrue(result == 3);
    }
}
