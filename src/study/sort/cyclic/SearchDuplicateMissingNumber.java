package study.sort.cyclic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchDuplicateMissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8,  3, 1,5,6};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(searchMissing(arr));
    }

    private static int searchMissing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i+1) {
                return arr[i];
            }
        }
        return -1;
    }

    private static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int temp = arr[i] - 1;
            if (arr[i] != arr[temp]) {
                int tempValue = arr[i];
                arr[i] = arr[temp];
                arr[temp] = tempValue;
            } else {
                i++;
            }
        }

    }
}
