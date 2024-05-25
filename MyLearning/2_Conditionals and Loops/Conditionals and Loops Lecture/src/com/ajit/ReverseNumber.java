package com.ajit;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Value:");
        Integer num=input.nextInt();
        int result=0;
        while (num>0){
            int x=num%10;
            result=(result*10)+x;
            num=num/10;
        }
        System.out.println(result);
        input.close();
    }
}