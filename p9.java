import java.util.*;
class Node{
    public
    int data;
    Node right;
    Node left;
    Node(int data)
    {
        this.data=data;
        right=null;
        left=null;
    }
}
public class p9 {
    public static Node buildtree()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter data:");
        int data=scan.nextInt();
        if(data==-1)
        {
            return null;
        }
        Node root=new Node(data);
        System.out.println("Enter data for left:");
        root.left=buildtree();
        System.out.println("Enter data for right");
        root.right=buildtree();
        return root;
    }
    public static boolean isSymmetric(Node root)
    {
        if(root==null)
        {
            return true;
        }
        return isMirror(root.left,root.right);
    }
    public static boolean isMirror(Node node1,Node node2)
    {
        if(node1==null && node2==null)
        {
            return true;
        }
        if(node1==null || node2==null)
        {
            return false;
        }
        return node1.data==node2.data && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }
    public static void main(String[] args) {
        Node root=buildtree();
        System.out.println(isSymmetric(root));
    }
}
