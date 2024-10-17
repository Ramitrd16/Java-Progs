package miscellaneous.handsOnJava;

import java.io.FileNotFoundException;

public class UseMultipleCatch {

    public static void main(String[] args) {
        try{
            throw new Exception();
        }catch (IndexOutOfBoundsException | NullPointerException fileNotFoundException){
            fileNotFoundException.getCause();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
