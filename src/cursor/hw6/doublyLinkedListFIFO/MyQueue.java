package cursor.hw6.doublyLinkedListFIFO;

import java.util.NoSuchElementException;

public class MyQueue<T> implements MyDoublyLinkedList<T> {
    private int size;
    private Node<T> front;
    private Node<T> rear;
    public MyQueue() {
        size = 0;
        front = null;
        rear = null;
    }
    private static class Node<T>{
        T element;
        Node<T> next;
        Node<T> previous;
        public Node(T element, Node<T> next, Node<T> previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }
    @Override
    public T dequeue() {
        if (isEmpty()){
            throw new NoSuchElementException("There is no elements in queue");
        }
        T element = front.element;
        front = front.next;
        if (isEmpty()) {
            rear = null;
        } size --;
        return element;
    }

    @Override
    public void enqueue(T element) {
        if (element == null){
            throw new NullPointerException("Null can not be added!");
        }
        Node<T> newNode = new Node<>(element, rear, null);
        if(rear != null){
            rear.next = newNode;
        } rear = newNode;
        if (front == null){
            front = newNode;
        } size++;
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
