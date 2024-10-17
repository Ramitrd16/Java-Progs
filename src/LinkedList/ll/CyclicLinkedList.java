package LinkedList.ll;

//1->2->3->4-5->6->7->8->9->4->

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class NodeL{
    int data;
    NodeL next;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NodeL nodeL = (NodeL) o;
        return data == nodeL.data;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    public NodeL(int data){
        this.data=data;
        this.next = null;
    }

}
public class CyclicLinkedList {

    NodeL head;
    void insert(NodeL nodeL){
        if(head == null){
            head=nodeL;
            head.next=null;
        }else{
            NodeL temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = nodeL;
        }
    }

    void display(){
        NodeL temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    void createCyclicDependency(int pos){
        NodeL temp = head ;
        while(--pos>0){
            temp = temp.next;
        }
        NodeL tt = temp;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = tt;
    }

    void removeCyclicDependency(){
        NodeL slowPtr=head;
        NodeL fastPtr=head;
        while(slowPtr.next!=fastPtr.next.next){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        NodeL nodeOfCycle =  slowPtr.next;
        nodeOfCycle.next=null;
    }

    boolean isCyclicDependency(){
        Set<NodeL> setOfNodes = new HashSet<>();
        NodeL node = head;
        while(node != null){
            if(setOfNodes.contains(node)){
                return true;
            }
            setOfNodes.add(node);
            node=node.next;
        }
        return false;
    }

    public static void main(String[] args) throws InterruptedException {
        CyclicLinkedList cyclicLinkedList = new CyclicLinkedList();
        cyclicLinkedList.insert(new NodeL(6));
        cyclicLinkedList.insert(new NodeL(3));
        cyclicLinkedList.insert(new NodeL(8));
        cyclicLinkedList.insert(new NodeL(1));
        cyclicLinkedList.insert(new NodeL(9));
        cyclicLinkedList.display();
        System.out.println("\ncreating cyclic dependency");
        cyclicLinkedList.createCyclicDependency(2);
        System.out.println("isCyclicDependency->"+cyclicLinkedList.isCyclicDependency());
        System.out.println("calling cyclic dependency removing function");
        Thread.sleep(3000);
        cyclicLinkedList.removeCyclicDependency();
        System.out.println("Cyclic dependency removed");
        System.out.println("isCyclicDependency->"+cyclicLinkedList.isCyclicDependency());
        cyclicLinkedList.display();
    }
}
