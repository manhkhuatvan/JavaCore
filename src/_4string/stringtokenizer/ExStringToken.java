package _4string.stringtokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ExStringToken {
    public static void main(String[] args) {
        String str;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        str = scanner.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(str);
        while (stringTokenizer.hasMoreTokens()) {
                char temp = stringTokenizer.nextToken().charAt(0);
                System.out.print(String.valueOf(temp).toUpperCase());
        }
    }
}
