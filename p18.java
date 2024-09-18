import java.util.Scanner;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}
public class p18 {
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
    public static Node cycledll(Node head)
    {
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        Node temp2=head;
        for(int i=0;i<3;i++)
        {
            temp2=temp2.next;
        }
        temp.next=temp2;
        return temp;
    }
    public static Boolean checkCycle(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Node head = null;
        head=insertAtHead(head, 10);
        head=insertAtHead(head, 20);
        head=insertAtHead(head, 30);
        head=insertAtHead(head, 40);
        head=insertAtHead(head, 50);
        head=cycledll(head);
        System.out.println(checkCycle(head));
        scan.close();
    }
}
