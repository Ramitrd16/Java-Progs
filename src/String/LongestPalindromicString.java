package String;

public class LongestPalindromicString {
    public static void main(String[] args){
        String str = "abb";
//        String str = "babaabab";
        System.out.println(longestPalindrome(str));
    }

    private static String longestPalindrome(String s) {
        String sts = new StringBuffer(s).reverse().toString();
        int j = 0;
        int l = 0;
        String string = "";
        if(s.equals(sts)){
            return s;
        }

        if(s.length()>2) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == sts.charAt(i)) {
                    continue;
                } else {
                    if (l < i - j - 1) {
                        string = s.substring(j + 1, i);
                        l = Math.max(l, i - j - 1);
                    }
                    j = i;
                }
            }
        }else{
            return String.valueOf(s.charAt(0));
        }
        return string;
        }

}
