package src;

import java.util.Arrays;

/**
 * тестовий клас
 * містить лише перевірку роботи MatrixGenerator
 */
public class MatrixTest {

    public static void main(String[] args) {

        int[][] result = MatrixGenerator.generate(3, 6);

        int[][] expected = {
                {1, 1, 2, 3, 5, 8},
                {1, 1, 2, 3, 5, 8},
                {1, 1, 2, 3, 5, 8}
        };

        System.out.println("Result:");
        System.out.println(Arrays.deepToString(result));

        System.out.println("Test passed: " +
                Arrays.deepEquals(result, expected));
    }
}