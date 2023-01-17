package study.search.array;

import java.util.Arrays;

public class Merge2Array {
    public static void main(String[] args) {
        int[] merged = merge2Array(new int[]{1, 2}, new int[]{3,4});
        System.out.println(Arrays.toString(merged));
        int mid = (0 + merged.length - 1) / 2;
        double median;
        if (merged.length % 2 == 0) {
            median = (merged[mid] + merged[mid + 1]) / 2.0;
        } else median = merged[mid];
        System.out.println("median " + median);
    }

    private static int[] merge2Array(int[] firstArray, int[] secondArray) {
        int[] temp = new int[firstArray.length + secondArray.length];
        int i = 0, j = 0, k = 0;
        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i] > secondArray[j]) {
                temp[k] = secondArray[j];
                j++;
            } else {
                temp[k] = firstArray[i];
                i++;
            }
            k++;
        }
        for (int l = i; l < firstArray.length; l++) {
            temp[k] = firstArray[l];
            k++;
        }
        for (int l = j; l < secondArray.length; l++) {
            temp[k] = secondArray[l];
            k++;
        }

        return temp;
    }
}
