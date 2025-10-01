package Class7.Matrixoperations;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = in.nextInt();
        System.out.println("Enter number of colums: ");
        int col = in.nextInt();

        int[][] A = new int[row][col];
        // int[][] B = new int[row][col];

        System.out.println("----------Enter the values----------");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter the value at [%d][%d]: ",i,j);
                A[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(A[i]));
        }

        // transpose of matrix 
        int[][] result = new int[col][row];
        for (int i = 0; i < row; i++) {
           for (int j = 0; j < col; j++) {
                result[j][i] = A[i][j];
            }
        }
        System.out.println("Transpose of matrix:");
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
        in.close();

    }
}