package _4string.excersicestring;

import java.util.Scanner;

public class Ex2 {
    public static char getChar(String str, int index) {
        char res = '\u0000';
        if (index > 0 && index < str.length()) {
            System.out.println("The character at position " + index + ": \"" + res + "\"");
        } else {
            System.out.println("Over! Error!!!");
        }
        res = str.charAt(index);
        return res;
    }

    public static int getUnicodeCode(String str, int index) {
        char rs = getChar(str, index);
        if (rs != 0) {
            System.out.println("Unicode Code of character at positon " + index + ": " + rs);
        }
        return rs;
    }

    public static void main(String[] args) {
        int index;
        String str;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        str = scanner.nextLine();
        System.out.println("Enter the index:");
        index = scanner.nextInt();

        System.out.println(getUnicodeCode(str, index));
    }
}
