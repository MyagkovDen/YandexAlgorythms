package MaxProduct;

import java.util.Arrays;
import java.util.Scanner;

public class MaxProductOfFourNumbers {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = Integer.parseInt(iScanner.nextLine());
        long[] array = new long[n];
        String[] input = iScanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            array[i] = Long.parseLong(input[i]);
        }

        System.out.println(maxProductOfFour(array));

    }

    static long maxProductOfFour(long[] arr) {
        Arrays.sort(arr);
        long result;
        if (arr[0] >= 0) {
            result = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3] *
                    arr[arr.length - 4];
        } else if (arr[arr.length - 1] <= 0) {
            result = arr[0] * arr[1] * arr[2] * arr[3];
        } else {
            long result1 = Math.max(arr[0] * arr[1] * arr[2] * arr[3], arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3] *
                            arr[arr.length - 4]);
            result = Math.max(result1, arr[0] * arr[1] * arr[arr.length - 1] * arr[arr.length - 2]);
        }
        return result;
    }
}
