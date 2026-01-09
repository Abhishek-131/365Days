package Recursion;

public class ReverseArray {
    private static void reverseArray(int[] arr,int i, int n){
        if(i>=n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reverseArray(arr,i+1,n);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        reverseArray(arr,0,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
