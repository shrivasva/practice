package study.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(fiboByFormula(i));
        }

    }
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    static int fiboByFormula(int n){
         return (int) ((Math.pow((1+Math.sqrt(5))/2,n) - Math.pow((1+-Math.sqrt(5))/2,n))/Math.sqrt(5));
    }
}
