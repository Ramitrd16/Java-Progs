package sorting;

public class QuickSort {

    private static int count =0;

    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        quickSort(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.print(i+",");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start>=end){
            return;
        }
        int pi = parititon(arr, start, end);
        quickSort(arr,0,pi-1);
        quickSort(arr, pi+1, end);
    }

    private static int parititon(int[] arr, int start, int last) {
        int pivot = arr[last];
        int i=start-1;
        for(int k=start; k<= last;k++){
            if(pivot>arr[k]){
                i++;
                swap(arr, i, k);
            }
        }
        swap(arr, i+1, last);
        return i+1;
    }

    private static void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
    }


}
