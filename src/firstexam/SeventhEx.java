package firstexam;

import java.util.Scanner;

public class SeventhEx {
    public static void main(String[] args) {
        int n;
        int x;
        float sum = 0;
        int upSum;
        int downSum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        x = scanner.nextInt();
        System.out.println("Enter n: ");
        n = scanner.nextInt();
        upSum = x;
        for (int i = 1; i <= n; i++) {
            downSum += i;
            sum += (float) upSum / downSum;
            upSum *= x;
        }

        System.out.println("Sum of expression:" + sum);
    }
}
