package map;

import java.util.HashMap;
import java.util.Map;


class CustomHash{
    String key;

    public CustomHash(String key){
        this.key= key;
    }

    @Override
    public int hashCode(){
        return 1;
    }
}
public class HashCollusion {
    public static void main(String[] args) {

        Map<CustomHash, String> hashCollusion = new HashMap<>();
        hashCollusion.put(new CustomHash("aihf"), "akhf");
        hashCollusion.put(new CustomHash("aihsdkjf"), "akhf");
        hashCollusion.put(new CustomHash("aihsdkjkfjf"), "akhf");
        hashCollusion.put(new CustomHash("aihsdkjkfjsekf"), "akhf");

        System.out.println(hashCollusion);
        System.out.println(hashCollusion.size());


    }

    @Override
    public int hashCode(){
        return 1;
    }
}
