package Recursion;

import java.util.Scanner;

public class CheckPalindrome {
    public static Boolean isPalindromeRec(String str,int start,int end){
        if(start >= end)
            return true;

        if(str.charAt(start) != str.charAt(end))
            return false;

        return isPalindromeRec(str,start++,end--);
    }

    public static Boolean isPalindrome(String str){
     return isPalindromeRec(str,0,str.length()-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Boolean res = isPalindrome(str);
        System.out.println(res);
    }
}
