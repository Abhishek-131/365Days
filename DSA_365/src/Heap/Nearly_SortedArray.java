package Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

//Nearly Sorted Array OR Sort a K_Sorted_Array
public class Nearly_SortedArray {
    private static int[] KSortedArray(int[] arr,int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int index = 0;
        //Add element into heap and remove if minHeap_Size > k
        for (int i = 0; i< arr.length; i++) {
            minHeap.add(arr[i]);
            if(minHeap.size()>k){
                arr[index++] = minHeap.poll();
            }
        }
        // Remove remaining element form Heap
        while (!minHeap.isEmpty()){
            arr[index++] = minHeap.poll();
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {6,5,3,2,8,10,9};
        int k = 3;
        KSortedArray(arr,k);
        for (int x : arr){
            System.out.print(x +" ");
        }
    }
}


