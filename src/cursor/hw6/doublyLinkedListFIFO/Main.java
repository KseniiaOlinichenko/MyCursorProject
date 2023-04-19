package cursor.hw6.doublyLinkedListFIFO;

public class Main {
    public static void main(String[] args) {
        MyQueue<String> stringMyQueue = new MyQueue<>();
        System.out.println("Is Doubly Linked List Empty? " + stringMyQueue.isEmpty());
        System.out.println("The size of Doubly Linked List is " + stringMyQueue.size());
        //stringMyQueue.enqueue(null);
        stringMyQueue.enqueue("Yellow");
        stringMyQueue.enqueue("Blue");
        System.out.println("Is Doubly Linked List Empty? " + stringMyQueue.isEmpty());
        System.out.println("The size of Doubly Linked List is " + stringMyQueue.size());
        System.out.println("Removing 1st element from the queue: " + stringMyQueue.dequeue());
        System.out.println("Removing 2d element from the queue: " + stringMyQueue.dequeue());
        //System.out.println("Removing 3d element from the queue." + stringMyQueue.dequeue());
        System.out.println("Is Doubly Linked List Empty? " + stringMyQueue.isEmpty());
        System.out.println("The size of Doubly Linked List is " + stringMyQueue.size());



    }
}
