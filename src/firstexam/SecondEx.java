package firstexam;

import java.util.Scanner;

public class SecondEx {
    public static void main(String[] args) {
        int sum = 0;
        int factorial = 1;
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += factorial;
        }

        System.out.println("Sum of expression : " + sum);
    }
}
