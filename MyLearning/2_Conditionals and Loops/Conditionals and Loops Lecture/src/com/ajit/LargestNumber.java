package com.ajit;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for a:");
        int a=input.nextInt();
        System.out.print("Enter value for b:");
        int b=input.nextInt();
        System.out.print("Enter value for c:");
        int c=input.nextInt();
        int result=Math.max(c,Math.max(a,b)) ;
        /*if(result<b){
            result=b;
        }
        if(result<c){
            result=c;
        }*/
        System.out.println("Largest Number is:"+result);
        input.close();
    }
}
