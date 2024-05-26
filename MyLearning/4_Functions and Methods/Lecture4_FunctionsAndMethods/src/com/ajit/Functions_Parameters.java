package com.ajit;
public class Functions_Parameters {
    public static void main(String[] args) {
        int x=sum(10,20);
        System.out.println("The Sum of both Numbers:"+x);
        String greeting=myGreeting("Jack");
        System.out.println("Greeting Message:"+greeting);
    }
    static String myGreeting(String name) {
        return  "how are you "+name;
    }
    static int sum(int num1, int num2){
        int result=num1+num2;
        return result;
    }
}