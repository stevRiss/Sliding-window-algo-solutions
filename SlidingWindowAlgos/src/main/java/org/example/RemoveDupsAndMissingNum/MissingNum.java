package org.example.RemoveDupsAndMissingNum;

public class MissingNum {
    public int missingNumber(int[] nums){
        int series = (nums.length) * (nums.length +1)/2;
        int sum = 0;
        for(int num : nums)
            series += sum;
        return sum - series;



    }
}
