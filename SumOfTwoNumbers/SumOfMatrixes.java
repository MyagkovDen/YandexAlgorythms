package SumOfTwoNumbers;

import java.util.Scanner;

public class SumOfMatrixes {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String[] input = iScanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[][] matrixA = new int[n][m];
        int[][] matrixB = new int[n][m];
        for (int i = 0; i < n; i++) {
            input = iScanner.nextLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = Integer.parseInt(input[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            input = iScanner.nextLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrixB[i][j] = Integer.parseInt(input[j]);
            }
        }

        int[][] matrixC = sumOfMatrixes(n, m, matrixA, matrixB);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] sumOfMatrixes(int a, int b, int[][] matr1, int[][]matr2){
        int [] [] result = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                result[i][j] = matr1[i][j] + matr2[i][j];
            }
        }
        return result;
    }
}
