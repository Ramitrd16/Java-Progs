package stream;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "ramit Ramit dman Dman ramit";

        Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//        System.out.println(Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
//        System.out.println(str.chars().mapToObj(ch->(char)ch).filter(ch->ch != ' ').collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        System.out.println(Arrays.stream(str.split("")).filter(s-> !Objects.equals(s, " ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        //reverse String
        char[] ch = {'a','b','c','d'};
        System.out.println(new String(ch));
    }
}
