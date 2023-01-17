package study.sort.cyclic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchAllMissingNumber {
    public static void main(String[] args) {
//        int[] arr = {0, 5, 6, 2, 4, 3, 8, 7, 13, 20, 17, 14, 16, 15, 11, 9, 18, 19, 10, 12};
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(searchMissing(arr));
    }

    private static List<Integer> searchMissing(int[] arr) {
        List<Integer> lis = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - i - 1 != 0) {
                lis.add(i+1);
            }
        }
        return lis;
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
