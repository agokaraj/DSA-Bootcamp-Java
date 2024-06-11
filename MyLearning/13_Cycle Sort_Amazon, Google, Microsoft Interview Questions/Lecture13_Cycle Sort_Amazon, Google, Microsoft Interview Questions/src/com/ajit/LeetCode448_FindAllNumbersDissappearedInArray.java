package com.ajit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class LeetCode448_FindAllNumbersDissappearedInArray {
    public static void main(String[] args) {
        int[] arr={1,1};
        List<Integer> result=findDisappearedNumbers(arr);
        System.out.println(result);
    }
    static List<Integer> findDisappearedNumbers(int[] nums){
        int i = 0;
        List<Integer> result=new ArrayList<Integer>();
        while (i < nums.length) {
            int correct = nums[i]-1;
            if (nums[i]-1 < nums.length && nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        // search for first missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index]-1 != index) {
                result.add(index+1);
            }
        }

        // case 2
        return result;
    }
    static List<Integer> findDisappearedNumbers_kunal(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }

        // just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }
    static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp=array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }
}
