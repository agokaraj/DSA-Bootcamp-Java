package com.ajit;

public class Arrays_MaximumValue {
    public static void main(String[] args) {
        int[] ary={10,324,324,65633,434,64567,8855};
        int maxvalue=findMaximumInArray(ary);
        System.out.println("Max value in the array:"+maxvalue);
    }

    private static int findMaximumInArray(int[] ary) {
        int result=ary[0];
        for (int i = 0; i < ary.length; i++) {
            if(result<=ary[i]){
                result=ary[i];
            }
        }
        return result;
    }
}
