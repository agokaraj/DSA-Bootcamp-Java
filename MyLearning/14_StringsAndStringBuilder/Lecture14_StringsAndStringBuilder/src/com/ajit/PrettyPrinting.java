package com.ajit;

import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a=453.1234f;
        //System.out.printf("Formatted number is %.2f",a);

        //System.out.printf("Pie: %.3f",Math.PI);

        //The below statement does not work.
        System.out.println(new Integer(56)+ new ArrayList<>());

        //The below statement does work. The moment we add a string. The toString
        //method is called on the objects.
        System.out.println(new Integer(56)+" "+new ArrayList<>());
    }
    
}
