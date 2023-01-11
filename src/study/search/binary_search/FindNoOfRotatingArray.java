package study.search.binary_search;

import study.other.RotateArray;

import java.util.Arrays;

public class FindNoOfRotatingArray {
    public static void main(String[] args) {

        int[] arrs = new int[]{0, 0, 0, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 6, 6, 8, 9, 10, 10, 11, 11, 11, 11, 11, 12};
        for (int i = 0; i < 100; i++) {
            RotateArray.rotateArray(arrs, i);
            System.out.println(Arrays.toString(arrs));
            System.out.println("Element found at " + search(arrs, 4));
        }
    }

    static int search(int[] nums, int target) {
        int peak = findPeak(nums);
        if (target == nums[peak]) {
            return peak;
        }
        System.out.println("Peak " + nums[peak]);
//        if ((nums[peak] != 12)) {
//            throw new RuntimeException("INVALID PEAK");
//        }
        if (nums[0] > target) {
            return orderLessBinary(nums, target, peak + 1, nums.length - 1);
        }
        return orderLessBinary(nums, target, 0, peak);

    }

    private static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[start] == nums[end] && nums[end] == nums[mid]) {
                start++;
                end--;
            }
            if (nums[start] > nums[mid]) {
                end = mid - 1;
            }
            if (nums[mid] > nums[start] || nums[mid] < nums[end] || nums[start] == nums[mid]) {
                start = mid + 1;
            }
        }
        return start;
    }

    private static int orderLessBinary(int[] nums, int target, int start, int end) {


        while (start < end) {
            int mid = (start + end) / 2;
            if (target <= nums[mid]) {
                end = mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }

        }
        if (start == end) {
            return start;
        }

        return -1;
    }
}
