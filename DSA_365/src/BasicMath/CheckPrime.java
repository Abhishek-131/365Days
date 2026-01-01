package BasicMath;
//Prime number : divided by 1 and itself
public class CheckPrime {
    private static boolean isPrime(int n){
        int cnt = 0;
        for (int i=1; i*i<=n; i++){ //sqrt(n)
            if(n%i == 0){
                cnt++;
                if((n/i) != i) cnt++;
            }
        }
        if(cnt == 2)
            return true;
        return false;
    }
    public static void main(String[] args) {
        int n =61;
        boolean res = isPrime(n);
        System.out.println(res);
    }
}

//TC: sqrt(N)
