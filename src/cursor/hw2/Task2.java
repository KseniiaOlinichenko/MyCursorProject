package cursor.hw2;

public class Task2 {
    public static void main(String[] args) {

            int[] myArray = {8, 5, -4, 6, -2, -7};
            int sum = 0;
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] > 0) {
                    sum += myArray[i];
                }
        }
        System.out.println("Sum of positive numbers in the array is "+ sum);

    }
}
