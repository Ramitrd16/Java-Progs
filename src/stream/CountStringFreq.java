package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountStringFreq {
    public static void main(String[] args) {
        String str = " jygjm zucf jd bck ua g f u   serjsn f jdsf bmsd fjncx zbnv m";
        Map<String, Long> tfy = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        SortedMap<String, Long> tfy1 = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
        System.out.println(tfy);
        System.out.println(tfy1);
    }


}
