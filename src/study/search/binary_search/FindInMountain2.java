package study.search.binary_search;

public class FindInMountain2 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,3,5}, 2));
    }

    static int search(int[] nums, int target) {
        int peak = findPeak(nums);
        if (target == nums[peak]) {
            return peak;
        }
        int ans = orderLessBinary(nums, target, 0, peak);
        if (ans == -1 && peak != nums.length - 1) {
            ans = orderLessBinary(nums, target, peak + 1, nums.length - 1);
        }
        return ans;
    }

    static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == 0) {
                return mid ;
            }
            if (nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }
            if (nums[mid - 1] < nums[mid]) {
                start = mid;
                if(start == mid){
                    return mid;
                }
            }

        }
        return start;

    }

    private static int orderLessBinary(int[] nums, int target, int start, int end) {
        boolean isDesc = nums[start] > nums[end];
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (isDesc) {
                if (target < nums[mid]) {
                    start = mid + 1;
                } else if (target > nums[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
