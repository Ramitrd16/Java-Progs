package miscellaneous.handsOnJava;

import java.util.Collections;
import java.util.List;

public class CollArrLst {
    public static void main(String[] args) {
        List<Integer> unmdList = List.of(1,2,3,4,5,6,7,8,9,0);
        Collections.unmodifiableList(unmdList);

        int no = unmdList.stream().sorted().skip(3).findFirst().get();
//        unmdList.add(123);
        System.out.println(no);
    }
}
