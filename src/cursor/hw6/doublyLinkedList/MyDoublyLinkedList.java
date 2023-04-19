package cursor.hw6.doublyLinkedList;

public class MyDoublyLinkedList<Y> implements MyDLL<Y> {
    private int size;
    private Node<Y> head;
    private Node<Y> tail;
    public MyDoublyLinkedList(){
        size = 0;
        head = null;
        tail = null;
    }
    private static class Node<Y>{
        Y element;
        Node<Y> next;
        Node<Y> previous;
        public Node(Y element, Node<Y> next, Node<Y> previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }

    @Override
    public void addFirst(Y element) {
    Node<Y> newNode = new Node<>(element, null, head);
        if (head != null){
            head.previous = newNode;
            head = newNode;
        } else {
            head = tail = newNode;
            head.next = null;
        } size ++;
    }

    @Override
    public void addLast(Y element) {
        Node<Y> newNode = new Node<>(element, tail, null);
        if (tail != null){
            tail.next = newNode;
            tail = newNode;
        } else {
            tail = newNode;
            tail.previous = null;
        } size ++;
    }

    @Override
    public void addIndex(int index, Y element) {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index" + index + " is out of " + size);
        } if (index == 0){
            addFirst(element);
            return;
        } if (index >= size){
            addLast(element);
            return;
        } Node<Y> current = head;
        for (int i = 0; i < index; i ++) {
            current = current.next;
        }
        Node<Y> newNode = new Node<>(element, current.previous, current);
        current.previous.next = newNode;
        current.previous = newNode;
        size ++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
