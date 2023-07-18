package SumOfTwoNumbers;

import java.util.Scanner;

public class SumOfStrings {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = Integer.parseInt(iScanner.nextLine());
        String stringA = iScanner.nextLine();
        String stringB = iScanner.nextLine();

        System.out.println(sumOfStrings(n, stringA, stringB));
    }

    static StringBuilder sumOfStrings(int n, String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(s1.charAt(i)).append(s2.charAt(i));
        }
        return result;
    }
}
