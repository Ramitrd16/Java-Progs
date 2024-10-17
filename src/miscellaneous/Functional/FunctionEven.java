package miscellaneous.Functional;

interface Even{
    boolean isEven(int no);
}
public class FunctionEven {

    public static void main(String[] args) {
        Even even = (no -> no%2==0);
        System.out.println(even.isEven(11));
    }
}
