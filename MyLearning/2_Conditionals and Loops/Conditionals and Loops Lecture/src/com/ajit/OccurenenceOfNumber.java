package com.ajit;
import java.util.Scanner;
public class OccurenenceOfNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input the Number:");
        Integer num=input.nextInt();
        System.out.print("Input the Search Number:");
        Integer searchNum=input.nextInt();
        String x=num.toString(); String y=searchNum.toString();
        char s=y.charAt(0);
        char[] ch=x.toCharArray();
        int result=0;
        for (char c : ch) {
            if(s==c){result++;}
        }
        System.out.println("Number of Occurence:"+result);
        input.close();
    }
}
//1385757879