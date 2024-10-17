package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DemoMapToInt {
    public static void main(String[] args){
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        List<Integer> lengths = words.stream().mapToInt(String::length).boxed().toList();
        System.out.println(lengths);

        Integer sum = words.stream().mapToInt(String::length).sum();
        System.out.println(sum);

        IntStream anonymous = words.stream().mapToInt(String::length).distinct();
        System.out.println(anonymous);
    }
}
