package sorting;

public class MergSort {
    void mergSort(){
        int[] arr = {5,12,6,10,9,1,3,16};
        int start = 0;
        int end = arr.length-1;
        mergeSort(arr, start, end);
        for(int i : arr){
            System.out.println(i);
        }
    }

    private void mergeSort(int[] arr, int start, int end) {
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(arr,start, mid);
        mergeSort(arr,mid+1, end);
        merge(arr, start, end, mid);

    }

    private void merge(int[] arr, int start, int end, int mid) {
        int[] res = new int[end-start+1];
        int k = 0;
        int i= start;
        int j = mid+1;
        while(i<=mid && j<=end ){
            if(arr[i]<arr[j])
                res[k++] = arr[i++];
            else
                res[k++] = arr[j++];
        }
        while(i<=mid){
            res[k++]= arr[i++];
        }
        while(j<=end){
            res[k++]= arr[j++];
        }
        System.arraycopy(res, 0, arr, start, res.length);
    }

}
