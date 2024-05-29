package com.ajit;
import java.util.ArrayList;
public class ArrayLIstExample {
    public static void main(String[] args) {
        /*Both are valid
         * ArrayList<*datatype*> list=new ArrayList<>();
         *  ArrayList<*datatype*> list=new ArrayList<*datatype*>(**defaultSize**);
         */
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
        ArrayList<Integer> list3=new ArrayList<Integer>(10);
    }
}
