package com.ajit;
import java.util.Arrays;
public class LeetCode645_SetMismatch {
    public static void main(String[] args) {
        int[] nums={1,2,2,4};
        int[] res=cyclicSortAlgo_kunal(nums);
        System.out.println(Arrays.toString(res));

    }
    static int[] cyclicSortAlgo_kunal(int[] nums){
        int startIndex=0;
        int[] result=new int[2];
        while(startIndex<nums.length){
            int correctIndex=nums[startIndex]-1;
            if(nums[startIndex]!=nums[correctIndex]){
                swap(nums, startIndex, correctIndex);
            } else{
                startIndex++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                result[0]= nums[i];
                result[1]= i+1;
            }
        }
        return result;
    }
    static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp=array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }
}
