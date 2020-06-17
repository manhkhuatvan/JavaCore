package _2inputoutputjava.scannertoturial;

import java.util.Scanner;

public class ScannerToturial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap du lieu: ");
        String str = scanner.nextLine();
        System.out.println("Xuat du lieu: " + str);
    }
}
