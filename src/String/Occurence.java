package String;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Occurence {
    public static void main(String[] args) {
        String str = "My name is Ramit Dhiman";

        System.out.println(str.chars().mapToObj(m->(char)m).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }
}
