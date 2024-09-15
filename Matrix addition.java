import java.util.*;

public class MatrixAddition {
    public static boolean areCompatible(int r1, int c1, int r2, int c2) {
        return (r1 == r2 && c1 == c2);
    }

    public static void printMatrix(int rows, int cols, int[][] matrix) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void sumMatrices(int rows, int cols, int[][] a, int[][] b, int[][] res) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
    }
    public static void inputMatrix(int rows, int cols, int[][] matrix, Scanner sc) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns for the first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.print("Enter the number of rows and columns for the second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        if(!areCompatible(r1, c1, r2, c2)) {
            System.out.println("Matrices are not compatible for addition.");
            return;
        }
        int[][] a = new int[r1][c1];
        System.out.println("Enter elements of the first matrix:");
        inputMatrix(r1, c1, a, sc);
        int[][] b = new int[r2][c2];
        System.out.println("Enter elements of the second matrix:");
        inputMatrix(r2, c2, b, sc);
        int[][] res = new int[r1][c1];
        sumMatrices(r1, c1, a, b, res);
        System.out.println("Resultant matrix after addition:");
        printMatrix(r1, c1, res);
        sc.close();
    }
}





