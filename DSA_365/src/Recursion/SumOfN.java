package Recursion;

import java.util.Scanner;

public class SumOfN {
    private static int sumOfN(int N,int sum){
        if(N<1){
            return sum;
        }
       return sumOfN(N-1,sum+N);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = sumOfN(num,0);
        System.out.println(res);
    }
}
