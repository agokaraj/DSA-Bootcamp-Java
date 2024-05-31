package com.ajit;

public class LinearSearch{
    public static void main(String[] args) {
        int[] ary={12,32,534,3,5,323,875};
        int ans=findIndexLinearSearch(ary, 323);
        System.out.println("Index of 323:"+ans);
        
    }
    /*Return the index if found or Return -1 */
    static int findIndexLinearSearch(int[] ary, int target){
        int result=-1;
        if(ary.length==0){
            return result;
        }
        for (int index = 0; index < ary.length; index++) {
            if(target==ary[index]){
                return index;
            }
        }
        return result;

    }
}