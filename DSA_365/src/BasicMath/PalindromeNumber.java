package BasicMath;

public class PalindromeNumber {
    private static boolean isPalindrome(int n){
       int rev = 0;
       int dup = n;
        while (n>0){
            int lastNumber = n % 10;
            rev = rev * 10 + lastNumber;
            n = n/10;
        }
        if(rev == dup)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 1231;
        boolean res = isPalindrome(n);
        System.out.println(res);

    }
}
