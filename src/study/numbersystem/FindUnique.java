package study.numbersystem;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = new int[]{2,7,3,3,4,2,6,4,6,8,8};
        System.out.println(findUnique(arr));
    }

    private static int findUnique(int[] arr) {
        int unique = 0;
        for (int ar:arr){
            System.out.println("[unique : "+unique+" ], [num : "+ar+" ], "+"[new unique : "+ (unique^ar)+" ]");
            unique ^= ar;
        }
        return unique;
    }

}
