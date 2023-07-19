package MaxProduct;

import java.util.Arrays;
import java.util.Scanner;

public class MaxProduct {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = Integer.parseInt(iScanner.nextLine());
        long[] array = new long[n];
        String[] input = iScanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            array[i] = Long.parseLong(input[i]);
        }

        System.out.println(maxProduct(array));

        /*while (true) {
            Random rnd = new Random();
            int n = rnd.nextInt(2, 5);
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = rnd.nextInt(9);
            }
            int result1 = maxProduct(array);
            int result2 = maxProduct2(array);
            if (result2 == result1) System.out.println("OK");
            else {
                System.out.println("Wrong answer" + result1 + result2);
                return;
            }
        }*/
    }

    static long maxProduct(long[] arr) {
        Arrays.sort(arr);
        long max = arr[arr.length - 1];
        long maxNext = arr[arr.length - 2];
        return max * maxNext;
    }
/*
    static int maxProduct2(int[] arr) {
        int maxPos = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxPos]) maxPos = i;
        }
        int posNext = (maxPos == 0) ? 1 : 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[posNext] && i != maxPos) posNext = i;
        }
        return arr[maxPos] * arr[posNext];

    }


    static int maxProduct3(int[] arr) {
        int maxPos = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxPos]) maxPos = i;
        }
        int temp = arr[maxPos];
        arr[maxPos] = arr[0];
        arr[0]= temp;


        int posNext = 1;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > arr[posNext]) posNext = i;
        }
        return arr[0] * arr[posNext];

    }*/
}


