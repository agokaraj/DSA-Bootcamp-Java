package com.ajit;

import java.util.Arrays;

public class Arrays_ReverseTheArray {
    public static void main(String[] args) {
        int[] ary={1,2,4,5,6,7};
        System.out.println("Initial Array:"+Arrays.toString(ary));
        reverseArray(ary);
        System.out.println("Swapped Array:"+Arrays.toString(ary));
    }

    private static void reverseArray(int[] ary) {
        int start=0;
        int end=ary.length-1;
        int iterationnumber=(ary.length/2)+(ary.length%2==0?0:1);
        for (int i = 0; i < iterationnumber; i++) {
            swap(ary,start,end);
            start++;
            end--;
            if(start==end){break;}
        }
    }

    private static void swap(int[] ary, int i, int j) {
        int temp=ary[i];
        ary[i]=ary[j];
        ary[j]=temp;
    }
}
