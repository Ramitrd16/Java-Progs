package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KthLargest {
    public static void main(String[] args){
//        int[] arr = {1,1,3,4,6,6,7,8,9,10};
//        int max=0;
//        for(int i:arr){
//            max = Math.max(max, i);
//        }
//        for(int i = arr.length-1; i>=0; i--){
//            System.out.println(arr[i]);
//
//        }
//        System.out.println(arr[arr.length-1]);
//        System.out.println(max);


        int[] nums = {3,2,3,1,2,4,5,5,6};
        Map<Integer, Integer> ele = new HashMap<>();
        Arrays.sort(nums);
        int idx =1;
        ele.put(idx, nums[nums.length-1]);
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i+1]!=nums[i]){
                idx++;
                ele.put(idx, nums[i]);
            }
        }
       System.out.println(ele.get(2));

    }
}
