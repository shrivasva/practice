package study.numbersystem;

public class AndOperator {
    public static void main(String[] args) {
        System.out.println(1^1);
        System.out.println(checkEven(4));
    }

    static boolean checkEven(int n) {
        return ((n & 1) == 0);
    }
}
