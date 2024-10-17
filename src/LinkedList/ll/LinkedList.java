package LinkedList.ll;

public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

        public LinkedList insert(LinkedList lst, int data){
            if(lst.head==null){
              lst.head =  new Node(data);
            }
            else{
                Node last = lst.head;
                while(last.next!=null){
                    last = last.next;
                }
                last.next = new Node(data);
            }
            return lst;
        }
        public void printList(LinkedList list){
            if(list == null){
                System.out.println("nothing is here");
            }
            Node ll = list.head;
            while(ll!=null){
                System.out.print(ll.data+" -> ");
               ll = ll.next;
            }


        }
        public static void main(String[] args){
            LinkedList list = new LinkedList();
            list = list.insert(list, 2);
            list = list.insert(list, 5);
            list = list.insert(list, 8);
            list = list.insert(list, 1);
            list = list.insert(list, 4);
            
           list.insertAtFirst(5);

            list.printList(list);

        }


    private void insertAtFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }


}
