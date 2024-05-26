package com.ajit;
public class PassByValue {
    public static void main(String[] args) {
        String s1="Jack";
        System.out.println("Initial value in s1:"+s1);
        String s3=modify(s1);
        
        System.out.println("S1 value:"+s1);
        /*This prints Jack */
        System.out.println("S3 value:"+s3);
        /*This prints Jill */
    }
    private static String modify(String s2) {
        /*At this point both s1 and s2 are pointing 
        to the same value in the heap
         */
        s2.toLowerCase();/*At this point s2 value does not change */
        s2="Jill";/*At this point s2 is referencing a new object */
       return s2;
    }
}
