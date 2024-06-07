package com.ajit;
import java.util.Arrays;
public class sorted2DArray {
    public static void main(String[] args) {
        int[][] arry={
                        {1,2,3},
                        {4,5,6},
                        {7,8,9},
                    };
        System.out.println(Arrays.toString(search(arry, 2)));
    }
    //search in the row provided, in the column provided
    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){
        while(colStart<=colEnd){
            int mid=colStart+(colEnd-colStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }else if(matrix[row][mid]<target){
                colStart=mid+1;
            }else {
                colEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[1].length;//be cautious, matrix may be empty
        if(rows==1){
            /*This means the matrix has only one row 
            and we are doing a binary search on it */
            return binarySearch(matrix, 0, 0, cols-1, target);
        }
        int rowStart=0;
        int rowEnd=rows-1;
        int colMiddle=(cols/2);//(cols/2)-1;

        //run the loop till 2 rows are remaining
        while(rowStart<(rowEnd-1)){
        /*the while loop runs until there only two rows available */
            int mid=rowStart+(rowEnd-rowStart)/2;
            if(matrix[mid][colMiddle]==target){
                return new int[]{mid,colMiddle};
            }
            if(matrix[mid][colMiddle]<target){
                rowStart=mid;
            }else{
                rowEnd=mid;
            }
        }

        //by this point we only have two rows
        //first check if the element is in the middle column now
        if(matrix[rowStart][colMiddle]==target){
            return new int[]{rowStart,colMiddle};
        }
        if(matrix[rowStart+1][colMiddle]==target){
            return new int[]{rowStart+1,colMiddle};
        }
        //search in 1st half
        if(target<=matrix[rowStart][colMiddle-1]){
            return binarySearch(matrix, rowStart, 0, colMiddle-1, target);
        }
        //search in 2nd half
        if(target>=matrix[rowStart][colMiddle+1] && target<=matrix[rowStart][cols-1]){
            return binarySearch(matrix, rowStart, colMiddle+1, cols-1, target);
        }
        //search in 3rd half
        if(target<=matrix[rowStart+1][colMiddle-1]){
            return binarySearch(matrix, rowStart+1, 0, colMiddle-1, target);
        }
        //search in 2nd half
        if(target>=matrix[rowStart+1][colMiddle+1] && target<=matrix[rowStart+1][cols-1]){
            return binarySearch(matrix, rowStart+1, colMiddle+1, cols-1, target);
        }
    return new int[]{-1,-1};
    }
}
