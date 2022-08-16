package org.example;

public class SmallestSubarrayLengthWhoseSumIsGreaterThan10 {
    public int minSubArrayLen(int target, int[] nums) {
        // length of num array
        int n = nums.length;
        // store max int value to act as placeholder
        int lengthSmallArr = Integer.MAX_VALUE;
        //int for sum and window start
        int sum = 0;
        int start = 0;

        //loop through array
        for(int end = 0; end < n; end++){
            //with every new loop add the current array element to the sum
            sum += nums[end];

            //while the sum is not greater than or equal to th target
            while(sum >= target){
                //see if the current smallest array is, smaller than the new one
                lengthSmallArr = Math.min(lengthSmallArr, end-start+1);
                //subtract the num at start of window from sum and slide window
                sum -= nums[start];
                //sliding window
                start++;
            }
        }
        //ternay: if our lengthSmallArr is still equal to our placeholer, return 0, otherwise returnt eh length
        return lengthSmallArr == Integer.MAX_VALUE ? 0 : lengthSmallArr;
    }
}
