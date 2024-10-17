package stream;

public class Test {
    Test(){
        System.out.println("1");

    }
    static int a=20;
    static {
        a++;
        System.out.println(a);
    }
    {
        System.out.println("--");
    }
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();

    }
}
