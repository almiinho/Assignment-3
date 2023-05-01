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


    }
}