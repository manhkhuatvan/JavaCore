package firstexam;

import java.util.Scanner;

public class FourthEx {
    public static void main(String[] args) {
        int x;
        int n;
        int superScript;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        x = scanner.nextInt();
        System.out.println("Enter n: ");
        n = scanner.nextInt();
        superScript = x * x;

        for(int i = 2; i <= 2 * n; i += 2) {
            sum += superScript;
            superScript *= x * x;
        }

        System.out.println("Sum of expression: " + sum);
    }
}
