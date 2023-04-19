package cursor.hw6.singlyLinkedListLIFO;

public class MyStack<X> implements MySinglyLinkedListStack<X> {
    private int size = 0;
    private Node<X> head;
    public static class Node<X> {
        X element;
        Node<X> next;

        public Node(X element) {
            this.element = element;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(X element) {
        if (element == null){
        throw new NullPointerException("Null is prohibited");
        }
        Node<X> newNode = new Node<>(element);
        if (head != null){
            newNode.next = head;
        }
        head = newNode;
        size ++;
    }
    @Override
    public X pop() {
        if (head == null){
        throw new NullPointerException("Null is not allowed");
        }
        X element = head.element;
        head = head.next;
        size --;
        return element;
    }
    @Override
    public X top() {
        if (head == null){
            throw new NullPointerException("Head is null");
        } return head.element;
    }
}
