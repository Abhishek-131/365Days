package Backtracking;

import java.util.Scanner;

public class PrintNTo1 {
    private static void printNto1(int i,int N){
        if(i>N) return;
        printNto1(i+1,N);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNto1(1,n);
    }
}
