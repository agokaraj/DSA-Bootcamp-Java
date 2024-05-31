package com.ajit;

public class LeetCode_RichestCustomerWealth {
    public static void main(String[] args) {
       int[][] accounts = {{1,2,3},{3,2,1}};
       int richestAccount=maximumWealth(accounts);
       System.out.println(richestAccount);
    }
    static int maximumWealth(int[][] accounts) {
        int result=0;
        for (int i = 0; i < accounts.length; i++) {
            int temp=0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp=temp+accounts[i][j];
            }
            if(result<temp){result=temp;}
        }
        return result;
    }
}
