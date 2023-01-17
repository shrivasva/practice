package study.sort.cyclic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchErrorSet {
    public static void main(String[] args) {
//        int[] arr = {0, 5, 6, 2, 4, 3, 8, 7, 13, 20, 17, 14, 16, 15, 11, 9, 18, 19, 10, 12};
        int[] arr = {1,2,2,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(searchErrorSet(arr)));
        System.out.println();
    }

    private static int[] searchErrorSet(int[] arr) {
        int value=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - i - 1 != 0) {
                value = i;
            }
        }
        return new int[]{value,value+1};
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
