public interface QueueADT<T> {
    public void enqueue(T x);
    public T dequeue();
    public boolean isEmpty();
    public int size();
}
