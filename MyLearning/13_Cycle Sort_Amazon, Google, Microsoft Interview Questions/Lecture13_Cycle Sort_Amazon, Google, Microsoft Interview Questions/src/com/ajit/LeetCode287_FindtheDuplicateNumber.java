package com.ajit;
public class LeetCode287_FindtheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        int result=findDuplicates_cyclicSort_kunal(nums);
        //System.out.println(Arrays.toString(nums));
        System.out.println(result);
    }
    static int findDuplicates_cyclicSort(int[] nums) {
        int firstIndex=0;
            while(firstIndex<nums.length){
                int correctIndex=nums[firstIndex]-1;
                if(nums[firstIndex]!=nums[correctIndex]){
                    swap(nums,firstIndex,correctIndex);
                }else{
                    firstIndex++;
                } 
            }
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]!=i+1){
                    return nums[i];
                }
            }
            return -1;
    }
    static int findDuplicates_cyclicSort_kunal(int[] nums) {
        int firstIndex=0;
            while(firstIndex<nums.length){
                if(nums[firstIndex]!=firstIndex+1){
                    int correctIndex=nums[firstIndex]-1;
                    if(nums[firstIndex]!=nums[correctIndex]){
                        swap(nums,firstIndex,correctIndex);
                    }else{
                       return nums[firstIndex];
                    } 
                }else{
                    firstIndex++;
                }
            }
            return -1;
    }
    static void swap(int[] nums, int i, int correctIndex) {
        int temp=nums[i];
        nums[i]=nums[correctIndex];
        nums[correctIndex]=temp;
    }
    
}
