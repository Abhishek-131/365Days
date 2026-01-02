package Array;

public class SecondLargest {
    //Optimal
    private static int secondLargest(int[] arr){
        int n = arr.length;
        int largest = arr[0];
        int slargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }
            if(arr[i]<largest && arr[i]>slargest)
                slargest = arr[i];
        }
        return slargest;
    }
    public static void main(String[] args) {
        int[] arr = {12,3,44,5,64};
        int res = secondLargest(arr);
        System.out.println(res);
    }
}

// Brute : Sort the array and return the last second element CASE1: if all also check the element is less the last Element Eg: 1,2,3,5,7,7
// Better : First find the largest in loop1 then find the secondLargest in loop2 and return the slargest
// Optimal : take largest first element and slargest -1 if the find and largest then first replace the slargest to largest