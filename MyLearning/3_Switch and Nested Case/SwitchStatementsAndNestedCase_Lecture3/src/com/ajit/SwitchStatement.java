package com.ajit;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String fruit=input.next();
        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruit");
                break;
            case "Apple":
                System.out.println("Red Fruit");
                break;
            case "Orange":
                System.out.println("Round Fruit");
                break;
            default:
                System.out.println("Invalid Fruit");
                break;
        }
        input.close();
    }
}