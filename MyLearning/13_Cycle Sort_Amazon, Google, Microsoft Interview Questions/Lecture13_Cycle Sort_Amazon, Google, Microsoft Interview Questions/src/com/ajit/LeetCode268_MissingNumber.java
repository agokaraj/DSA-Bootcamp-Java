package com.ajit;
public class LeetCode268_MissingNumber {
    public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};
        int result=searchMissingNumber(arr);
        System.out.println(result);
    }
    static int searchMissingNumber(int[] nums) {
        int startIndex=0;
        while(startIndex<=nums.length-1){
            int correctIndex=nums[startIndex];
            if(correctIndex>=nums.length){
                startIndex++;
            }
            else if( nums[startIndex]!=nums[correctIndex]){
                swap(nums,startIndex,nums[startIndex]);
            } else{
                startIndex++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
    public static int missingNumber_kunal(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }
    static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp=array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }
}
