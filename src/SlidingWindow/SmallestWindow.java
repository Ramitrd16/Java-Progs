package SlidingWindow;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SmallestWindow {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 2, 1, 1, 2};
        int plot = 8;
       System.out.println(smallestWindow(arr, plot));
    }

    private static Set<List<Integer>> smallestWindow(int[] arr, int plot) {
        int i =0;
        int j=0;
        int cs = 0;
        int small = Integer.MAX_VALUE;
        Set<List<Integer>> sm = new HashSet<>();
        while(j<arr.length){
            cs+=arr[j];
            j++;

            while(i<j && plot<cs){
                cs-=arr[i];
                i++;
            }

            if(cs==plot && small>(j-1-i)){
                small = j-1-i;
                sm.clear();
                sm.add(List.of(i,j-1));
            }
        }
        return sm;
    }
}
