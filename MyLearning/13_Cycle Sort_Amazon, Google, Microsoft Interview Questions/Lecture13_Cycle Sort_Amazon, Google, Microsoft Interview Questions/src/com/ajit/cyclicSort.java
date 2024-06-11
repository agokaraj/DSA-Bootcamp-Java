package com.ajit;
import java.util.Arrays;
public class cyclicSort {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        cyclicSortAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSortAlgo(int[] array) {
        int startIndex=0;
        while(startIndex<=array.length-1){
            if(array[startIndex]==startIndex+1){
                startIndex++;
            } else{
                swap(array,startIndex,array[startIndex]-1);
            }
        }
    }
    static void cyclicSortAlgo_kunal(int[] array){
        int startIndex=0;
        while(startIndex<array.length){
            int correctIndex=array[startIndex]-1;
            if(array[startIndex]!=array[correctIndex]){
                swap(array, startIndex, correctIndex);
            } else{
                startIndex++;
            }
        }
    }
    static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp=array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }
}
