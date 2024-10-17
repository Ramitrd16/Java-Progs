package List;

import java.util.*;

public class IteratorTest  {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);

        Iterator<Integer> itr = lst.iterator();
        while(itr.hasNext()){
//            itr.remove();
            System.out.println(itr.next());
        }

        Spliterator<Integer> ibl = lst.spliterator();

//        ListIterator<Integer> intItr = lst.listIterator();
//        while(intItr.hasNext()){
//            intItr.set(1);
////            intItr.forEachRemaining(itrr->(2*itrr.intValue()));
//        }

        FunctionalinterfaceExample functionalinterfaceExample = ((a,b)->a+b);
        int a= functionalinterfaceExample.sum(5,6);
        System.out.println(a);
    }

}
