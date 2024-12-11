import java.util.Random;
public class Task2 {    public static void main(String[] args) {
    int rows = 4, cols = 5;        Random rand = new Random();
    double[][] array = new double[rows][cols];
    for (int i = 0; i < rows; i++) {            for (int j = 0; j < cols; j++) {
        array[i][j] = rand.nextDouble() * 10;            }
    }
    for (int i = 0; i < rows; i++) {            for (int j = 0; j < cols; j++) {
        if (i % 2 != 0 || j % 2 != 0) {                    array[i][j] = Math.sqrt(array[i][j]);
        }            }
    }
    for (double[] row : array) {            for (double val : row) {
        System.out.printf("%.2f ", val);            }
        System.out.println();        }
}}
