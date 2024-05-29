package com.ajit;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLIst_Example2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        
        /*Add an element to the ArrayList */
        list.add(67);
        list.add(68);
        list.add(69);
        list.add(70);

        /*Printing an ArrayList */
        System.out.println("list set original setup:"+list);

        /*ArrayList Functions */
        System.out.println("list set contains element 70:"+list.contains(70));
        list.set(1, 99);
        System.out.println("list set element in index1 to 99:"+list);
        list.remove(2);
        System.out.println("list set after index2 element is removed:"+list);

        /*Use iteration to Input information */
        ArrayList<Integer> list2=new ArrayList<>();

        Scanner input=new Scanner(System.in);
        System.out.print("Input numbers for List2 Arraylist:");
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }

        /*use iteration to print */
        for (int i = 0; i < 5; i++) {
            System.out.println(list2.get(i));
        }
    }
}
