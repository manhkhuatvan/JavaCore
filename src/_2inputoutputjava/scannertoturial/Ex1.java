package _2inputoutputjava.scannertoturial;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int age;
        String name;
        String ID;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        name = scanner.nextLine();
        System.out.println("Age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ID: ");
        ID = scanner.nextLine();

        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your ID: " + ID);
    }
}
