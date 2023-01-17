package study.search.binary_search;

import study.search.array.RotateArray;

import java.util.Arrays;

public class FindMinInRotatingArray {
    public static void main(String[] args) {

        int[] arrs = new int[]{3,3,3,1};
        for (int i = 0; i < 1; i++) {
            RotateArray.rotateArray(arrs, i);
            System.out.println(Arrays.toString(arrs));
            System.out.println("Element found at " + searchMin(arrs));
        }
//        int[] arrs = new int[]{2,2,2,0,1};


    }

    static int searchMin(int[] nums) {
        int peak = findMin(nums);
        System.out.println("min " + nums[peak]);
        return nums[peak];

    }

    private static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid - 1 >= start && nums[mid] < nums[mid - 1]) {
                return mid;
            }
            if (nums[mid] > nums[mid + 1]) {
                return mid + 1;
            }
            if (nums[start] == nums[end] && nums[end] == nums[mid]) {
                if (nums[start] < nums[start + 1]) {
                    return start;
                }
                if (nums[end] < nums[end - 1]) {
                    return end ;
                }
                start++;
                end--;
            }
            else if (nums[start] < nums[mid] || nums[mid] < nums[end] || nums[end]==nums[mid]) {
                end = mid - 1;
            }
            else if (nums[mid] < nums[start] ) {
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
