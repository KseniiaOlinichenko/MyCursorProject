package cursor.hw6.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyDoublyLinkedList<String> stringMyDoublyLinkedList = new MyDoublyLinkedList<>();
        System.out.println("Is My Doubly Linked List empty? - " + stringMyDoublyLinkedList.isEmpty());
        stringMyDoublyLinkedList.addFirst("Kharkiv");
        System.out.println("After adding the first element the size is " + stringMyDoublyLinkedList.size());
        stringMyDoublyLinkedList.addIndex(1, "Kherson");
        stringMyDoublyLinkedList.addIndex(2, "Kyiv");
        stringMyDoublyLinkedList.addIndex(3, "Dnipro");
        stringMyDoublyLinkedList.addIndex(4, "Yalta");
        System.out.println("Is My Doubly Linked List empty? - " + stringMyDoublyLinkedList.isEmpty());
        System.out.println("After adding elements the size is " + stringMyDoublyLinkedList.size());
        stringMyDoublyLinkedList.addLast("Poltava");
        System.out.println("After adding the last element the size become " + stringMyDoublyLinkedList.size());
    }
}
