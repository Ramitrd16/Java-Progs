package String;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RomanToInt {

    public static void main(String[] args) {
        String[] romanSymbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        int number = 1005;
        StringBuilder stringBUilder = new StringBuilder();
        for(int i=0; number!=0; i++){
            while(number>=values[i]){
                stringBUilder.append(romanSymbols[i]);
                number-=values[i];
            }
        }
        System.out.println(stringBUilder.toString());

        }

    static String romanToInteger(int num) {
        String[] romanSymbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        StringBuilder roman = new StringBuilder();
        for (int i = 0; num != 0; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(romanSymbols[i]);
            }
        }
        return roman.toString();
    }
}
