package com.ajit;

import java.util.Arrays;

public class PassByValue_2 {
    public static void main(String[] args) {
        int[] ary={1,3,4,5,6};
        change(ary);
        System.out.println(Arrays.toString(ary));
    }
    private static void change(int[] xxx) {
        xxx[0]=99;
    }
}
