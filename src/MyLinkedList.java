import java.util.NoSuchElementException;
public class MyLinkedList<T> {
    private Node<T> head;
    private int size;
private static class Node<T>{
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}
}

