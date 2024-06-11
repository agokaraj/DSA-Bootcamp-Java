package com.ajit;
import java.util.Arrays;
public class LeetCode41_FirstMissingPostive {
    public static void main(String[] args) {
        int[] nums={3,4,-1,1};
        int res=firstMissingPostiveAlgo(nums);
        System.out.println(res);
    }

    static int firstMissingPostiveAlgo(int[] nums){
        int startIndex=0;
        while(startIndex<nums.length){
            int correctIndex=nums[startIndex]-1;
            if(nums[startIndex]>0 && correctIndex<nums.length 
                 && nums[startIndex]!=nums[correctIndex])
                 {         
                swap(nums, startIndex, correctIndex);
                }   else{
                    startIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return -1;
    }
    static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp=array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }
}
