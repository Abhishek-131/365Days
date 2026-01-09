package Recursion;

import java.util.Scanner;

public class Print1toN {
    static int i=1;
    private static void Print1ToN(int n){
        if(n == 0) return;
        System.out.println(i);
         i++;
        Print1ToN(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Print1ToN(num);
    }
}
