import java.util.Scanner;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}
public class p10 {
    public static Node insertAtHead(Node head, int data) {
        if (head == null) {
            Node temp = new Node(data);
            head = temp;
            return temp;
        }
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        return temp;
    }
    public static void printll(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static Node revll(Node head)
    {
         Node prev=null;
         Node curr=head;
         while(curr!=null)
         {
            Node forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
         }
         return prev;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Node head = null;
        head=insertAtHead(head, 10);
        head=insertAtHead(head, 20);
        head=insertAtHead(head, 30);
        head=insertAtHead(head, 40);
        head=insertAtHead(head, 50);
        head=revll(head);
        printll(head);
        scan.close();
    }
}
