package miscellaneous.Functional;

@FunctionalInterface
interface MyFunctionalInterface {
    void sayMessage(String message);
}
public class CheckFunc {
    public static void main(String[] args) {


        MyFunctionalInterface myFunctionalInterface = ((str) -> System.out.println(str));
        myFunctionalInterface.sayMessage("Lord Rudra ka Bhakt Mai");
    }
}
