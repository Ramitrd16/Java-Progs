package String;

import java.util.Arrays;
import java.util.List;

public class LexoGraphicalySmallestStr {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("a", "ab", "aba");

        StringBuilder ss = new StringBuilder();
        arr.sort((s1, s2) -> (s1 + s2).compareTo(s2 + s1));
        for (String s : arr) {
            ss.append(s);
        }
        System.out.println(ss);
//
//        List<String> list = Arrays.asList("a", "ab", "aba");
//
//        // Sort the list based on the custom comparator
//        list.sort((s1, s2) -> (s1 + s2).compareTo(s2 + s1));
//
//        // Concatenate all the strings in the sorted list
//        StringBuilder result = new StringBuilder();
//        for (String s : list) {
//            result.append(s);
//        }
//
//        System.out.println("The lexicographically smallest concatenated string is: " + result);
//    }

    }
}
