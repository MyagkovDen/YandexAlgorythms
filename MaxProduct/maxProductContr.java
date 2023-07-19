package MaxProduct;

import java.util.Scanner;

public class maxProductContr {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        getExamples(n);

    }

    static void getExamples(int n) {
        StringBuilder sb = new StringBuilder();
        if (n < 7) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            sb.append(n);
            sb.append(" ");
            for (int i = 1; i < n; i++) {
                sb.append(i);
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
