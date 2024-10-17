package setpractice;

import java.util.Comparator;

public class MyComparatorCustom implements Comparator {

    @Override
    public int compare(Object o, Object t) {
        Integer c1 = ((Integer)o);
        Integer c2 = ((Integer)t);
        return 1;
    }
}
