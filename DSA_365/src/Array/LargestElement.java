package Array;

import java.util.Scanner;

public class LargestElement {
    //Largest Element
    private static int largestElement(int[] arr){
        int n = arr.length;
        int largest = arr[0]; //take first element as a largest element
        for (int i = 1; i < n; i++) {
              if(arr[i]>largest){
                  largest = arr[i];
              }
        }
        return largest;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Taking How many number want to print
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
// Taking input array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
             arr[i]= sc.nextInt();
        }

        int res = largestElement(arr);
        System.out.println(res);


    }
}


//Brute : Sort the element and return last Element which is the largest

//Better :