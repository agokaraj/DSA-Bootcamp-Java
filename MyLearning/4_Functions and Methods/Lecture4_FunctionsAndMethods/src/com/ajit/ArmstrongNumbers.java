package com.ajit;
public class ArmstrongNumbers {
    public static void main(String[] args) {
        int i=100;
        int j=999;
        for(int x=i;x<=j;x++){
            findArmstrong(x);     
       }
    }
    static void findArmstrong(int num) {
        int result=0;
        int temp=num;
        while(true){
            int a= temp%10;
            result=result+(a*a*a);
            temp=temp/10;
            if(temp==0){break;}
        }
        if(result==num){
            System.out.println(num+" is armstrong");
        }
    }    
}

