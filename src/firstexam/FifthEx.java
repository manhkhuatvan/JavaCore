package firstexam;

import java.util.Scanner;

public class FifthEx {
    public static void main(String[] args) {
        int x;
        int n;
        int sum = 0;
        int superScript;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: " );
        x = scanner.nextInt();
        System.out.println("Enter n: ");
        n = scanner.nextInt();
        superScript = x;

        for (int i = 1; i <= (2 * n + 1); i += 2) {
            sum += superScript;
            superScript *= x * x;
        }

        System.out.println("Sum of expression :" + sum);
    }
}
