import java.util.EmptyStackException;

public class ArrayStack<T> implements StackADT<T> {
    public int top;
    private T[] stack;
    private final int DEFAULT_CAPACITY = 100;

    public ArrayStack() {
        top = 0;
        stack = (T[])(new Object[DEFAULT_CAPACITY]);
    }

    public ArrayStack(int n) {
        top = 0;
        stack = (T[])(new Object[n]);
    }

    public void expandCapacity(){
        T[] newStack = (T[])(new Object[stack.length*2]);
        for(int i = 0 ;  i < stack.length ; i++){
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    @Override
    public void push(T item) {
        if(size() == stack.length) {
            expandCapacity();
        }
        stack[top] = item;
        top++;
    }

    @Override
    public T pop() throws EmptyStackException {
        if(top == 0)
            throw new EmptyStackException();
        top--;
        T result = stack[top];
        stack[top] = null;
        return result;
    }

    @Override
    public T peek() {
        if(top == 0)
            throw new EmptyStackException();
        return stack[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return this.top == 0;
    }

    @Override
    public int size() {
        return this.top;
    }

    public void reverse(){
        T[] newStack = (T[])(new Object[stack.length]);
        for(int i = 0 ; i < size() ; i++){
            newStack[i] = stack[top - i - 1];
            System.out.print(newStack[i] + " ");
        }
    }
}
