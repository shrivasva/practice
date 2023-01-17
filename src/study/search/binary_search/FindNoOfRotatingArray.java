package study.search.binary_search;

import study.search.array.RotateArray;

import java.util.Arrays;

public class FindNoOfRotatingArray {
    public static void main(String[] args) {

        int[] arrs = new int[]{0, 0, 0, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 6, 6, 8, 9, 10, 10, 11, 11, 11, 11, 11, 12};
        for (int i = 0; i < 10; i++) {
            RotateArray.rotateArray(arrs, i);
            System.out.println(Arrays.toString(arrs));
            System.out.println("Total no. of rotation " + findNoOfRotation(arrs));
        }
    }

    static int findNoOfRotation(int[] nums) {
        int peak = findPeak(nums);
        System.out.println("Peak " + nums[peak]);
        if(peak == nums.length-1){
            return 0;
        }
        return peak + 1;
    }

    private static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (nums[start] == nums[end] && nums[end] == nums[mid]) {
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                start++;
                end--;
            }
            else if (nums[start] > nums[mid]) {
                end = mid - 1;
            }
            else if (nums[mid] > nums[start] || nums[mid] < nums[end] || nums[start] == nums[mid]) {
                start = mid + 1;
            }
        }
        return start;
    }

    private static int orderLessBinary(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
