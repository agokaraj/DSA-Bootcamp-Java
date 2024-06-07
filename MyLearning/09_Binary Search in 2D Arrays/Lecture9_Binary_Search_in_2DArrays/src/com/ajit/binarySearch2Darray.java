package com.ajit;
import java.util.Arrays;
public class binarySearch2Darray {
    public static void main(String[] args) {
        int[][] nums={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target=50;
        int[] result=binarySearch_2Darray(nums,target);
        System.out.println(Arrays.toString(result) );
    }
   static int[] binarySearch_2Darray(int[][] nums, int target) {
       int row=0;
       int col=nums.length-1;
       while(row<nums.length && col>=0){
            if(nums[row][col]==target){
                return new int[]{row,col};
            }
            if(nums[row][col]<target){
                row++;
            }
            if(nums[row][col]>target){
                col--;
            }
       }
       return new int[]{-1,-1};
    }
}
