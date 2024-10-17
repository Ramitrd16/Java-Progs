package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> lst2 = Arrays.asList(7,8,9,10,11,12);
//        List<Integer> lst2 = Arrays.asList(7,8,9,10,11,12,13);

        List<Integer> finalBoss = Stream.concat(lst1.stream(), lst2.stream()).toList();
//        System.out.println(finalBoss);

        if(finalBoss.size()%2==0){
            int n1 = finalBoss.get(finalBoss.size()/2);
            int n2 = finalBoss.get(finalBoss.size()/2-1);
//            System.out.println(n1+" - "+n2);
            double d = (n1 + n2) /2.0;
            System.out.println(d);
        }else{
            System.out.println(finalBoss.get(finalBoss.size()/2));
        }
    }
}
