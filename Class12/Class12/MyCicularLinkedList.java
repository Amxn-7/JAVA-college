package Class12;

public class MyCicularLinkedList {
    Node head=null;
    Node tail=null;

    public void insertAtbegining(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            newNode.next=newNode; //head/tail
            return;
        }
        newNode.next=head;
        tail.next=newNode;
        newNode=head;
    }
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        
    }
    public static void main(String[] args) {
        MyCicularLinkedList list = new MyCicularLinkedList();
        list.insertAtbegining(1);
        list.insertAtbegining(2);

        System.out.println(list.head.data);
        System.out.println(list.tail.data);
    }
}