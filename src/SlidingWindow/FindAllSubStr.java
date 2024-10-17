package SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAllSubStr {
    public static void main(String[] args){
        String str = "hello";
        String subStr = "oel";
        System.out.println(checkSubStr(str, subStr));
    }

    private static String checkSubStr(String str, String subStr) {
        Map<Character, Integer> subMap = new HashMap<>();
        for (char ch : subStr.toCharArray()) {
            if (subMap.containsKey(ch)) {
                int val = subMap.get(ch)+1;
                subMap.put(ch, val);
            } else {
                subMap.put(ch, 1);
            }
        }
//        Map<String,Long> ss = Arrays.stream(subStr.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int i = 0;

        //finding any first character from the subString
        while (!subMap.containsKey(str.charAt(i))) {
            i++;
        }

        int j = 0;

        int sum = subMap.values().stream().mapToInt(Integer::intValue).sum();

        while (j < str.length() && sum > 0) {
            if (subMap.containsKey(str.charAt(j)) && subMap.get(str.charAt(j))>0) {
                subMap.put(str.charAt(j), subMap.get(str.charAt(j))-1);
                sum--;
            }
            j++;
        }

        return str.substring(i,j);
    }

}
