package miscellaneous.handsOnJava;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
}
public class ReverseLinkedList {

    Node reverseLinkedList (Node head){
        Node node = head, prev =null, next;
        while(node!=null){
            next = node.next;
            node.next = prev;
            prev= node;
            node = next;
        }
        return prev;
    }

    void printList(Node head){
        Node node = head;
        while(node!=null){
            System.out.print(node.data+"->");
            node = node.next;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        ReverseLinkedList list = new ReverseLinkedList();
        list.printList(head);
        Node newNode = list.reverseLinkedList(head);
        System.out.println("after reversing");
        list.printList(newNode);

    }
}
