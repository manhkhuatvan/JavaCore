package firstexam;

import java.util.Scanner;

public class ThirdEx {
    public static void main(String[] args) {
        int n;
        int x;
        int sum = 0;
        int superScript;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = scanner.nextInt();
        System.out.println("Enter n: ");
        n = scanner.nextInt();
        superScript = x;

        for (int i = 1; i <= n; i++) {
            sum += superScript;
            superScript *= x;
        }

        System.out.println("Sum of expression: " + sum);
    }
}
