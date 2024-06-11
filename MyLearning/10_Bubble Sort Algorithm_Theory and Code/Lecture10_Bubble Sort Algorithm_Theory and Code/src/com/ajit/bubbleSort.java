package com.ajit;
import java.util.Arrays;
public class bubbleSort {
    public static void main(String[] args) {
        int[] array={3,1,5,4,2};
        bubbleSortAlgo(array);//bubbleSortAlgo_kunal(array);
        System.out.println(Arrays.toString(array));
    }
    static void bubbleSortAlgo_kunal(int[] array){
        boolean swapped;
        //run the steps/pass- n-1 times
        for (int i = 0; i < array.length; i++) {
            swapped=false;
            for (int j = 1; j < array.length-i; j++) {
                //swap if the item is smaller than the previous item
                if(array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    swapped=true;
                }
            }
            //if we did not swap for a particular value of i, it 
            //means the array is sorted and it can be stop
            if(!swapped){break;}
        }
    }
    static void bubbleSortAlgo(int[] array){
        int passes=array.length-1;
        for (int i = 0; i < passes; i++) {
            int j=1;boolean swap=false;
            while(j<array.length-i){
                if(array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    swap=true;
                }
                j++;
            }
            if(swap==false){break;}
        }
    }
}
