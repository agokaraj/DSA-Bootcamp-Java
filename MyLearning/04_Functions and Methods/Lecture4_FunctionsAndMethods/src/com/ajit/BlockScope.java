package com.ajit;

public class BlockScope {
    public static void main(String[] args) {
        int a=50;
        {
            //int a=80; already initialized outside the block
            a=90;//can reassign the origin ref variable to some other value
            int c=50;
        }
        //c=100; Scope of c is within {} and cannot be accessed outside
        System.out.println(a);
    }
}
