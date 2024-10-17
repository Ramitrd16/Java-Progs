package String;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IsoGram {
    public static void main(String[] args) {
        String str = "ramitgfskkj";
        Optional<Long> b =  Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).values().stream().filter(val-> val>1).findFirst();
        if (b.isPresent()){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
}
