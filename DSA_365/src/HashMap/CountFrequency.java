package HashMap;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4,2};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int x : arr){
            int num = map.getOrDefault(x,0)+1;
            map.put(x,num);
        }
        System.out.println(map);
    }
}
