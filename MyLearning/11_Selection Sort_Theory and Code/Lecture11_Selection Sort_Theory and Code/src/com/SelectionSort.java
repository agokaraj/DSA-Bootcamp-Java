package com;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] array={5,-44,333,2,1};//{3,1,5,4,2};
        selectionSortAlgo(array);
        System.out.println(Arrays.toString(array));
        //System.out.println(getMaxElement(array, 0, array.length-1));
        //swap(array, 1, 2);
        //System.out.println(Arrays.toString(array));
    }
    static void selectionSortAlgo(int[] array){
        for (int i = 0; i < array.length; i++) {
            //find the max item in the remaining array and swap
            //with correct index
            int lastIndex=array.length-i-1;
            int startIndex=0;
            int maxIndex=getMaxElement(array,startIndex,lastIndex);
            swap(array,lastIndex,maxIndex);
        }
    }
    static int getMaxElement(int[] array, int startIndex, int lastIndex) {
        /*Return the position of the max value */
        int max=startIndex;
        for (int i = startIndex; i <= lastIndex; i++) {
            if(array[i]>array[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] array,int firstIndex, int secondIndex){
        int temp=array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }
}
