package study.search.binary_search;

class FindRangeInArray {
    public static void main(String[] args) {
        System.out.println(searchRange(new int[]{2,5,8,8,8,9,9}, 8));
    }
    static int[] searchRange(int[] nums, int target) {
        int [] ans = {-1, -1};
        ans[0]=binarySearch(nums, target, true);
        if(ans[0] != -1){
            ans[1] = binarySearch(nums, target, false);
        }
        return ans;
    }
    private static int binarySearch(int[] arr, int target, boolean check) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid +1;
            } else {
                ans = mid;
                if(check){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}