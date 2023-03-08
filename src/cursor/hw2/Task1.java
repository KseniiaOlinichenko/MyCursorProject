package cursor.hw2;

import java.util.Arrays;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        Integer[] digits = {2, 3, 1, 7, 11};
        Arrays.sort(digits, Collections.reverseOrder());
        System.out.println("Reverse order of the array " + "is " + Arrays.toString(digits));
    }
}
