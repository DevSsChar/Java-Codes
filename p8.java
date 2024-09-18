import java.util.*;
class Node
{
    public
    int data;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
public class p8 {
    public static Node buildtree()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Data:");
        int data=scan.nextInt();
        if(data==-1)
        {
            return null;
        }
        Node root=new Node(data);
        System.out.println("Enter data for left:");
        root.left=buildtree();
        System.out.println("Enter data for right:");
        root.right=buildtree();
        return root;
    }
    public static int countNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=countNodes(root.left);
        int right=countNodes(root.right);
        int ans=left+right+1;
        return ans;
    }
    public static void main(String[] args) {
        Node root=null;
        root=buildtree();
        System.out.println(countNodes(root));
    }
}
