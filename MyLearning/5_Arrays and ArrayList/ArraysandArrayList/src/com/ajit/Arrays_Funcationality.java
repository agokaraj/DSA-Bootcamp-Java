package com.ajit;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Funcationality{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] ros;//declaration of array. ros is getting defined in the stack
        ros=new int[5]; /*
        Initialization: actually here object is being created in the memory(heap)
        */ 
        for(int num=0; num<ros.length;num++){
            ros[num]=input.nextInt();
        }  
        // for(int num2: ros){
        //     System.out.println(num2);
        // } 
        /*Alternative way to print arrays */
        System.out.println(Arrays.toString(ros));
    }
}