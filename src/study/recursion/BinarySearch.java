package study.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(bs(arr, 7, 0, arr.length - 1));
    }

    private static int bs(int[] arr, int target, int start, int end) {
        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (start > end) {
            return -1;
        }
        if (target > arr[mid]) {
            return bs(arr, target, mid + 1, end);
        }
        return bs(arr, target, start, mid - 1);
    }
}
