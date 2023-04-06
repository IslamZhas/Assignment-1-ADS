package P6;

import java.util.Scanner;

public class P6 {
    public static int pow(int n, int i){
        if (i == 1) return n;
        return pow(n, i-1)*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(pow(n,i));
    }
}
