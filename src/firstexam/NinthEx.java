package firstexam;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NinthEx {
    public static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }

    public static int checkMonth(int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (checkYear(year) == true) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }

    public static int checkDay(int day, int month, int year) {
        int julianDay;
        // Julian Day Caculation
        julianDay = (day + ((153 * (month + 12 * ((14 - month) / 12) - 3) + 2) / 5) +
                (365 * (year + 4800 - ((14 - month) / 12))) +
                ((year + 4800 - ((14 - month) / 12)) / 4) -
                ((year + 4800 - ((14 - month) / 12)) / 100) +
                ((year + 4800 - ((14 - month) / 12)) / 400) - 32045) % 7;
        switch (julianDay) {
            case 6:
                System.out.println("You was born in Sunday");
                break;
            case 0:
                System.out.println("You was born in Monday");
                break;
            case 1:
                System.out.println("You was born in Tuesday");
                break;
            case 2:
                System.out.println("You was born in Wednesday");
                break;
            case 3:
                System.out.println("You was born in Thursday");
                break;
            case 4:
                System.out.println("You was born in Friday");
                break;
            case 5:
                System.out.println("You was born in Saturday");
                break;
        }
        return julianDay;
    }

    public static void main(String[] args) {
        int year;
        int month;
        int day;
        int temp;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        year = scanner.nextInt();
        System.out.println("Enter your birth month: ");
        month = scanner.nextInt();
        System.out.println("Enter your birth day:");
        day = scanner.nextInt();

        if (checkYear(year) == true) {
            System.out.println("You was born in leap year");
        } else {
            System.out.println("You was born is normal year");
        }

        temp = checkMonth(month, year);
        System.out.println("Your birth month has " + temp + " days");

        checkDay(day, month, year);
    }
}
