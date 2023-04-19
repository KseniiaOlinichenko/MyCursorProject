package cursor.hw6.doublyLinkedListFIFO;

public interface MyDoublyLinkedList<T> {
    T dequeue();
    void enqueue(T element);
    int size();
    boolean isEmpty();

}
