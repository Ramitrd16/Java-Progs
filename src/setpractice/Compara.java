package setpractice;

import java.util.TreeSet;

public class Compara implements Comparable {

    int id;
    String name;

    Compara(int id, String name){
        this.id=id;
        this.name= name;
    }
    Compara(){
    }
    @Override
    public int compareTo(Object o) {
        if( this.id> ((Compara) o).id)
            return 1;
        if( this.id == ((Compara) o).id)
            return 0;
        return -1;
    }

    @Override
    public String toString(){
     return this.name+"-------"+this.id;
    }

    public void insertIntoSet(){
        TreeSet<Compara> treeSet = new TreeSet<>();
        treeSet.add(new Compara(1, "Rudra"));
        treeSet.add(new Compara(2, "Ramit"));
        treeSet.add(new Compara(3, "Abhishek"));
        treeSet.add(new Compara(4, "Wakar"));
        System.out.println(treeSet);
    }

    public void insertIntoSetViaMyComparator(){
        TreeSet<Compara> treeSet = new TreeSet<>(new MyComparator());
        treeSet.add(new Compara(1, "Rudra"));
        treeSet.add(new Compara(2, "Ramit"));
        treeSet.add(new Compara(3, "Abhishek"));
        treeSet.add(new Compara(4, "Wakar"));
        treeSet.add(new Compara(4, "Wakar"));
        System.out.println(treeSet);
    }


    public static void main(String[] args){
        Compara compara = new Compara();
        compara.insertIntoSet();
        compara.insertIntoSetViaMyComparator();
    }

}
