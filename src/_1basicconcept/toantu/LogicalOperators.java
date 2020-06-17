package _1basicconcept.toantu;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        String x = "Sher";
        String y = "Locked";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String uuid = scanner.next();
        System.out.println(uuid);
        System.out.println("Enter password: ");
        String upwd = scanner.next();
        //Check if user-name and password match or not
        if((uuid.equals(x) && upwd.equals(y)) || (uuid.equals(y) && upwd.equals(x))) {
            System.out.println("Welcome User.");
        } else {
            System.out.println("Wrong uid or password");
        }
    }
}
