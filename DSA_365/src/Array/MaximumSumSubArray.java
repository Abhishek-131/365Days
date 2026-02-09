package Array;

public class MaximumSumSubArray {
    public static int maxSubarraySum(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<arr.length; i++){
            sum += arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
}
