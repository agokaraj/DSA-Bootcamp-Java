package com.ajit;
class BinarySearch{
    public static void main(String[] args) {
        /*Always have to assume the Input Array is sorted */
        int[] ary={-24,-1,2,4,6,9,11,12,14,20,36,48};
        int target=-12;
        boolean result=findElement(ary,target);
        int result2=findElement_kunal(ary, target);
        System.out.println("Boolean Found:"+result+". At Index:"+result2);
    }

    /*Binary Search: returns boolean */
    static boolean findElement(int[] ary, int target) {
       boolean res=false;
       int startIndex=0;
       int endIndex=ary.length-1;
        while(true){
            if(startIndex>endIndex){break;}
            int mid=(startIndex+endIndex)/2;
            if(ary[mid]==target){res=true;break;}
            if(ary[mid]>target){
                endIndex=mid-1;
            }
            else{
                startIndex=mid+1;
            }
        }
        return res;
    }

    /*Binary Search: returns Index if value found
     * or return -1
     */
    static int findElement_kunal(int[] ary, int target){
        int start=0;
        int end=ary.length-1;
        while(start<=end){
            int mid=start +(end - start)/2;
            if(ary[mid]>target){
                end=mid-1;
            }
            else if(ary[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}