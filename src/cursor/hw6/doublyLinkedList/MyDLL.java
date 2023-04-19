package cursor.hw6.doublyLinkedList;

public interface MyDLL<Y>  {
    void addFirst(Y element);
    void addLast(Y element);
    void addIndex(int i, Y element);
    int size();
    boolean isEmpty();

}
