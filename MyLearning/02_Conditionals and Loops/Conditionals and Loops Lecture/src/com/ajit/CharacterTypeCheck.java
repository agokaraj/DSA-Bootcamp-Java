package com.ajit;
import java.util.Scanner;
public class CharacterTypeCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        //String FirstChar=str.substring(0,1);
        //int asciiValue=(char) str.charAt(0);
        char firstChar=str.charAt(0);
        int asciiValue=firstChar;
        //System.out.println(asciiValue);
        if(asciiValue>=65 && asciiValue<=90){
            System.out.println("The Character is Upper Case");
        }
        else if(asciiValue>=97 && asciiValue<=122){
            System.out.println("The Character is Lower Case");
        }
        else{System.out.println("Not a Character");}
        input.close();
    }
}
