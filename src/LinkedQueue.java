public class LinkedQueue<T> implements QueueADT<T> {
    public int size;
    public Node<T> first;
    public Node<T> last;
    public LinkedQueue() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }
    @Override
    public void enqueue(T item) {
        Node<T> oldLast = this.last;
        Node<T> temp = new Node<>(item, null);
        last = temp;
        if(isEmpty())   first = last;
        else oldLast.setNext(last);
        size++;
    }

    @Override
    public T dequeue() {
        T result = first.getData();
        first = first.getNext();
        if(isEmpty())   last = null;
        size--;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return size;
    }
}
