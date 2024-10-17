package strrev;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

//explanation
/*Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
*/
public class LongestPalindromicString {
    public static void main(String[] args) {
        String str = "mnoponm";
        int wSize = 2;
        String op = "";
        int size = Integer.MIN_VALUE;
        if (checkPalindrome(str)) {
            op = str;
        } else {
            while (wSize < str.length()) {
                for (int i = 0; i < str.length() - wSize; i++) {
                    String s = str.substring(i, i + wSize);
                    if (checkPalindrome(s) && (size < s.length())) {
                        size = s.length();
                        op = s;
                    }
                }
                wSize++;
            }
        }
        System.out.println(op);
    }

    static boolean checkPalindrome(String str) {
        return str.contentEquals(new StringBuilder(str).reverse());
    }
}
