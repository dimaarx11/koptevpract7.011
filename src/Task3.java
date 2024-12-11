import java.util.Scanner;
public class Task3 {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);        int size = 5;
    int[][] matrix = new int[size][size];
    System.out.println("Введіть елементи матриці 5x5:");        for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {                matrix[i][j] = scanner.nextInt();
        }        }
    System.out.println("Визначник: " + calculateDeterminant(matrix, size));
}
    public static int calculateDeterminant(int[][] matrix, int size) {        if (size == 1) return matrix[0][0];
        if (size == 2) return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        int determinant = 0;        for (int k = 0; k < size; k++) {
            int[][] minor = getMinor(matrix, size, k);            determinant += Math.pow(-1, k) * matrix[0][k] * calculateDeterminant(minor, size - 1);
        }        return determinant;
    }
    public static int[][] getMinor(int[][] matrix, int size, int col) {        int[][] minor = new int[size - 1][size - 1];
        for (int i = 1; i < size; i++) {            int index = 0;
            for (int j = 0; j < size; j++) {                if (j == col) continue;
                minor[i - 1][index++] = matrix[i][j];
            }        }
        return minor;    }
}