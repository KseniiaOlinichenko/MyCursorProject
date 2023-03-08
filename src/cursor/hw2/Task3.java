package cursor.hw2;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Average number of the array list is " + averageOfTheList());
    }
        public static int averageOfTheList() {
            int[] myArray1 = {6,10,7,9,8};
            int sum = 0;
            for (int i = 0; i < myArray1.length; i++) {
                sum += myArray1[i];
            } return sum/myArray1.length;

        }
    }
