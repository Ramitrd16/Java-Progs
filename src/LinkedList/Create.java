package LinkedList;

public class Create {

    int val;
    Create next;
    Create(int val){
        this.val = val;
        next = null;
    }
}
class CreateLL{

    Create head;
    CreateLL(){
        this.head =null;
    }

    public static void main(String[] args) {
        CreateLL createLL = new CreateLL();
        Create node = new Create(4);
        createLL.addIntoList(node);
        createLL.addIntoList(new Create(5));
        createLL.printList();
    }

    private void printList() {
        Create currNode = head;
        while(currNode!=null){
            System.out.print(currNode.val+"->");
            currNode=currNode.next;
        }
        System.out.print("null");
    }

    private void addIntoList(Create node) {
        if(head == null){
            head = node;
            head.next = null;
        }
        else{
            Create currNode = head;
            while(currNode.next!=null){
                currNode = currNode.next;
            }
            currNode.next = node;
        }

    }
}
