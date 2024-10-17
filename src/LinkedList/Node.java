package LinkedList;

public class Node {
    int data;
    Node next;
        public Node(int data){
            this.data = data;
            this.next= null;

    }

}
class CreateLinkedList{
    Node head;
    CreateLinkedList(){
        this.head = null;
    }
    public void add(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            head.next = null;
        }else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = n;
        }
    }
    public void display(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    void addAtLast(int num){
        Node node = new Node(num);
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = node;

    }

    void addAtFirsl(int num){
        Node n = new Node(num);
       n.next = head;
       head = n;

    }
    public static void main(String[] args) {
        CreateLinkedList ll = new CreateLinkedList();
        ll.add(3);
        ll.add(4);
        ll.add(2);
        ll.add(1);
        ll.add(5);
        ll.addAtLast(24);
        ll.addAtFirsl(24);
        ll.display();
    }
}
