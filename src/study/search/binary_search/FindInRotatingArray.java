package study.search.binary_search;

import study.search.array.RotateArray;

import java.util.Arrays;

public class FindInRotatingArray {
    public static void main(String[] args) {
        int[] arrs = new int[]{3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
        for (int i = 0; i < 10; i++) {
            RotateArray.rotateArray(arrs, i);
            System.out.println(Arrays.toString(arrs));
            search(arrs, 99);
        }
    }

    static int search(int[] nums, int target) {
        //nums = new int[]{5,10,8,7,2};
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
//         //   if(nums[mid] > nums[end]) {
//                if (mid > start && nums[mid] < nums[mid - 1] ) {
//                    return mid - 1;
//                }
//                if (mid < end && nums[mid] > nums[mid + 1]) {
//                    return mid;
//                }
//
//            //}
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
            else if (nums[mid] > nums[start] || (nums[start] == nums[mid] && nums[mid] > nums[end]) ) {
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
