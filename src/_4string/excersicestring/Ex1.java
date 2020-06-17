package _4string.excersicestring;

import java.util.Scanner;

public class Ex1 {
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

    public static void main(String[] args) {
        String str;
        int index;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String :");
        str = scanner.nextLine();
        System.out.println("Enter the given index: ");
        index = scanner.nextInt();
        System.out.println(getChar(str, index));

    }
}
