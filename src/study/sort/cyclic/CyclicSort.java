package study.sort.cyclic;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5,6,9,1,7,8};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - i != 1) {
                int index = arr[i]-1;
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }
}
