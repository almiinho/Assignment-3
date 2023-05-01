import java.util.EmptyStackException;
public class MyLinkedListStack<T> {
private MyLinkedList<T> list;
public MyLinkedListStack(){
list = new MyLinkedList<>();
}
    public void push(T element){list.addFirst(element);} // adds elements to the top of aa stack
    public T pop()throws EmptyStackException{// returns and removes top element
        if (list.isEmpty()) {
             throw new EmptyStackException();
        }
        return list.removeFirst();
    }
    public T peek() throws EmptyStackException {//returns top elements
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }
    public int size(){return list.size();} // returns the size of a stack
    public boolean isEmpty(){return list.isEmpty();}//checks if stack is empty or not


}
