package study.search.array;

import java.util.Arrays;

public class TwoDArraySearch {

    public static final int[][] MATRIX = {
            {10, 20, 30, 40},
            {11, 22, 34, 42},
            {15, 27, 37, 48},
            {16, 29, 39, 50}
    };

    public static void main(String[] args) {
        int[][] search = search(MATRIX, 37);
        System.out.println(search[0][0]+"-"+search[0][1]);
    }
    public static int[][] search(int [][] matrix,int target){
        int[][] ans ={{-1,-1}};
        int row = 0;
        int column = matrix.length -1;
        while(row < matrix.length && column >= 0){
            if(target == matrix[row][column]){
                ans[0][0] = row;
                ans[0][1]=column;
            }
            if(target > matrix[row][column]){
                row++;
            }else {
                column--;
            }
        }
        return ans;
    }
}
