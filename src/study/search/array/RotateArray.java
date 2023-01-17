package study.search.array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int[] arrs = new int[]{0, 0, 0, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 6, 6, 8, 9, 10, 10, 11, 11, 11, 11, 11, 12};
            rotateArray(arrs, i);
            System.out.println(Arrays.toString(arrs));
        }
    }

    public static void rotateArray(int[] arrs, int noOfRotation) {
        while (noOfRotation != 0) {
            int finalValue = arrs[arrs.length-1];
            for (int i = arrs.length -1; i > 0; i--) {
               arrs[i] = arrs[i -1];
            }
            arrs[0] = finalValue;
            noOfRotation--;
        }
    }
}
