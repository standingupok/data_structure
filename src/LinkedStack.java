import java.util.EmptyStackException;

public class LinkedStack<T> implements StackADT<T> {
    private Node<T> top;
    private int size;

    public LinkedStack() {
        size = 0;
        top = null;
    }

    @Override
    public void push(T item) {
        Node<T> temp = new Node<>(item, top);
        top = temp;
        size++;
    }

    @Override
    public T pop() throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException();
        T result = top.getData();
        top = top.getNext();
        size--;
        return result;
    }

    @Override
    public T peek() throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException();
        return top.getData();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
