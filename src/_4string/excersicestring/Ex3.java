package _4string.excersicestring;

import java.util.Scanner;

public class Ex3 {
    public static int compareString(String str1, String str2) {
        int res = 0;
        res = str1.compareTo(str2);
        String temp = "nhỏ hơn";
        if (res < 0) {
            temp = "nhỏ hơn";
        } else if (res == 0) {
            temp = "tương đương";
        } else {
            temp = "lớn hơn";
        }

        System.out.println("Chuỗi " + str1 + " " + temp + " chuỗi " + str2);
        return res;
    }

    public static void main(String[] args) {
        String str1;
        String str2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first String:");
        str1 = scanner.nextLine();
        System.out.println("Enter the second String:");
        str2 = scanner.nextLine();

        compareString(str1, str2);

    }
}
