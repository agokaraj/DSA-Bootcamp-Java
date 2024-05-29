package com.ajit;

import java.util.Arrays;

public class Arrays_2D {
    public static void main(String[] args) {
        int[][] numArray=   {
                                {1,2,3},//0th index -->numArray[0]
                                {4,5},//1st index -->numArray[1]
                                {6,7,8,9}//2nd index -->numArray[2]
                            };
         for (int i = 0; i < numArray.length; i++) {
            //numArray.length-->rows in 2d Array
            System.out.println(Arrays.toString(numArray[i]));
         }                
    }
}
