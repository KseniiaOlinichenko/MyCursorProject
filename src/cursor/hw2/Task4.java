package cursor.hw2;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] myArray2 = {3, 2, 3, 1, 4, 2, 8, 3};
        int[] replaceDublicates = myArray2;

        for (int i = 0; i < replaceDublicates.length; i++)
            for (int j = i + 1; j < replaceDublicates.length; j++) {
                if (replaceDublicates[i] == replaceDublicates[j])
                    replaceDublicates[j] = 0;
            }
        System.out.println(Arrays.toString(replaceDublicates));
    }
}
