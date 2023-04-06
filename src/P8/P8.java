package P8;

import java.util.Scanner;

public class P8 {
    public static void isDig(char[] ch, int index){
        if(ch.length  == index) {
            System.out.println("Yes");
            return;
        }
        if (ch[index] >= '0' && ch[index] <= '9') {
            isDig(ch, index + 1);
        } else System.out.println("No");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        isDig(str.toCharArray(), 0);
    }
}
