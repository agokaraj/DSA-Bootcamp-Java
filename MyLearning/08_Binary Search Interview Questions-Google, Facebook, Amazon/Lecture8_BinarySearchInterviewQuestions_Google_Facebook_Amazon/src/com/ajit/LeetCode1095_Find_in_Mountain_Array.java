package com.ajit;
public class LeetCode1095_Find_in_Mountain_Array {
    public static void main(String[] args) {
        int[] array = {1,5,2};
        int target=2;
        int peakIndex=findPeakIndex(array);
        System.out.println(peakIndex);
        int leftSearchIndex=searchBinary(array,target,0,peakIndex);
        int rightSearchIndex=searchBinary(array,target,peakIndex,array.length-1);
        System.out.println(leftSearchIndex+"|---|"+rightSearchIndex);
    }
    private static int searchBinary(int[] array, int target, int start, int end) {
        int potential=-1;boolean sortedAsc=false;
        if(array[start]<array[end]){sortedAsc=true;}
        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[mid]==target ){
                 return mid;
                }
            else if((array[mid]>target && sortedAsc)||(array[mid]<target && !sortedAsc)){
                end=mid-1;}
            else if((array[mid]<target && sortedAsc)||(array[mid]>target && !sortedAsc)){
                start=mid+1;}
        }
        return potential;
    }
    private static int findPeakIndex(int[] array) {
       int start=0; int end=array.length-1;
       while(start<=end){
        int mid=start+(end-start)/2;
        if(array[mid]>array[mid+1]){
            end=mid;
        }else{
            start=mid+1;}
        if(start==end){
            return start;}
       }
       return -1;
    }
}
