package com.ajit;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays_2D_example2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] numArray=new int[3][2];
         for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                numArray[i][j]=input.nextInt();
            }
         }
         /*Printing the array-1 */
         for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                System.out.print(numArray[i][j]+" ");
            }
            System.out.println();
         }
          /*Printing the array-2 */
         for (int i = 0; i < numArray.length; i++) {
            System.out.println(Arrays.toString(numArray[i]));
         }
          /*Printing the array-3 */
          for (int[] a:numArray) {
            System.out.println(Arrays.toString(a));
         }
         input.close();                
    }
}
