package com.ajit;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value:");
        int iterate=input.nextInt();
        for (int index = 0; index < iterate; index++) {
            System.out.println(index);
        }
        input.close();
    }
}
