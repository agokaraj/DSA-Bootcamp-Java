package com.ajit;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_Multidimensional {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        /*We have to Initialize the ArrayLists that are stored 
            within outer Arraylist */
        for (int index = 0; index < 3; index++) {
            list.add(new ArrayList<Integer>());
        }
        for (int index = 0; index < 3; index++) {
            for (int j = 0; j < 3; j++) {
                list.get(index).add(input.nextInt());
            }
        }
        System.out.println(list); input.close();
    }
}
