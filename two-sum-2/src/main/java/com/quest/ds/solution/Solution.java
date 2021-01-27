package com.quest.ds.solution;

public class Solution {

	// Don't handle negative test cases.
	public static int[] twoSum(int[] numbers, int target) {
		int aPointer = 0;
		int bPointer = numbers.length - 1;
		
		while(aPointer <= bPointer) {
			int sum = numbers[aPointer] + numbers[bPointer];
			
			if(sum > target) {
				bPointer -= 1;
			}else if(sum < target) {
				aPointer += 1;
			}else {
				return new int[] {aPointer+1, bPointer+1};
			}
		}

		return new int[] {aPointer+1, bPointer+1};
	}
	
	public static int[] twoSumWithNegativeHandling(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i] + numbers[j] == target) {
					return new int[] {i+1, j+1};
				}
			}
		}

		return new int[] {-1, -1};
	}
}
