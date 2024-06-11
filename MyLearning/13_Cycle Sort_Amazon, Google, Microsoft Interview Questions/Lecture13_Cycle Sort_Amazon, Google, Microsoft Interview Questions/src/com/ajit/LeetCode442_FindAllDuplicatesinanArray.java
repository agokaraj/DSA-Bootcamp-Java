package com.ajit;
import java.util.ArrayList;
import java.util.List;
public class LeetCode442_FindAllDuplicatesinanArray {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> result=findDuplicates_cyclicSort_kunal(nums);
        System.out.println(result);
    }
    static List<Integer> findDuplicates_cyclicSort_kunal(int[] nums) {
        int startIndex=0;
        List<Integer> result=new ArrayList<Integer>();
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
                result.add(nums[i]) ;
            }
        }    
            return result;
    }
    static void swap(int[] nums, int i, int correctIndex) {
        int temp=nums[i];
        nums[i]=nums[correctIndex];
        nums[correctIndex]=temp;
    }
}
