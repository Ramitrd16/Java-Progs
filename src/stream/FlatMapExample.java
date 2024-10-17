package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class FlatMapExample {
    public static void main(String[] args) {
//        List<List<Integer>> listOfLists = Arrays.asList(
//            Arrays.asList(1, 2, 2, 3),
//            Arrays.asList(4, 5, 5, 6),
//            Arrays.asList(4, 5, 5, 6),
//            Arrays.asList(7, 8, 8, 9)
//        );
//
//        // Flatten the list of lists using flatMap
////        List<Integer> flattenedList = listOfLists.stream()
////                                                 .flatMap(List::stream).toList();
//
//        List<Integer> flattenedList1 = listOfLists.stream()
//                                                 .flatMap(List::stream).sorted(Comparator.reverseOrder())
//                                                    .toList();
//
//        System.out.println(flattenedList1);
//        List<Integer>  removingDuplicates = listOfLists.stream().flatMapToInt(lst->lst.stream().mapToInt(Integer::intValue)).distinct().boxed().toList();
//
int []arr={12,23,22,1};

//        List<Integer> intr = List.of(arr).stream().mapToInt(n-> Integer.valueOf(n)).boxed().filter(n->n>9 && n<20).toList();
        // Print the flattened list
//        System.out.println(intr);

        int[]chck = Arrays.stream(arr).filter(n->n>9&&n<20).toArray();
        for(int i:chck){
            System.out.println(i);
        }
    }
}