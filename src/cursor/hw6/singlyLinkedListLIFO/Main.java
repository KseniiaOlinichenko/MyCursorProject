package cursor.hw6.singlyLinkedListLIFO;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> intStack = new MyStack<>();
        System.out.println("Is Stack empty? " + intStack.isEmpty());
        System.out.println("Stack size: " + intStack.size());
        intStack.push(11);
        intStack.push(23);
        intStack.push(38);
        System.out.println("Is Stack empty? " + intStack.isEmpty());
        System.out.println("Stack size: " + intStack.size());
        System.out.println("Removed element is " + intStack.pop());
        System.out.println("The top element is " + intStack.top());
        System.out.println("Removed element is " + intStack.pop());
        System.out.println("Is Stack empty? " + intStack.isEmpty());
        System.out.println("Stack size: " + intStack.size());
        System.out.println("Removed element is " + intStack.pop());
        System.out.println("The top element is " + intStack.top());
        System.out.println("Is Stack empty? " + intStack.isEmpty());
        System.out.println("Stack size: " + intStack.size());


    }
}
