package miscellaneous.handsOnOOPS;

public class ClassA {//implements InterfaceA, InterfaceB{
    //@Override
    public String name() {
        return "called";
    }
    public ClassA name1() {
        return new ClassA();
    }

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.name();
    }


}

class ClassB extends ClassA{
    public String name() {
        return "rkue";
    }

    @Override
    public ClassB name1() {
        return new ClassB();
    }

    public static void main(String[] args) {
        ClassB classB = new ClassB();
        ClassA classA = new ClassB();
        System.out.println(classB.name());
        System.out.println(classA.name());
        System.out.println(classA.name1());
    }
}