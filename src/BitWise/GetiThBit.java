package BitWise;

import java.util.Optional;

public class GetiThBit {
    public static void main(String[] args){
        String primos =  null;
        System.out.println("can it be null.");
        System.out.println(Optional.ofNullable(primos));
        primos = null;
        System.out.println(Optional.ofNullable(primos));
    }
}
