import java.util.Scanner;
class Stack
{
    int arr[]=new int[1000];
    int top;
    public Stack()
    {
        top=-1;
    }
    public void push(int x)
    {
        arr[++top]=x;
    }
    int pop()
    {
        return arr[top--];
    }
    int peek()
    {
        return arr[top];
    }
}
public class p9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.pop();
        System.out.println(s.peek());
        scan.close();
    }
}
