package com.ajit;

public class LinearSearch_example2{
    public static void main(String[] args) {
        int[] ary={12,32,534,3,5,323,875};
        int ans=findIndexLinearSearch(ary, 875);
        boolean ans_bool=findIndexLinearSearch2(ary, 875);
        System.out.println("Element is found:"+ans);
        System.out.println("Element is found(boolean):"+ans_bool);     
    }
    /*Return the element if found or Return -1 */
    static int findIndexLinearSearch(int[] ary, int target){
        int result=-1;
        if(ary.length==0){
            return result;
        } 
        for (int i : ary) {
            if(target==i){
                return i;
            }
        }
        return result;
    }
    /*Return the boolean if found "True" or Return "False" */
    static boolean findIndexLinearSearch2(int[] ary, int target){
        boolean result=false;
        if(ary.length==0){
            return result;
        } 
        for (int i : ary) {
            if(target==i){
                return true;
            }
        }
        return result;
    }
}