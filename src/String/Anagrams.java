package String;

import java.util.Arrays;
import java.util.Collections;

public class Anagrams {

    private static final String STR1= "OOPS";
    private static final String STR2= "POOS";

    public static void main(String[] args) {
        System.out.println(isAnagram(STR1, STR2));
    }

    private static boolean isAnagram(String str1, String str2) {
//        char[] arr1 = str1.toCharArray();
//        char[] arr2 = str2.toCharArray() ;

        str1 = new String(str1.chars().sorted().toArray(), 0, str1.length());
        str2 = new String(str2.chars().sorted().toArray(), 0, str2.length());
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
        return str1.equals(str2);
//        return Arrays.toString(arr1).equals(Arrays.toString(arr2));
    }
}
