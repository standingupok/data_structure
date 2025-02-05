public class test {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int x = stack.pop();
        System.out.println(x);

        int y = stack.peek();
        System.out.println(y);

        int x1 = stack.pop();
        System.out.println(x1);

        int y1 = stack.peek();
        System.out.println(y1);

        stack.reverse();

        String s = "Hoang Long";
        System.out.println(StringReverse.reverseString(s));

        DecToBi.toBi(50);

        LinkedStack<Integer> stack2 = new LinkedStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        System.out.println(stack2.pop());
        System.out.println(stack2.peek());

        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Hang doi dequeue: " + queue.dequeue());
        System.out.println("Hang doi dequeue: " + queue.dequeue());
        System.out.println("Hang doi dequeue: " + queue.dequeue());
        System.out.println(queue.last.getData());
    }
}
