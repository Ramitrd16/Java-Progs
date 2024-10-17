package strrev;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacters {
    public static void main(String[] args){

        System.out.println(countFrequencyOfCharacters("my name is Ramit"));
        System.out.println(countFrequencyOfString("my name is Ramit"));
    }

    public static Map<String,Long> countFrequencyOfCharacters(String s){
        return Arrays.stream(s.toLowerCase().split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
    public static Map<String,Long> countFrequencyOfString(String s){
        return Arrays.stream(s.toLowerCase().split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
