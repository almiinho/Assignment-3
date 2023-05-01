import java.util.EmptyStackException;

public class MyLinkedListQueue<T> {
    private MyLinkedList<T> list;
    public MyLinkedListQueue(){list = new MyLinkedList<>();}
    public void enqueue(T element ){list.addLast(element);}
    public T dequeue() throws EmptyStackException{
        if (list.isEmpty()){
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }
    public T peek() throws EmptyStackException{
        if(list.isEmpty()){
            throw new EmptyStackException();
        }
        return list.getFirst();
    }
    public int size(){return list.size();}



}
