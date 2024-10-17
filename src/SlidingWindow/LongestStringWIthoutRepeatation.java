package SlidingWindow;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestStringWIthoutRepeatation {
    public static void main(String[] args) {

//        char[] arr = {'a', 'b', 'b', 'a', 'c', 'd', 'e', 'f', 'a', 'l', 'm', 'n', 'p', 'q', 'r'};
        char[] arr = {'a','b','c','a', 'c','e','b','a'};
        System.out.println(getLongString(arr));
    }

    public static String getLongString(char[] arr) {

        Set<Character> chs = new LinkedHashSet<>();
        int i = 0;
        int j = 0;
        int size = Integer.MIN_VALUE;
        String result = "";
        while (j < arr.length) {

            if (chs.contains(arr[j])) {
                if (size < chs.size()) {
                    size= chs.size();
                    result = chs.toString();

                    while (arr[i] != arr[j]) {
                        i++;
                    }
                }
                chs.clear();
                i++;
                j = i;
            }
            chs.add(arr[j]);
            j++;
        }

        if (chs.size() > result.length()) {
            result = chs.toString();
            return result;
        }
        return result;

    }

}
