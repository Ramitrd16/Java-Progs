package setpractice;

import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o, Object t) {
        Compara c1 = ((Compara)o);
        Compara c2 = ((Compara)t);
        return c1.name.compareTo(((Compara) t).name);
    }
//    @Override
//    public int compare(Object o, Object t) {
//        Compara c1 = ((Compara)o);
//        Compara c2 = ((Compara)t);
//        return -1;
//    }
}
