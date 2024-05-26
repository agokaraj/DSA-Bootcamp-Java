package com.ajit;
import java.util.Scanner;
public class Functions_withReturn {
    public static void main(String[] args) {
        int x=sum();
        System.out.println("The Sum of both Numbers:"+x);
    }
    static int sum(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1=input.nextInt();
        System.out.print("Enter num2:");
        int num2=input.nextInt();
        int result=num1+num2;
        input.close();
        return result;
        //System.out.println("This piece of code"+
        //" never executes as it is after return");
    }
}