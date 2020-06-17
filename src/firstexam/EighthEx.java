package firstexam;

import java.util.Scanner;

public class EighthEx {
    public static void main(String[] args) {
        int month;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month");
        month = scanner.nextInt();
        while (month > 12 || month < 1) {
            System.out.println("Illegal, enter month again: ");
            month = scanner.nextInt();
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days");
                break;
            case 2:
                System.out.println("This month has 28 or 29 days");


        }
    }
}
