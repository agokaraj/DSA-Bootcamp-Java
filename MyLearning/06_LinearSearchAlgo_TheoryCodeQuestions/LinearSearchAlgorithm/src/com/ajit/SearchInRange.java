package com.ajit;
public class SearchInRange{
    public static void main(String[] args) {
        int[] arry={18,12,-7,3,14,28};
        int indexStart=1;
        int indexEnd=4;
        int target=-7;
        int ans=searchRange(arry,indexStart,indexEnd,target);
        System.out.println("The index of the element is:"+ans);
    }
    static int searchRange(int[] arry, int indexStart, int indexEnd, int target) {
        int result=-1;
        if(arry.length==0){
            return result;
        }
        for (int i = indexStart; i <= indexEnd; i++) {
            if(target==arry[i]){
                return i;
            }
        }
        return result;
    }
}