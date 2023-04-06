package P7;

import java.util.Scanner;

public class P7 {
    public static void swap(char[] ch, int i, int j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
    public static void permutationRecursive(char[] ch, int index){
        if(index == ch.length -1) System.out.println(String.valueOf(ch));;
        for(int i = index; i < ch.length;i++){
            swap(ch, index, i);
            permutationRecursive(ch, index + 1);
            swap(ch, index, i);
        }
    }
    public static void findPerm(String str){
        if(str == null || str.length() == 0) return;
        permutationRecursive(str.toCharArray(), 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        findPerm(str);
    }
}
