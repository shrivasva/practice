package study.other;

public class Palindrome {
    public static void main(String[] args) {
        String s = "abccba";
        System.out.println(checkPalindrome(s));
    }

    private static boolean checkPalindrome(String string) {
        if(string == null || string.length()==0){
            return false;
        }
        int start = 0;
        int end = string.length()-1;
        while(start <= end){
            if(string.charAt(start) == string.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
}
