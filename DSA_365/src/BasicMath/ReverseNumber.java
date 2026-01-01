package BasicMath;

import java.util.Scanner;

public class ReverseNumber {
    private static int RevNumber(int n){
        boolean isNegative = false;
        if(n<0){
            isNegative = true;
            n = -n;
        }
       int revNum = 0;
        while (n>0){
            int lastNumber = n%10;
            revNum = revNum*10 + lastNumber;
            n = n/10;
        }
        return isNegative ? -revNum :  revNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        int reverse = RevNumber(num); //123
        System.out.println(reverse);
    }
}
