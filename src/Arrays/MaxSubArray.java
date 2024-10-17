package Arrays;

/*
Maximum Subarray Sum
Implement a function that takes an input a vector of integers,
and prints the maximum subarray sum that can be formed.
A subarray is defined as consecutive segment of the array. If all numbers are negative, then return 0.
Input

{-1,2,3,4,-2,6,-8,3}
*/
public class MaxSubArray {
    //kdane's theorem
    public static void main(String[] args) {
        int[] arr = {-1,2,-3,4,-2,6,8,3};
        findMaxSubArrSum(arr);
    }

    private static void findMaxSubArrSum(int[] arr) {
        int maxSum = arr[0];
        for(int i=1; i<arr.length; i++){
            maxSum += arr[i];
            maxSum = Math.max(maxSum, arr[i]);
        }
        System.out.println(maxSum);
    }
}
