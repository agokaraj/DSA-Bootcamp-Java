package com.ajit;

public class LeetCode33_SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={3,1};//{6,7,0,1,2,3,4,5};
        int pivot=nums.length==1?0:findPeakRotated(nums);
        System.out.println(pivot);
        int target=0;
        int result=-1;
        if(pivot==-1){
            /*Normal Binary Search */
            result=binarySearch(nums, target, 0, nums.length-1, true);
        }else{
            /*if pivot is found, we have to search two ascending sorted arrays*/
            /*Case1:Pivot element itself is the target */
            if(nums[pivot]==target){result=pivot;}
            /*case2: target>start */
            else if(target>=nums[0]){result=binarySearch(nums, target, 0, pivot-1, true);}
            /*case3: target<start */
            else if(target<nums[0]){result=binarySearch(nums, target,pivot+1 , nums.length-1, true);}
        }
        System.out.println(result);
    }

    static int findPeakRotated(int[] nums) {
        int start=0; int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid < end && nums[mid]>nums[mid+1])
                {return mid;}
            else if(mid > start && nums[mid-1]>nums[mid])
                {return mid-1;}
            else if(nums[start]>nums[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] array, int target, int start, int end,boolean sortedAsc){
        if(array.length==1){
            return array[0]==target?0:-1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if((array[mid]>target && sortedAsc)||(array[mid]<target && !sortedAsc)){
                end=mid-1;
            }else if((array[mid]<target && sortedAsc)||(array[mid]>target && !sortedAsc)){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
