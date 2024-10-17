package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HandsOnReduce {
    public static void main(String[] args) {
        List<Integer> nums = List.of(4,6,2,6,8,10,1,3,5,7,9,0);
        int sum = nums.stream().reduce(0, (a,b)-> a+b);
        System.out.println(sum);

        int max = nums.stream().max(Comparator.comparing(Integer::intValue)).orElseThrow();
        int maxbyReduce = nums.stream().reduce((a,b)->a>b?a:b).get();
        System.out.println(max);
        System.out.println(maxbyReduce);

        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> sl = Stream.concat(list1.stream(), list2.stream()).sorted().toList();

        System.out.println(sl);
        System.out.println("------------------------------------------------------"+
                list1.stream().reduce((n1,n2)->n1+n2).get()
        );

        String str = "ramit Ramit dman Dman ramit";

        System.out.println(Arrays.stream(str.split("")).filter(strr->!strr.equals(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));


        System.out.println(List.of("ramit","dhiman","java","developer").stream().reduce("",(str1, str2)->str1+" "+str2));
        System.out.println(List.of("ramit","dhiman","java","developer").stream().max(Comparator.comparingInt(String::length)).orElseThrow());
//        System.out.println(List.of("ramit","dhiman","java","developer").stream().max(Comparator.comparing((str1, str2)-> str1.str2)).orElseThrow());
    }
}
