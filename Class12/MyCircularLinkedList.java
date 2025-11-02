import org.w3c.dom.Node;

public class MyCircularLinkedList {
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
            head=newNode;
        }
        // //insert at end 
        public void insertAtEnd(int data){
            if(head==null){
                insertAtbegining(data);
                return;
            }
            Node node = new Node(data);
            Node temp = head;
            while(temp!=tail){
                temp=temp.next;
            }
            temp.next=node;
            tail=node;
            node.next=head;
        }
    
    

        //trasverse 
        public void trasverse(){
            if (head==null){
                System.out.print("empty");
                return ;
            }
            Node temp=head;
            do{
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            while(temp!=head);
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
            MyCircularLinkedList list = new MyCircularLinkedList();
            list.insertAtbegining(1);
            list.insertAtbegining(2);
            list.trasverse();
    
            // System.out.println(list.head.data);
            // System.out.println(list.tail.data);
        }///
    }