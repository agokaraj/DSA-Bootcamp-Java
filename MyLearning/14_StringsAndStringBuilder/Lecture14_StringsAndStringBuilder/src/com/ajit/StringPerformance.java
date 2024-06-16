package com.ajit;

public class StringPerformance {
    public static void main(String[] args) {
        String series="";
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            series=series+ch;
            //this is creating a new String object 
            //everytime and dereferencing the old value
        }
        System.out.println(series);
    }
}
