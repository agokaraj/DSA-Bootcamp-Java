package com.ajit;
import java.util.Scanner;
public class Functions {
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1=input.nextInt();
        System.out.print("Enter num2:");
        int num2=input.nextInt();
        int result=num1+num2;
        System.out.println("The Sume of both Numbers:"+result);
        input.close();
    }
}