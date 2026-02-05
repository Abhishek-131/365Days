package Heap;

import java.util.PriorityQueue;

public class KthLargest {
    private static int[] HeapKthLargest(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[] num = new int[minHeap.size()];
        for (int i = 0; i < minHeap.size(); i++) {
            num[i] = minHeap.poll();
        }

        return num;
    }
    public static void main(String[] args) {
        int[] arr = {4,10,7,3,20,15,11};
        int k = 3;
        int[] ans = HeapKthLargest(arr,k);

    }
}
