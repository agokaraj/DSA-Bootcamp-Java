package com.ajit;
public class FindEvenNumberDigits {
    public static void main(String[] args) {
        int[] ary={12,345,2,6,7896,-34};
        int count=0;
        for (int i = 0; i < ary.length; i++) {
            if(convertIntToArray(ary[i])%2==0){
                count++;
            };
        }
        System.out.println(count);
    }
    private static int convertIntToArray(int i) {
        if(i==0){return 1;}
        if(i<0){i=i*-1;}//to handle negative numbers
        int result=0;
        while(true){
            if(i==0){break;}
            result=result+1;
            i=i/10;
        }
        return result;
    }   
}
