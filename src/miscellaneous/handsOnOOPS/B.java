package miscellaneous.handsOnOOPS;

class B extends A {
    @Override
        public void m1 () {
            System.out.println("some body in child");
        }

    @Override
        public void m2 () {
            System.out.println("some body in child");
        }
        public void m3 () {
            System.out.println("some body in child");
        }
        public static void main(String[] args) {
            A a = new B();
            a.m1();
            a.m2();
//            a.m3();// throws error cos A's reference is pointing to object of B and in a there is no m3 present -> ((B)a).m3(); valid
            a.m4();
        }

    }