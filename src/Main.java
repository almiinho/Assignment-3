import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack ();
        System.out.println(stack.size());
        stack.push(1);
        stack.push(4);
        stack.push(5);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.size());
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println("End of stack implementation");

        Queue queue = new LinkedList();
        System.out.println(queue.isEmpty());
        queue.add("ADS");
        queue.add("DBMS");
        queue.add("Calculus");
        queue.add("PE");
        queue.add("Sociology");
        System.out.println(queue.size());







    }
}