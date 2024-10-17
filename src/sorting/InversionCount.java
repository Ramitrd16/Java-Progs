package sorting;

public class InversionCount {

    private static int count =0;

    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        int start = 0;
        int end = arr.length - 1;
        int cnt = invSort(arr, start, end);
        System.out.println(cnt);
    }

    private static int invSort(int[] arr, int start, int end) {
        if(start>=end){
            return 0;
        }
        int count=0;
        int mid = (start+end)/2;
        invSort(arr, start, mid);
        invSort(arr, mid+1, end);
        return countInversions(arr, start, mid, end);
    }

    private static int countInversions(int[] arr, int start, int mid, int end) {
        int i=start;
        int j=mid+1;
        while(i<=mid && j<=end){
            if(arr[i]>arr[j]){
                count += mid-i+1;
                j++;
            }
            else{
                i++;
            }
        }
        return count;
    }


}
