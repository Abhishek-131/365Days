package Array;

import java.util.HashSet;

public class RemoveDuplicateElement {
    private static int removeDuplicate(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,23,45,23,45,7};
        int res = removeDuplicate(arr);
        System.out.println(res);
    }
}

//Brute : Add the element into Set Data Structure which contain unique element and the again add element into