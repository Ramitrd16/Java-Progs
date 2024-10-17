package SlidingWindow;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPlotByCM {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 2, 1, 1, 2};
        int plot = 8;
        FindPlotByCM findPlot = new FindPlotByCM();
        System.out.println(findPlot.returnPlot(arr, plot));
    }

    private Set<List<Integer>> returnPlot(int[] arr, int plot) {

        int i= 0;
        int j=0;
        int cs = 0;
        Set<List<Integer>> res = new HashSet<>();

        while(j<arr.length){
            cs+=arr[j];
            j++;

            while(i<j && plot<cs){
                cs-=arr[i];
                i++;
            }

            if(cs==plot){
                res.add(List.of(i,j-1));
            }
        }
        return res;

    }

}
