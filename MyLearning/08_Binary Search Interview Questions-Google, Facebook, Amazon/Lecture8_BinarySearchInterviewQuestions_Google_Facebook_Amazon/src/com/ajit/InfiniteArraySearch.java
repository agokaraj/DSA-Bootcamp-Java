package com.ajit;
public class InfiniteArraySearch {
    public static void main(String[] args) {
        int[] ary={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        int target=11;
        int result=searchArray(ary,target);
        System.out.println(result);
    }
    private static int searchArray(int[] ary, int target) {
        int start=0;
        int end=1;
        while(target>ary[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(ary,target,start,end);
    }
    private static int binarySearch(int[] ary, int target, int start, int end) {
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ary[mid]==target){
                return mid;
            }else if(ary[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;   
    }
}
