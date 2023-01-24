package study.recursion;

public class FindIthBit {
    public static void main(String[] args) {
        int num = 00101;
        String binary ="10110101011010101";
        System.out.println(convertToDecimal(Long.parseLong(binary)));
        System.out.println(findBit(Long.parseLong(binary), 4));
    }

    private static int convertToDecimal(long s) {
        int i = 0;
        int ans = 0;
        while (s != 0) {
            ans += s % 10 * Math.pow(2, i);
            s = s / 10;
            i++;
        }
        return ans;
    }

    private static int findBit(long bit, int i) {
        return (int) (bit & (1 << i - 1));
    }
}
