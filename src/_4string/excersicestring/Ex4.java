package _4string.excersicestring;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        String str1;
        String str2;
        int result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        str1 = scanner.nextLine();
        System.out.println("Enter the second String: ");
        str2 = scanner.nextLine();
        result = str1.compareToIgnoreCase(str2);


        if (result < 0) {
            System.out.println("\"" + str1 + "\"" + " is less than " + "\"" + str2 + "\"");
        } else if (result == 0) {
            System.out.println("\"" + str1 + "\"" + " is equal to " + "\"" + str2 + "\"");
        } else // if (result > 0)
        {
            System.out.println("\"" + str1 + "\"" + " is greater than " + "\"" + str2 + "\"");
        }
    }
}
