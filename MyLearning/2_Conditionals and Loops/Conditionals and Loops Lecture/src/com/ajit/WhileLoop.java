package com.ajit;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Value:");
        int number=input.nextInt();
        int index=0;
        while (index<number){
            System.out.println(index);
            index++;
        }
        input.close();
    }
}
