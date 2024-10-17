package miscellaneous.handsOnJava;

public class StaticTest {
    {
        System.out.println("non static block");
    }
    static{
        System.out.println("static block");
    }
    void m1(){
        System.out.println("m1 func");
    }
    public static void main(String[] args) {
        StaticTest  staticTest = new StaticTest();
        StaticTest  staticTest1 = new StaticTest();
        StaticTest  staticTest2 = new StaticTest();
        staticTest.m1();
        staticTest1.m1();
        staticTest2.m1();
    }
}
