import java.util.Scanner;
public class Task4 {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введіть розмір квадратної матриці:");        int size = scanner.nextInt();
    int[][] matrix = new int[size][size];
    System.out.println("Введіть елементи матриці:");        for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {                matrix[i][j] = scanner.nextInt();
        }        }
    System.out.println("Введіть індекси елемента для обчислення мінору (i, j):");
    int row = scanner.nextInt();        int col = scanner.nextInt();
    if (row < 0 ) {
        System.out.println("Некоректні індекси. Перезапустіть програму.");            return;
    }
    int[][] minor = getMinor(matrix, size, row, col);
    // Виведення результатів        System.out.println("Оригінальна матриця:");
    printMatrix(matrix);
    System.out.println("Мінор матриці для елемента (" + row + ", " + col + "):");        printMatrix(minor);
}
    public static int[][] getMinor(int[][] matrix, int size, int excludeRow, int excludeCol) {        int[][] minor = new int[size - 1][size - 1];
        int minorRow = 0;
        for (int i = 0; i < size; i++) {            if (i == excludeRow) continue;
            int minorCol = 0;
            for (int j = 0; j < size; j++) {                if (j == excludeCol) continue;
                minor[minorRow][minorCol++] = matrix[i][j];
            }            minorRow++;
        }
        return minor;    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {            for (int val : row) {
            System.out.print(val + " ");            }
            System.out.println();        }
    }}
