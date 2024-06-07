package com.ajit;
public class LeetCode852 {
    public static void main(String[] args) {
        int[] nums={0,3,5,12,2};//{1,2,4,7,6,3,2};
        int result=peakIndexInMountainArray(nums);
        System.out.println(result);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start=0;int end=arr.length-1;
        int result=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            if(start==end){result= start;break;}
        }
        return result;
    }
}
