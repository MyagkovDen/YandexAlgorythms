package MaxProduct;

import java.util.Arrays;
import java.util.Scanner;

public class MaxProductOfThreeNumbers {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = Integer.parseInt(iScanner.nextLine());
        long[] array = new long[n];
        String[] input = iScanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            array[i] = Long.parseLong(input[i]);
        }

        System.out.println(maxProductOfThree(array));

    }

    static long maxProductOfThree(long[] arr) {
        Arrays.sort(arr);
        long result;
        if ((arr[0] >= 0) || (arr[arr.length - 1] <= 0)) {
            result = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];
        } else{
            long negativeProduct = arr[0]* arr[1];
            long positiveProduct = arr[arr.length-2]* arr[arr.length-3];
            result = arr[arr.length-1] * Math.max(negativeProduct, positiveProduct);
        }
        return result;
    }
}
