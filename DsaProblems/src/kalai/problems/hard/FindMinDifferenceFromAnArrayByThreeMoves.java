package kalai.problems.hard;

import java.util.Arrays;

public class FindMinDifferenceFromAnArrayByThreeMoves {
      public static void main(String[] args) {
    	 int[] nums = {2,232,32,3421,2232,321,19};
    	 int[] nums1 = {1,2,3,4,5,6,7,8,9,10};
    	 int result =  findMinDifference(nums1);
		 System.out.println("The minimum difference from an array -> "+ result);
	}

	private static int findMinDifference(int[] nums) {
		   if(nums.length<=4)
			   return 0;
		   
		   Arrays.sort(nums);
		   int minDiff = nums[nums.length-1]-nums[0];
		   for(int i = 0;i<4;i++) {
			   minDiff = Math.min(minDiff, nums[(nums.length-4)+i]-nums[i]);
		   }
		return minDiff;
	}
}
