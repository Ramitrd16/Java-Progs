package LinkedList.ll;

class Node1{
    int data;
    Node1 next;
    public Node1(int data){
        this.data=data;
        this.next=null;
    }
}
public class AddLinkedList {
    Node1 head;
    void insert(Node1 data){
        if (head == null){
            head = data;
            head.next = null;
        }else{
            Node1 node = head;
            while(node.next!=null){
                node = node.next;
            }
            node.next = data;
        }
    }

    void display(){
        Node1 node = head;
        while(node!=null){
            System.out.print(node.data+"->");
            node = node.next;
        }
    }

    void reverse(){
        Node1 node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        node.next.next=node.next;
        node.next=null;
        reverse();
//        System.out.println("\n"+node.data);
    }


    public static void main(String[] args) {
        AddLinkedList lst = new AddLinkedList();
        lst.insert(new Node1(2));
        lst.insert(new Node1(4));
        lst.insert(new Node1(6));
        lst.insert(new Node1(8));
        lst.insert(new Node1(10));
        lst.display();
        lst.reverse();
        lst.display();
    }
}
