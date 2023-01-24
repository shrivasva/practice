package study.pattern;

public class Pattern {

    public static final String PATTERN_TO_PRINT = "@ ";
    public static final int PATTERN_ROWS = 7;

    private static void separate() {
        System.out.println("|-------------------|");
    }

    public static void main(String[] args) {

        separate();
        pattern1(PATTERN_ROWS);
        separate();
        pattern2(PATTERN_ROWS);
        separate();
        pattern3(PATTERN_ROWS);
        separate();
        pattern4(PATTERN_ROWS);
        separate();
        pattern5(PATTERN_ROWS);
        separate();
        pattern6(PATTERN_ROWS);
        separate();
    }

    private static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(PATTERN_TO_PRINT);
            }
            System.out.println();
        }
    }

    private static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(PATTERN_TO_PRINT);
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(PATTERN_TO_PRINT);
            }
            System.out.println();
        }

    }

    private static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            int columnToPrint = i <= n / 2 ? i + 1 : n - i;
            for (int j = 0; j < columnToPrint; j++) {
                System.out.print(PATTERN_TO_PRINT);
            }
            System.out.println();

        }
    }

    private static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            int starToPrint = i < n / 2 ? i+1 : n - i;

            int spaceAToPrint = n/2 - starToPrint;
            for (int j = 0; j < spaceAToPrint; j++) {
                System.out.print("_");
            }
            for (int j = 0; j < starToPrint; j++) {
                System.out.print(PATTERN_TO_PRINT);
            }
            System.out.println();

        }
    }
    private static void pattern20(int n) {
        for (int i = 0; i < n; i++) {
            int starToPrint = i < n / 2 ? i+1 : n - i;

            int spaceAToPrint = n/2 - starToPrint;
            for (int j = 0; j < spaceAToPrint; j++) {
                System.out.print("_");
            }
            for (int j = 0; j < starToPrint; j++) {
                System.out.print(PATTERN_TO_PRINT);
            }
            System.out.println();

        }
    }
}
