package Backtracking;

import java.util.Scanner;

public class Print1ToN {
    private static void print1ToN(int i,int N){
        if(i<1) return;
        print1ToN(i-1,N);
        //Print Line after the function call
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        print1ToN(N,N);
    }
}
