import java.util.Random;import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір квадратної матриці:");        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];        int[][] transpose = new int[size][size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {            for (int j = 0; j < size; j++) {
            matrix[i][j] = rand.nextInt(100);            }
        }
        for (int i = 0; i < size; i++) {            for (int j = 0; j < size; j++) {
            transpose[j][i] = matrix[i][j];            }
        }
        System.out.println("Оригінальна матриця:");        printMatrix(matrix);
        System.out.println("Транспонована матриця:");
        printMatrix(transpose);    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {            for (int val : row) {
            System.out.print(val + " ");            }
            System.out.println();        }
    }}