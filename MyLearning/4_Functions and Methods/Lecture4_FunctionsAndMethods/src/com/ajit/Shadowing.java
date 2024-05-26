package com.ajit;

public class Shadowing {
    static int var=90;//this variable is shadowed at line 7
    public static void main(String[] args) {
        System.out.println(var);//90
        int var;//class variable at line 4 is shadowed by this
        //System.out.println(var);//scope will begin when the value is initialized
        var=50;
        System.out.println(var);//50
        fun();
    }
    private static void fun() {
        System.out.println(var);//90
        //var declared in line7 and initialized at line 9 scope end outside the function
        //here the var used is the class variable declared at line 4
    }
}
