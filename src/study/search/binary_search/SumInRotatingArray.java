package study.search.binary_search;

import study.search.array.RotateArray;

import java.util.Arrays;

public class SumInRotatingArray {
    public static void main(String[] args) {
        int[] arrs = new int[]{3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
        for (int i = 0; i < 1; i++) {
            RotateArray.rotateArray(arrs, i);
            System.out.println(Arrays.toString(arrs));
            System.out.println("max sum " + findMaxSum(arrs, 5));
        }
    }

    static int findMaxSum(int[] nums, int k) {
        int start = 0;
        if (k == nums.length - 1) {
            return start;
        }
        int end = 0;
        for (int num : nums) {
            end += num;
            start=Math.max(start,num);
        }
        while (start < end) {
            int mid = (start + end) / 2;
            int total = 0;
            int parts = 0;
            for (int num : nums) {
                total += num;
                if (total > mid) {
                    parts++;
                    total = num;
                }
            }
            parts++;
            if (parts <= k) {
                end = mid;
            }
            if (parts > k) {
                start = mid + 1;
            }
        }
        return start;
    }

    private static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if(nums[mid] > nums[end]) {
                if (mid > start && nums[mid] < nums[mid - 1] ) {
                    return mid - 1;
                }
                if (mid < end && nums[mid] > nums[mid + 1]) {
                    return mid;
                }

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
            else if (nums[mid] > nums[start] || (nums[start] == nums[mid] && nums[mid] > nums[end]) || nums[end]>nums[mid]) {
                start = mid + 1;
            }else {
                end = mid-1;
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
