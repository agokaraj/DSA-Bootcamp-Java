package com.ajit;

public class SearchCharInString {
    public static void main(String[] args) {
        String str="how are you today?";
        char chr='y';
        boolean result=searchStringForChar(str,chr);
        boolean result2=searchStringForChar(str,'x');
        System.out.println(result);
        System.out.println(result2);
    }
    static boolean searchStringForChar2(String str, char chr){
        boolean result=false;
        if(str.length()==0){
            return result;
        }
        for(char c: str.toCharArray()){
            if(chr==c){
                return true;
            }  
        }
        return result;
    }
    static boolean searchStringForChar(String str, char chr) {
        boolean result=false;
        if(str.length()==0){
            return result;
        }
        for (int i = 0; i < str.length(); i++) {
            if(chr==str.charAt(i)){
                return true;
            }         
        }
        return result;
    }
}
