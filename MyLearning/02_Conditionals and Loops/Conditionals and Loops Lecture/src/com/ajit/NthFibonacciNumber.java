package com.ajit;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter value for N:");
        int NthValue=input.nextInt();
        int firstValue=0;int secondValue=1;
        int result=0;
        if(NthValue==0){ result=firstValue;}
        else if(NthValue==1){ result=secondValue;;}
        else{
            for (int index = 2; index <= NthValue; index++) {
                result=firstValue+secondValue;
                firstValue=secondValue;
                secondValue=result;
            }
        }
        System.out.println("Fibonnaci value at "+NthValue+" is:"+ result);
        input.close();
    }
}
