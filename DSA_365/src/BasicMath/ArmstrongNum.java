package BasicMath;

public class ArmstrongNum {
    private static boolean isArmstrongNumber(int n){
        int sum = 0;
        int dup = n;
        while (n>0){
            int lastNumber = n %10;
            sum = sum + (int)Math.pow(lastNumber,4);
            n = n/10;
        }
        if(sum == dup) return true;
        return false;
    }
    public static void main(String[] args) {
        int n = 1634;
        boolean res = isArmstrongNumber(n);
        System.out.println(res);

    }
}
