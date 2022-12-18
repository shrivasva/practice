package study.search.binary_search;

public class FindInMountain {
    public static void main(String[] args) {
        System.out.println(findInMountainArray(1, new MountainArray()));
    }

    static int findInMountainArray(int target, MountainArray arr) {
        int peak = findPeak(arr);

        int ans = orderLessBinary(arr, target, 0, peak);
        if (ans == -1) {
            ans = orderLessBinary(arr, target, peak, arr.length() - 1);
        }
        return ans;

    }

    static int findPeak(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid + 1) < arr.get(mid)) {
                end = mid;
            } else if (arr.get(mid + 1) > arr.get(mid)) {
                start = mid + 1;
            }
        }
        return start;

    }

    private static int orderLessBinary(MountainArray arr, int target, int start, int end) {
        boolean isDesc = arr.get(start) > arr.get(end);
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) == target) {
                return mid;
            }
            if (isDesc) {
                if (target < arr.get(mid)) {
                    start = mid + 1;
                } else if (target > arr.get(mid)) {
                    end = mid - 1;
                }
            } else {
                if (target < arr.get(mid)) {
                    end = mid - 1;
                } else if (target > arr.get(mid)) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
