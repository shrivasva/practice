package study.search.array;

public class TwoDSortedArraySearch {

    public static final int[][] MATRIX = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
    };

    public static void main(String[] args) {
        int[][] search = search(MATRIX, 12);
        System.out.println(search[0][0] + "-" + search[0][1]);
    }

    public static int[][] search(int[][] matrix, int target) {
        int[][] ans = {{-1, -1}};
        int row = 0;
        int column = matrix.length - 1;
        while (row < matrix.length && column >= 0) {
            if (target == matrix[row][column]) {
                ans[0][0] = row;
                ans[0][1] = column;
            }
            if (target > matrix[row][column]) {
                row++;
            } else {
                column--;
            }
        }
        return ans;
    }
}
