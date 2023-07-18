package SumOfTwoNumbers;
import java.util.Scanner;

public class SumOfPolynomials {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = Integer.parseInt(iScanner.nextLine());
        String[] arrayN = iScanner.nextLine().split(" ");
        int[] polynomialA = new int[arrayN.length];
        for (int i = 0; i < polynomialA.length; i++) {
            polynomialA[i] = Integer.parseInt(arrayN[i]);
        }
        int m = Integer.parseInt(iScanner.nextLine());
        String[] arrayM = iScanner.nextLine().split(" ");
        int[] polynomialB = new int[arrayM.length];
        for (int i = 0; i < polynomialB.length; i++) {
            polynomialB[i] = Integer.parseInt(arrayM[i]);
        }

        System.out.println(defineDegree(polynomialA, polynomialB));
        int[] result = defineFactors(polynomialA, polynomialB);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    static int defineDegree(int[] arr1, int[] arr2) {
        return Math.max(arr1.length - 1, arr2.length - 1);
    }

    static int[] defineFactors(int[] arr1, int[] arr2) {
        int length = Math.min(arr1.length, arr2.length);
        int[] factors = arr1.length > arr2.length ? arr1 : arr2;
        for (int i = 0; i < length; i++) {
            factors[factors.length - 1 - i] = arr1[arr1.length - 1 - i] + arr2[arr2.length - 1 - i];
        }
        return factors;
    }
}
