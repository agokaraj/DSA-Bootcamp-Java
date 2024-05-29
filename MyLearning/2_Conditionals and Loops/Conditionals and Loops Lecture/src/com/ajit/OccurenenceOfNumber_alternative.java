package com.ajit;
import java.util.Scanner;
public class OccurenenceOfNumber_alternative {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input the Number:");
        Integer num=input.nextInt();
        System.out.print("Input the Search Number:");
        Integer searchNum=input.nextInt();
        int result=0;
        while(num>0){
            int x=num%10;
            if(x==searchNum){
                result++;
            }
            num=num/10;
        }
        System.out.println("Number of Occurence:"+result);
        input.close();
    }
}
//1385757879