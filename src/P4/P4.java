package P4;

import java.util.Scanner;

public class P4 {
    public static int fact(int n){
        if(n == 0 || n == 1) return 1;
        return fact(n - 1) * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
