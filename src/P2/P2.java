package P2;

import java.util.Scanner;

public class P2 {
    public static double findAvarege(int[] arr, int n) {
        if (n == 1) {
            return arr[n - 1];
        } else return (findAvarege(arr, n-1) * (n - 1) + arr[n - 1]) / n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findAvarege(arr, n));
    }
}
