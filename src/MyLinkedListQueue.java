import java.util.EmptyStackException;

public class MyLinkedListQueue<T> {
    private MyLinkedList<T> list;
    public MyLinkedListQueue(){list = new MyLinkedList<>();}
    public void enqueue(T element ){list.addLast(element);} // adds elements to the back of a queue
    public T dequeue() throws EmptyStackException{ // returns and removes elements from the front of a queue
        if (list.isEmpty()){
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }
    public T peek() throws EmptyStackException{ // returns front element of a queue
        if(list.isEmpty()){
            throw new EmptyStackException();
        }
        return list.getFirst();
    }
    public int size(){return list.size();}// returns the size of a queue
    public boolean isEmpty(){return list.isEmpty();} // checks if queue is empty or not



}
