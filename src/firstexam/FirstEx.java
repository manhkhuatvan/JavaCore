package firstexam;

import java.util.Scanner;

public class FirstEx {
    public static void main(String[] args) {
        int n;
        int factorial = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num:");
        n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
                factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    }
}
