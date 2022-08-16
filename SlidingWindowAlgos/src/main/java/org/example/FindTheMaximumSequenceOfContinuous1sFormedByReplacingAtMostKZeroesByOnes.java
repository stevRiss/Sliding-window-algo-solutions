package org.example;

public class FindTheMaximumSequenceOfContinuous1sFormedByReplacingAtMostKZeroesByOnes {
    public int longestOnes(int[] nums, int k) {
        int start = 0, max = 0, maxCount = 0;
        for(int end = 0; end < nums.length; end++){
            if(nums[end] == 1)
                maxCount++;

            if(end - start + 1 - maxCount > k){
                if(nums[start] == 1)
                    maxCount--;
                start++;
            }
            max = Math.max(max, end - start + 1);
        }
        return max;

    }
}
