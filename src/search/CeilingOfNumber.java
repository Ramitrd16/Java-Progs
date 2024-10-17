package search;

public class CeilingOfNumber {

    public static int searchInsert(int[] nums, int target) {
        int beg = 0; int end = nums.length-1;
        return findCeilingNumber(nums, beg, end, target);
    }
    private static int findCeilingNumber(int[] nums, int beg, int end, int target){
        if(beg<=end){
            int mid = (beg+end)/2;
            if(nums[mid]>=target && nums[mid-1]<target){
                return mid;
            }
            else if(nums[mid]>target){
                return findCeilingNumber(nums, beg, mid-1, target);
            }
            else{
               return findCeilingNumber(nums, mid+1, end, target);
            }
        }
        return 0;
    }

    public static void main(String[] args){
        int arr[] = {1,3,5,6};
        System.out.println(searchInsert(arr, 5));
    }
}
