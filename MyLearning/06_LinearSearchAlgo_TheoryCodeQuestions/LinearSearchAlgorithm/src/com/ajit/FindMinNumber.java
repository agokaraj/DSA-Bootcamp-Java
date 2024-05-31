package com.ajit;

public class FindMinNumber {
    public static void main(String[] args) {
        int[] arry={18,15,-7,3,14,28};
        int ans=findMin(arry);
        System.out.println("Min number:"+ans);
    }
    
    static int findMin(int[] arry) {
       int result=arry[0];
        for (int i = 0; i < arry.length; i++) {
        if(result>=arry[i]){
            result=arry[i];
        }
       }
       return result;
    }
}
