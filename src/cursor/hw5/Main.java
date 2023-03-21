package cursor.hw5;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myIntList = new MyList<>();
        myIntList.add(8);
        myIntList.add(-47);
        myIntList.add(104);
        myIntList.add(0);
        System.out.println("The largest element in the list is " + myIntList.theLargest());
        System.out.println("The smallest element in the list is " + myIntList.smallest());
    }
}
