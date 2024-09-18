import java.util.*;

class Stack {
    int arr[] = new int[1000];
    int top;

    public Stack() {
        top = -1;
    }

    public void push(int x) {
        arr[++top] = x;
    }

    public int pop() {
        return arr[top--];
    }

    public int peek() {
        return arr[top];
    }

    public boolean empty() {
        return top == -1;
    }
}

class Queue {
    private Stack s1 = new Stack();
    private Stack s2 = new Stack();

    // Method to add an item to the queue
    public void enqueue(int x) {
        // Move all elements from s1 to s2
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        // Push the new element onto s1
        s1.push(x);
        // Move everything back to s1
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
    }

    // Method to remove an item from the queue
    public int dequeue() {
        if (s1.empty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int x = s1.peek();
        s1.pop();
        return x;
    }
}

public class p17 {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println(q.dequeue()); // Should print 1
        System.out.println(q.dequeue()); // Should print 2
        System.out.println(q.dequeue()); // Should print 3

        // Uncommenting the next line will throw an exception
        // System.out.println(q.dequeue()); // Uncomment to see "Queue is empty" exception
    }
}
