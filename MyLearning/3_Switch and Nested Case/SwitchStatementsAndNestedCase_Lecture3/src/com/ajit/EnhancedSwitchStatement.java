package com.ajit;

import java.util.Scanner;

public class EnhancedSwitchStatement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String fruit=input.next();
        /*Enhanced Switch
         * 1. Break Condition not required here
         */
        switch (fruit) {
            case "Mango"-> {
                            System.out.println("King of Fruit");
                            System.out.println("Second Statement");
                            }
            case "Apple"-> System.out.println("Red Fruit");
            case "Orange"-> System.out.println("Round Fruit");  
            default->System.out.println("Invalid Fruit");
        }
        input.close();
    }
}