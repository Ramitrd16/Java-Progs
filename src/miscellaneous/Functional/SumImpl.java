package miscellaneous.Functional;

public class SumImpl {
    public static void main(String[] args) {
        Sum sum = new Sum() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        int s = sum.sum(5,6);
        System.out.println(s);



        Sum sm = ((a,b)->a+b);
        System.out.println(sm.sum(5+3,6));
    }
}
