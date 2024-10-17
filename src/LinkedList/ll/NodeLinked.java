package LinkedList.ll;

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class NodeLinked{
    Node head;

    void insert(Node node){
        if(head == null){
            head = node;
            head.next = null;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp= temp.next;
            }
            temp.next = node;
        }
    }

    void insertAtMiddle(Node newNode, int pos){
        Node node = head;
        while(--pos>0){
            node=node.next;
        }
        Node temp = node.next;
        node.next=newNode;
        newNode.next = temp;
    }
    void insertAtEnd(Node newNode){
        Node node = head;
        while(node.next!=null){
            node=node.next;
        }
        node.next=newNode;
    }

    void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.data+"->");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        NodeLinked nodeLinked = new NodeLinked();
        nodeLinked.insert(new Node(5));
        nodeLinked.insert(new Node(6));
        nodeLinked.insert(new Node(5));
        nodeLinked.insert(new Node(6));
        nodeLinked.insert(new Node(5));
        nodeLinked.insert(new Node(6));
        nodeLinked.insertAtMiddle(new Node(3), 3);
        nodeLinked.insertAtEnd(new Node(8));
        nodeLinked.display();
    }
}
