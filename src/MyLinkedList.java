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
public MyLinkedList(){
head = null;
size = 0;
}
    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public int size() {
        return size;
    }

}

