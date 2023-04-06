package P10;

import java.util.Scanner;

public class P10 {
    public static int greatesDiv(int a, int b){

        if(b != 0){
            return greatesDiv(b, a%b);
        }
        else return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(greatesDiv(a,b));
    }
}
