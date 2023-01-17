package study.sort.selection;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13, 1, 3,-2, 4, 2, 3, 67, 54};
        //int[] arr = {1, 2, 3, 14, 5, 6, 7, 8};
        System.out.println(Arrays.toString(sort(arr)));
    }

    private static int[] sort(int[] arr) {
        int k = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int max = arr[0];
            int index = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    index = j;
                }
            }
            int temp = arr[k];
            arr[k] = arr[index];
            arr[index] = temp;
            k--;
        }
        return arr;
    }
}
