package miscellaneous;

interface functionalTest{
    int sum(int a, int b);
}
public class ImplementingFunctional {
    public static void main(String[] args) {

        functionalTest functionalTest = ((a,b)-> a+b);
        int c = functionalTest.sum(5,6);
        System.out.println(c);

        functionalTest functionalTest1 = new functionalTest() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        int d = functionalTest1.sum(5,6);
        System.out.println(d);
    }
}
