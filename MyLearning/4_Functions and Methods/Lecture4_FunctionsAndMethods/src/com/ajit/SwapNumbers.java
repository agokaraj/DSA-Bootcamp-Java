package com.ajit;
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);    
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("before swap:"+a+"--"+b);
        swap(a, b);
        input.close();
    }
    static void swap(int a_num, int b_num){
        int temp=b_num;
        b_num=a_num;
        a_num=temp;
        System.out.println("after swap:"+a_num+"--"+b_num);
    } 
}

