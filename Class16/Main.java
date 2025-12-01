package Class16;
class Linkedlist
{
    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }

    void insertInBegg(int d)
    {
        Node newnode = new Node(d);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            newnode.next = head;
            head = newnode;
        }
    }
    
    void traversal()
    {
        if(head == null)
        {
            System.out.print("empty linked list");
            return;
        }

        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args)
    {
        Linkedlist llist = new Linkedlist();

        llist.insertInBegg(1);
        llist.insertInBegg(2);
        llist.insertInBegg(3);
        llist.insertInBegg(4);

        llist.traversal();
    }
}