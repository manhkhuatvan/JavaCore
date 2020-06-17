package _4string.excersicestring;

import java.util.Scanner;

public class StringEx {
    public static String formatFullName(String fullName) {
        String res = "";
        fullName.trim();
        String temp = "";
        String[] arrString = fullName.split(" ");
        for (String string : arrString) {
            if (!string.equals("")) {
                temp = string.toLowerCase();
                res += String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1) + " ";
            }
        }
        return res.trim();
    }

    public static String formatPhoneNumber(String phoneNumber) {
        String res = "";
        phoneNumber = phoneNumber.trim();
        int len = phoneNumber.length();
        char temp;
        if (len >= 10) {
            for (int i = 0; i < len ; i++) {
                temp = phoneNumber.charAt(i);
                if(Character.isDigit(temp)) {
                    res += temp;
                }
            }
            if (res.length() < 10 || res.length() > 10) {
                res = "Độ dài số điện thoại chưa chính xác!";
            }
        } else {
            res = "Độ dài số điện thoại chưa chính xác!";
        }
        return res;

    }

    public static void main(String[] args) {
        /* Có hai vấn đề cần giải quyết:
        +) Thừa dấu cách:
            - Thừa đầu và cuối : trim()
            - thừa ở giữa: lấy ra các chuỗi có nghĩa nà nối với nhau bới một dấu cách
        +) Viết hoa chữ cái đầu:
            - Chuyển chuỗi có nghĩa về tất cả kí tự thường và viết hoa kí tự đầu
        +) Số điện thoại phải đủ 10 chữ số
            Character.isDigit(char s): kiểm tra có phải số 0, trả về true false
            Character.isLetter(char s): kiểm tra có phải chữ không, trả về true false

         */

        String fullName;
        String phoneNumber;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the full name:");
            fullName = scanner.nextLine();
            System.out.println("Enter the telephone number:");
            phoneNumber = scanner.nextLine();
            System.out.println("Full Name: " + formatFullName(fullName));
            System.out.println("Telephone Number: " + formatPhoneNumber(phoneNumber));
        }



    }
}
