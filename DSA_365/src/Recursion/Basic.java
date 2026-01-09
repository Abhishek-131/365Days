package Recursion;

public class Basic {
    private static void printValue(int cnt){
        if(cnt == 4){
            return;
        }
        System.out.println(cnt);
        cnt++;
        printValue(cnt);
    }
    public static void main(String[] args) {
        printValue(0);
    }
}
