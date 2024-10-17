package miscellaneous.handsOnJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapConCurrentMod {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        map.put("c","c");
        map.put("d","d");
        map.put("e","e");
        map.put("f","f");
        Iterator<String> itr = map.keySet().iterator();
        while(itr.hasNext()){
            String key = itr.next();
            if(key.equals("c")){
                itr.remove();
            }
        }
        System.out.println(map);
//        for(String key: map.keySet()){
//            if(key.equals("c")){
//                map.remove("c");
//            }
//        }
    }
}