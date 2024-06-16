package com.ajit;
public class Pallindrome {
    public static void main(String[] args) {
        String str="aba";
        char[] chr= str.toCharArray();
        boolean result=checkPallindrome(chr);
        System.out.println(result);
    }
    private static boolean checkPallindrome(char[] chr) {
        int start=0;int end=chr.length-1;
        if(chr.length==0){return true;}
        boolean result=true;
        while(start<=end){
            if(chr[start]!=chr[end]){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return result;
    }
}
