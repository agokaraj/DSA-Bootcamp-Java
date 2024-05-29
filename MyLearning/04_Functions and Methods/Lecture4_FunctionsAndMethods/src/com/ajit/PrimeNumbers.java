package com.ajit;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        Boolean isPrime=checkPrime(x);
        System.out.println(isPrime);
        input.close();
    }

    private static Boolean checkPrime(int x) {
        if(x<=1){
            return false;
        }
        int c=2;
        while(c*c <= x){
            if(x%c==0){
                return false;
            }
            c++;
        } 
        return c*c>x;
    }
}
