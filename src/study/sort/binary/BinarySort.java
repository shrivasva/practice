package study.sort.binary;

import java.util.Arrays;

public class BinarySort {
    public static void main(String[] args) {
        //int[] arr = {13,1,3,4,2,3,67,54};
        int[] arr = {1,2,3,14,5,6,7,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println("swapping var");
                }
            }
        }
    }
}
