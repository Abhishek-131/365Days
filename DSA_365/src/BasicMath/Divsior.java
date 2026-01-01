package BasicMath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Divsior {
    private static void printDivisor(int n){
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                ls.add(i);
                if((n/i) != i){
                    ls.add(n/i);
                }
            }
        }
        Collections.sort(ls);
        System.out.println(ls);
    }
    public static void main(String[] args) {
        int n = 36;
        printDivisor(n);
    }
}
