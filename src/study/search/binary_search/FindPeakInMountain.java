package study.search.binary_search;

public class FindPeakInMountain {
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray());
    }

    static int peakIndexInMountainArray() {
        return binarySearch(new int[]{8,18,31,37,42,43,56,65,73,93,98,100,98,76,72,69,24,23});
    }

    static int binarySearch(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid + 1] < arr[mid]) {
                end = mid;
            } else if (arr[mid + 1] > arr[mid]) {
                start = mid + 1;
            }
        }
        return start;

    }
}
