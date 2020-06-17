package firstexam;

import java.util.Scanner;

public class SixthEx {
    public static void main(String[] args) {
        float bigSum = 0;
        float smallSum = 0;
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            smallSum += i;
            bigSum += (float) 1 / smallSum;
        }

        System.out.println("Sum of expression: " + bigSum);
    }
}
