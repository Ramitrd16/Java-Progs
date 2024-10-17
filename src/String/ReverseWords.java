package String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "      yoda    is a   jedi  ";
//        System.out.println(Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
        String s = str.trim();
        List<String> strArr = (Arrays.asList(s.split("\\s+")));
//        List<String> strArr = Arrays.asList((s.split("//s+")));
        Collections.reverse(strArr);
        str = String.join(" ", strArr);
        System.out.println(str);
    }
}
