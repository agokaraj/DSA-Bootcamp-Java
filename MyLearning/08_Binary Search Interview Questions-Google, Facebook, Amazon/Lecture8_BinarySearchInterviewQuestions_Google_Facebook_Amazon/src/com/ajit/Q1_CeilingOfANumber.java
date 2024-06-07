package com.ajit;

class CeilingOfANumber {
    public static void main(String[] args) {
        int[] ary={2,3,5,9,14,16,18};
        int target=20;
        int result=ceiling(ary,target);
        System.out.println(result);
    }

    static int ceiling(int[] ary, int target) {
        int start=0; int end=ary.length-1;
        boolean sortedAsc=false;
        if(ary[start]<ary[end]){sortedAsc=true;}
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ary[mid]==target){
                return ary[mid];
            }
            else if((sortedAsc && target>ary[mid]) ||(!sortedAsc && target<ary[mid])){
                start=mid+1;
                // if(end==start){
                //     if(ary[end]>=target){return ary[end];}
                //     else{return ary[(start+1)];}
                // }
            }
            else if((sortedAsc && target<ary[mid]) ||(!sortedAsc && target>ary[mid])){
                end=mid-1;
                // if(end==start){
                //     if(ary[start]>=target){return ary[start];}
                //     else{return ary[(start+1)];}
                // }
            }
        }
        /*The while breaks when Start>End and also when the Element is not found.
         * At this point we are returning the element at Start is the ceiling(Array,target)
         */
        return ary[start];
    }
}