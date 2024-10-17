package strrev;

public class Rev {
    public static void main(String[] args) {
        String str = "My name yo is Ramit";
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(new StringBuilder(words[i]).reverse());
            if (i != 0) {
                reversedString.append(" ");
            }
        }

        System.out.println(reversedString);
    }

}
