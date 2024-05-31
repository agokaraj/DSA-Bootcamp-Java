package com.ajit;
public class FindEvenNumberDigits_Optimized {
    public static void main(String[] args) {
        int[] ary={12,345,2,262626,7896,-34};
        int count=0;
        for (int i = 0; i < ary.length; i++) {
            if(numOfDigits(ary[i])%2==0){
                count++;
            };
        }
        System.out.println(count);
    }
    private static int numOfDigits(int num) {
        if(num<-1){num=num*-1;}
        return (int)(Math.log10(num))+1;
    }   
}
