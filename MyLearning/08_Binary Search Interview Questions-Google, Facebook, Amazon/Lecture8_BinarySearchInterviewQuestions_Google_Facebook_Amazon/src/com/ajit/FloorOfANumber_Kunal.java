package com.ajit;

class FloorOfANumber_Kunal {
    public static void main(String[] args) {
        int[] ary={2,3,5,9,14,16,18};
        int target=6;
        int result=ceiling(ary,target);
        System.out.println(result);
    }

    static int ceiling(int[] ary, int target) {
     /*if the target number is greater than the largest number-
         * Technically there is no ceiling
         */
        if(target<ary[0]){
            return -1;
        };
        int start=0; int end=ary.length-1;
        boolean sortedAsc=false;
        if(ary[start]<ary[end]){sortedAsc=true;}
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ary[mid]==target){
                return ary[mid];
            }
            else if((sortedAsc && target>ary[mid]) 
                ||(!sortedAsc && target<ary[mid])){
                start=mid+1;
            }
            else if((sortedAsc && target<ary[mid]) 
                ||(!sortedAsc && target>ary[mid])){
                end=mid-1;
            }
        }
        return ary[end];
    }
}