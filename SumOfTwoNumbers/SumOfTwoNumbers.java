package SumOfTwoNumbers;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        int a = iScanner.nextInt();
        int b = iScanner.nextInt();
        System.out.println(getSum(a, b));

    }

        static int getSum(int a, int b){
            return a + b;
        }
}
