package com.ajit;

public class LeetCode2540_MinimumCommonValue {
    public static void main(String[] args) {
        int[] nums1={1,2,3,6};
        int[] nums2={3,4,5};
        int result=getCommon(nums1, nums2);
        System.out.println(result);
    }
    static int getCommon(int[] nums1, int[] nums2) {
        int[] big; int[] small; boolean found;
        if(nums1.length>nums2.length){
            big=nums1;
            small=nums2;
        }else{
            small=nums1;
            big=nums2;
        }
        for (int i = 0; i < small.length; i++) {
            found=binarySearch(big, small[i]);
            if(found){
                return small[i];
            }
        }
        return -1;
    }

    static boolean binarySearch(int[] nums, int target){
        int start=0;int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}
