package study.search.binary_search;

public class FindInRotatingArray {
    public static void main(String[] args) {
        System.out.println(search(getNums(), 1));
    }

    private static int[] getNums() {
        return new int[]{1,3};
    }

    static int search(int[] nums, int target) {
        int peak = findPeak(nums);
        if (target == nums[peak]) {
            return peak;
        }
        if (target <= nums[peak]) {
            return orderLessBinary(nums, target, 0, peak);
        }else{
            return  orderLessBinary(nums, target, peak + 1, nums.length - 1);
        }
    }

    static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (nums[start] > nums[mid]) {
                end = mid - 1;
            } else {
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
