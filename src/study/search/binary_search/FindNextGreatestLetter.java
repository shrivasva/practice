package study.search.binary_search;

class FindNextGreatestLetter {
    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'e', 'e', 'e', 'e', 'n', 'n', 'n'},'f'));
    }
    static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        if(target >= arr[arr.length-1]){
            return arr[0];
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}