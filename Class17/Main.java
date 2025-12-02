package Class17;

public class Main {

    class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }

    Node head;

    void insertFirst(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    void deleteFirst(){
        if(head==null){
            System.out.print("linked list is empty");
            return;
        }else{
            head=head.next;
        }
    }
    void deleteAtEnd(){
        if(head==null){
            System.out.println("LList is empty");
            return;
        }
        Node temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
    }
    void deleteAtPos(int pos){
        if(head==null){
            System.out.println("LList is empty");
            return;
        }
        if(pos==0){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    void search(int key){
        if(head==null){
            System.out.println("LList is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                System.out.println("key found");
                return;
            }
            temp=temp.next;
        }
        System.out.println("key not found");
    }
}