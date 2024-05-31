package com.ajit;

public class BinarySearch_OrderAgnostic {
    public static void main(String[] args) {
        int[] ary={-24,-1,2,4,6,9,11,12,14,20,36,48};
        int[] ary2={48,36,20,14,12,11,9,6,4,2,-1,-24};
        int target=36;
        System.out.println(findElementOrderAgnostic(ary,target));
        System.out.println(findElementOrderAgnostic(ary2,target));
    }

    static int findElementOrderAgnostic(int[] ary, int target) {
       int start=0;
       int end=ary.length-1;
       boolean sortedAsc=true;//boolean sortedAsc=ary[start]<ary[end]
       if(ary[start]>ary[end]){
            sortedAsc=false;
       }
       while(start<=end){
            int mid=start+(end -start)/2;
            if((ary[mid]<target && sortedAsc)||(ary[mid]>target && !sortedAsc)){
                start=mid+1;
            }
            else if((ary[mid]>target && sortedAsc)||(ary[mid]<target && !sortedAsc)) {
                end=end-1;
            }
            else{
                return mid;
            }
       }
       return -1;
    }
    
}
