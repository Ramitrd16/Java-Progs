package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class IntegerStreams {
    public static void main(String[] args) {
        int[] arr = {3,6,2,8,9,3,6,9,5,4,2};
        OptionalInt x = Arrays.stream(arr).max();
        System.out.println(x.getAsInt());

        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
        Optional<String> s = strings.stream().max(Comparator.comparingInt(String::length));
        System.out.println(s.get());

        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        System.out.println(Stream.concat(list1.stream(),list2.stream()).toList());

        System.out.println(Stream.concat(list1.stream(),list2.stream()).sorted().toList());

        System.out.println(list1.stream().collect(Collectors.summingInt(Integer::intValue)));

        System.out.println( list2.stream().sorted(Collections.reverseOrder()).toList());


        List<Integer> list3 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list4 = Arrays.asList(2, 3, 6, 8, 10);

        List<Integer> z = list3.stream().filter(list4::contains).toList();
        System.out.println(z);


        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int kthSmall = Arrays.stream(array).sorted().skip(3-1).findFirst().orElse(-1);
        System.out.println(kthSmall);

        int kthSmallest = Arrays.stream(array).sorted().skip(1).findFirst().orElse(-1);

        int kth = Arrays.stream(array).sorted().skip(3).findFirst().orElse(-1);
        System.out.println(kth);

        List<Integer> list5 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list6 = Arrays.asList(2, 3, 6, 8, 10);

        System.out.println(Stream.concat(list5.stream(), list6.stream()).distinct().sorted().toList());

        List<String> strings1 = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
        System.out.println(strings1.stream().max(Comparator.comparingInt(String::length)));


    }


}
