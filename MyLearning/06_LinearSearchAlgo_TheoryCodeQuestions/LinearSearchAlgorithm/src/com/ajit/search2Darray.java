package com.ajit;

import java.util.Arrays;

public class search2Darray {
    public static void main(String[] args) {
        int[][] ary={
                {23,4,100},
                {18,12,3,9},
                {78,99,34,56},
                {18,121}
            };
        int targert=34;
        boolean ans=searchArray(ary,targert);
        int[] ans2=searchArray2(ary, targert);
        int[] ans3=maxminValue(ary);
        System.out.println("Number found:"+ans);
        System.out.println("Position of the element:"+Arrays.toString(ans2));
        System.out.println("Max and Min value of the Array:"+Arrays.toString(ans3));
     }
    static boolean searchArray(int[][] ary2, int targert2) {
    if(ary2.length==0){
    return false;
    }
    for (int i = 0; i < ary2.length; i++) {
        for (int j = 0; j < ary2[i].length; j++) {
            if(ary2[i][j]==targert2){
                return true;
            };
        }
    }
    return false;
        
    }
    /*Return the position of the Element */
    static int[] searchArray2(int[][] ary2, int targert2) {
        int[] result={-1,-1};
        if(ary2.length==0){
        return result;
        }
        for (int i = 0; i < ary2.length; i++) {
            for (int j = 0; j < ary2[i].length; j++) {
                if(ary2[i][j]==targert2){
                    result[0]=i;
                    result[1]=j;
                    return result;
                };
            }
        }
        //return result;
        return new int[]{-1,-1};//alternative way
            
        }
    static int[] maxminValue(int[][] ary3){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        if(ary3.length==0){
            return new int[]{max,min};
        }
        for ( int row = 0; row < ary3.length; row++) {
            for (int col = 0; col < ary3[row].length; col++) {
                if(ary3[row][col]>=max){
                    max=ary3[row][col];
                }
                if(ary3[row][col]<=min){
                    min=ary3[row][col];
                }
            }
        }
        return new int[]{max,min};
    }             
}
