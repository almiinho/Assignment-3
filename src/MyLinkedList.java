import java.util.NoSuchElementException;
public class MyLinkedList<T> {
    private Node<T> head;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void addFirst(T element) {// adds elements to the beginning of the list
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int size() {
        return size;
    } // returns the size

    public T removeFirst() throws NoSuchElementException { // returns and removes first element of the list
        if (head == null) {
            throw new NoSuchElementException();
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public T getFirst() throws NoSuchElementException { // returns the first element of the list
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(T data) { // adds the last element to the list
        Node<T> newNode = new Node<>(data);
        Node<T> tail = null;
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
}

