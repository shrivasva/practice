package study.sort.insertion;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {13, 1,1, 3, -2, 4, 2, 3, 67, 54};
        //int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                } else {
                    System.out.println("brak");
                    break;
                }
            }
        }
    }
}
