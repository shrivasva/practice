package study.sort.cyclic;

import java.util.Arrays;

public class SmallestMissingNumber {
    public static void main(String[] args) {
//        int[] arr = {0, 5, 6, 2, 4, 3, 8, 7, 13, 20, 17, 14, 16, 15, 11, 9, 18, 19, 10, 12};
        int[] nums = {1};
        cyclicSort(nums);
        System.out.println((searchErrorSet(nums)));
        System.out.println(Arrays.toString(nums));
    }

    private static int searchErrorSet(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return arr.length+1;
    }

    private static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int temp = arr[i] - 1;
            if (temp >= 0 && temp < arr.length && arr[i] != arr[temp]) {
                int tempValue = arr[i];
                arr[i] = arr[temp];
                arr[temp] = tempValue;
            } else {
                i++;
            }
        }

    }
}
