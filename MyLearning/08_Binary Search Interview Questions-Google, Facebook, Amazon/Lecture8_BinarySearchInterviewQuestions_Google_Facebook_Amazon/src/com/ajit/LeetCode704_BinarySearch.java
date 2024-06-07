package com.ajit;

class LeetCode704_BinarySearch{
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target=19;
        int result=binarySearch(nums,target);
        System.out.println(result);        
    }

     static int binarySearch(int[] nums, int target) {
        int start=0;int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            } else if(nums[mid]>target){
                end=end-1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}