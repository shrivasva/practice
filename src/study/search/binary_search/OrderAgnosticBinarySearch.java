package study.search.binary_search;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 9, 20, 21, 21, 25, 32, 34, 74};
        int[] descArr = {99, 89, 76, 54, 32, 30, 19, 15, 11, 9, 1};
        int target = 32;
        System.out.println(binarySearch(arr, target));
        System.out.println(binarySearch(descArr, target));

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[0] < arr[arr.length - 1]) {
            return ascBinarySearch(arr, target, start, end);
        } else {
            return descBinarySearch(arr, target, start, end);
        }
    }

    private static int descBinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int ascBinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
