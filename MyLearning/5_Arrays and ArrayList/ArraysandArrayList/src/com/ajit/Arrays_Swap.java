package com.ajit;

import java.util.Arrays;

public class Arrays_Swap {
    public static void main(String[] args) {
        int[] ary={1,2,4,5,6};
        System.out.println("Initial Array:"+Arrays.toString(ary));
        swap(ary,1,3);/*Swap the element at index1 with element at index3 */
        System.out.println("After Swap Array:"+Arrays.toString(ary));
    }
    private static void swap(int[] ary, int i, int j) {
        int temp=ary[i];
        ary[i]=ary[j];
        ary[j]=temp;
    }
}
