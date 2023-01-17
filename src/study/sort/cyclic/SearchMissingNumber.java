package study.sort.cyclic;

import java.util.Arrays;

public class SearchMissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 5, 6, 2, 4, 3, 8, 7, 13, 20, 17, 14, 16, 15, 11, 9, 18, 19, 10, 12};
        //int [] arr = {4,0,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(searchMissing(arr));
    }

    private static int searchMissing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - i != 0) {
                return i;
            }
        }
        return arr.length;
    }

    private static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            int temp = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[temp]) {
                int tempValue = arr[i];
                arr[i] = arr[temp];
                arr[temp] = tempValue;
            } else {
                i++;
            }
        }

    }
}
