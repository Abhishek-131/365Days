package Recursion;

import java.util.Scanner;

public class PrintName5Times {
    private static void PrintName(int i ,int n){
        if(i>n) return;
        System.out.println("Abhishek");
        i++;
        PrintName(i,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintName(1,n);
    }
}
