package BasicMath;
//Ecliudient
public class GCD {
    private static int printGCD(int a, int b){
        while (a>0 && b>0){
            if(a>b)
                a = a % b;
            else
                b = b % a;
        }
        if(a == 0)
            return b;
        else
            return a;
    }

    public static void main(String[] args) {
        int n1 = 9;
        int n2 = 12;
        int res = printGCD(n1,n2);
        System.out.println(res);
    }
}


// TC : o(log Fi(Min(a,b))