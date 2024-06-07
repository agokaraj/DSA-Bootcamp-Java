package com.ajit;
class LeetCode744_FindSmallestLetterGreaterThanTarget{
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target='j';
        char result=nextGreatestLetter(letters,target);
        System.out.println(result);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        //if(target>letters[letters.length-1]){return letters[0];}
        int start=0;
        int end=letters.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            //if(letters[mid]==target){return letters[mid]}
            if(target<letters[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}