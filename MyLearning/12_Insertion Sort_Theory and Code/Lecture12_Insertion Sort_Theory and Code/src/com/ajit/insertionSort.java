package com.ajit;
import java.util.Arrays;
public class insertionSort {
    public static void main(String[] args) {
        int[] array={5,3,4,1,2};
        insertionSortAlgo_kunal(array);
        System.out.println(Arrays.toString(array));
    }
    static void insertionSortAlgo(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j <= array.length-1; j++) {
                int x=j;
                while(x>0 && array[x]<array[x-1] ){
                    int temp=array[x];
                    array[x]=array[x-1];
                    array[x-1]=temp;
                    x--; 
                }
                //System.out.println(Arrays.toString(array));
                if(x==0||array[x]>array[x-1]){break;}
            }
        }
    }
    static void insertionSortAlgo_kunal(int[] array) {
         for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(array[j]<array[j-1]){
                    swap(array,j,j-1);
                } else {
                    break;
                }
            }
         }
    }
    static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp=array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }

}
