import java.util.EmptyStackException;
public class MyLinkedListStack<T> {
private MyLinkedList<T> list;
public MyLinkedListStack(){
list = new MyLinkedList<>();
}
public void push(T element){list.addFirst(element);}
    public T pop()throws EmptyStackException{
if (list.isEmpty()) {
throw new EmptyStackException();
}
return list.removeFirst();
    }


}
