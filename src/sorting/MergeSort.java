package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
//        int[] arr = {1, 20, 6, 4, 5, 16,200,103,-1,15,3,1};
        int start = 0;
        int end = arr.length - 1;

        mergeSort(arr, start, end);
        for (int no : arr) {
            System.out.print(no + ",");
        }
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);

    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int ar[] = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                ar[k++] = arr[i++];
            } else {
                ar[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            ar[k++] = arr[i++];
        }
        while (j <= end) {
            ar[k++] = arr[j++];
        }
        System.arraycopy(ar, 0, arr, start, ar.length);
    }

}
