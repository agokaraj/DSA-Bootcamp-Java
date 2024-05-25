package com.ajit;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int result=0;
        while (true) {
            System.out.print("Enter the Operation:");
            char op=input.next().trim().charAt(0);
            System.out.println(op);
            if(op=='x'||op=='X'){break;}
            else if(op=='+' ||op=='-'||op=='/'||op=='*'||op=='%'){
                System.out.println("Enter two Values:");
                int x=input.nextInt();
                int y=input.nextInt();
                if(op=='+'){result=x+y;}
                if(op=='-'){result=x-y;}
                if(op=='/' && y!=0){result=x/y;}
                if(op=='*'){result=x*y;}
                if(op=='%' && y!=0){result=x%y;}
                System.out.println("Result:"+result);
            } else {System.out.println("Invalid Operation");}
        }
    }
}
