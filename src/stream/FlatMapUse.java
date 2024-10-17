package stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapUse {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("str1","str2","str3"),
                Arrays.asList("str4","str5","str6")
        );
        List<String> list1 = list.stream().flatMap(str->str.stream()).toList();
        System.out.println(list1);

    }
}
