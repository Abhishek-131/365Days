package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    private static int  HeapKthSmallest(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
      return maxHeap.poll();
    }
    public static void main(String[] args) {
        int[] arr = {4,10,7,3,20,15};
        int  k = 3;
        int ans = HeapKthSmallest(arr,k);
        System.out.println(ans);

    }
}
