package BitWise;

import java.security.SecureRandom;
import java.util.Random;

public class Pass {
    private static final String UPPER_CASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_+-=[]{}|;:',.<>?";
    public static void main(String[] args){
        SecureRandom random = new SecureRandom();

        String chars = String.valueOf(UPPER_CASE_CHARACTERS.charAt(random.nextInt(4)));
        System.out.println(chars);


    }
}
