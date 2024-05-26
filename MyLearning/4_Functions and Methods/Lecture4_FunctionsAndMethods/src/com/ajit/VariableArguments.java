package com.ajit;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        fun(1,2,3,4,6);
        fun2("as","bd","cf","dg");    
    }
    static void fun(int ...m) {
        System.out.println(Arrays.toString(m));
    }
    static void fun2(String ...str){
        System.out.println(Arrays.toString(str));
    }
}
