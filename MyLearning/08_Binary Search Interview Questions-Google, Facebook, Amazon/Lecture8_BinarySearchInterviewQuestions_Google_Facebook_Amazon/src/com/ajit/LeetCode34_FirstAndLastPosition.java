package com.ajit;
import java.util.Arrays;
class LeetCode34_FirstAndLastPosition {   
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,8,8,10,12};int target=8;
        int[] result=searchRange(nums, target);
        //System.out.println(result);
        System.out.println(Arrays.toString(result));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        boolean searchLeft=true;
        result[0]=indexSearch(nums,target,searchLeft);
        if(result[0]!=-1){
        result[1]=indexSearch(nums,target,!searchLeft);}
        return result;
    }
    static int indexSearch(int[] nums, int target, boolean searchLeft) {
        int start=0;int end=nums.length-1;
        int potential=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;}
            else if(nums[mid]>target){
                end=end-1;}
            else{
                potential=mid;
                if(searchLeft){
                    end=mid-1;
                } else if(!searchLeft){
                    start=start+1;}
            }
        }
        return potential;
    }
}