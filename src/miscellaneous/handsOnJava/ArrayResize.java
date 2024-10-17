package miscellaneous.handsOnJava;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

class ArrayResize {
    public static void main(String[] args) {
        int[] oldArray = {1,2,3,4,5};
        int newSize = 10; // resize to 10 elements
        int[] newArray = Arrays.copyOf(oldArray, newSize);
        int[] new1Array = new int[3];
        System.arraycopy(oldArray,0,new1Array,0,3);
        oldArray = null;
        //printing elements of new array
//        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(new1Array));
    }
}