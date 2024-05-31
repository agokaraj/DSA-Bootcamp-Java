package com.ajit;

import java.util.Arrays;

public class LeetCode_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target=9;
        int[] ans=twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] nums, int target) {
        int firstIndex=-1;
        int secondIndex=-1;
        for (int i = 0; i < nums.length; i++) {
            int temp=target-nums[i];
            firstIndex=i;
            secondIndex=checkIfNumExists(temp,i,nums);
            if(secondIndex>0){break;}
        }
        return new int[]{firstIndex,secondIndex};
    }
    static int checkIfNumExists(int temp, int i,int[] nums) {
        for (int j = i+1; j < nums.length; j++) {
            if(temp==nums[j]){
                return j;
            }
        }
        return -1;
    }
}
