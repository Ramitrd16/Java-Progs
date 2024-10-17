package setpractice;

import java.util.TreeSet;

public class CustomTree  {
    static void insert(){
        TreeSet<Integer> treeSet = new TreeSet<>(new MyComparatorCustom());
        TreeSet<String> set = new TreeSet<>();
        set.add("asf");
        set.add("asfs");
        set.add("asfswd");
        set.add("asfswdefsd");
        set.add("asfswdefsd");
        set.add("asfswdefsd");
        System.out.println(set);





//        treeSet.add(1);
//        treeSet.add(1);
//        treeSet.add(10);
//        treeSet.add(10);
//        treeSet.add(4);
//        treeSet.add(4);
//        treeSet.add(7);
//        treeSet.add(7);
//        treeSet.add(8);
//        treeSet.add(8);
//        System.out.println(treeSet);
    }
    public static void main(String[] args){
        insert();
    }
}
