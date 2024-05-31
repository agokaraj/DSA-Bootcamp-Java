package com.ajit;

import java.util.Arrays;

class LeetCode_SingleNumber260{
    public static void main(String[] args) {
    int[] nums = {1,2,1,3,2,5};
    int[] answer=singleNumber(nums);
    System.out.println(Arrays.toString(answer));
    }
    static int[] singleNumber(int[] nums) {
        if(nums.length==2){return nums;}
        int[] x={0,0};
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(!sameDigitExists(nums, i, nums[i]) && count<2){
                x[count]=nums[i];
                count++;
            }
        }
        return x;
    }
    static boolean sameDigitExists(int[] nums,int startIndex, int search){
        boolean result=false;
        for (int i_sub = 0; i_sub < nums.length; i_sub++) {

           if(nums[i_sub]==search && i_sub!=startIndex){return true;}
        }
        return result;
    }
}