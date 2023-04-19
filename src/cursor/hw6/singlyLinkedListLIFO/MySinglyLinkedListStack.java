package cursor.hw6.singlyLinkedListLIFO;

public interface MySinglyLinkedListStack<X> {
    int size();
    boolean isEmpty();
    void push (X element);
    X pop();
    X top();

}
