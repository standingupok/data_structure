public class LinkedList<T> {
    private Node<T> head;
//    private Node<T> tail;

//    constructor
    public LinkedList() {
        head = null;
    }

//    print
    public void traverse() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public Node<T> getHead() {
        return head;
    }
    public void setHead(Node<T> head) {}

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data, this.head);
        this.head = newNode;
    }

    public void addLast(T data) {
        if (head == null) {
            addFirst(data);
            return;
        }

        Node<T> newNode = new Node<>(data, null);
        Node<T> temp = this.head;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(newNode);;
    }

    public void addNodeAfter(T key, T data) {
        Node<T> curr = this.head;
        while(curr != null && !curr.getData().equals(key)){
            curr = curr.getNext();;
        }
        if(curr != null){
            Node<T> newNode = new Node<>(data, curr.getNext());
            curr.setNext(newNode);
        }
    }

    public boolean deleteNode(T key) {
        if (head == null) {
            return false;
        }

        if (head.getData().equals(key)) {
            this.head = head.getNext();
            return true;
        }

        Node<T> curr = this.head;
        Node<T> prev = null;
        while(curr != null && !curr.getData().equals(key)) {
            prev = curr;
            curr = curr.getNext();
        }

        if(curr == null)
            return false;

        prev.setNext(curr.getNext());
        curr.setNext(null);
        return true;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        int size = 0;
        Node<T> curr = head;

        while(curr != null){
            size++;
            curr = curr.getNext();
        }

        return size;
    }

    public boolean search(T key) {
        Node<T> curr = head;
        while(curr != null){
            if(curr.getData().equals(key)){
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }
}
