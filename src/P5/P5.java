package P5;

import java.util.Scanner;

public class P5 {
    public static int fib(int n){
        if(n<2) return n;
        return fib(n - 2) + fib(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
}
