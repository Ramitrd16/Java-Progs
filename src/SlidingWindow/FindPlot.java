package SlidingWindow;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPlot {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 2, 1, 1, 2};
        int plot = 8;
        FindPlot findPlot = new FindPlot();
        System.out.println(findPlot.returnPlot(arr, plot));
    }

    public Set<List<Integer>> returnPlot(int[] arr, int plot) {
        int i = 0;
        int j = i + 1;
        int sum = arr[i];
        Set<List<Integer>> set = new HashSet<>();
        while (j <= arr.length-1) {
            if (sum == plot) {
                set.add(List.of(i, j-1));
                sum= sum-arr[i];
                i++;
            } else if (sum > plot) {
                sum = sum-arr[i];
                i++;
            } else {
                sum += arr[j];
                j++;

            }
        }
        return set;
    }
}
