package Arrays;

/*Given, an array of size n. Find an element that divides the array into two sub-arrays with equal sums.

Examples: Input: 1 4 2 5 0 Output: 2
Explanation: If 2 is the partition, subarrays are : [1, 4] and [5]
Input: 2 3 4 1 4 5 Output: 1
Explanation: If 1 is the partition, Subarrays are : [2, 3, 4] and [4, 5]
Input: 1 2 3 Output: -1
Explanation: No sub-arrays possible. return -1
*/
public class DivideArray {
    public static void main(String[] args) {
        int arr[] = {3,1,2, -2, 6};
        System.out.println(findPartitionElement(arr));
    }

    private static int findPartitionElement(int[] arr) {
        int leftPtr = 0;
        int rightPtr = arr.length-1;
        int sumLeft = arr[leftPtr];
        int sumRight = arr[rightPtr];
        while(leftPtr < rightPtr){
            if(sumLeft == sumRight && leftPtr+1 == rightPtr-1){
                return arr[leftPtr+1];
            } else if (sumLeft < sumRight) {
                leftPtr ++;
                sumLeft+=arr[leftPtr];
            }else if (sumLeft > sumRight){
                rightPtr--;
                sumRight+=arr[rightPtr];
            }else{
                leftPtr++;
                sumLeft+=arr[leftPtr];
                rightPtr--;
                sumRight+=arr[rightPtr];
            }
        }
        return -1;
    }
}
