package _3decisionloop.Excersice;

public class ChangeDecisionToLoop {
    public static void main(String[] args) {
        int x = 4;

        while (x < 10) {
            System.out.println(x++);
        }

        for(int y = 4; y <= 10; y++) {
            System.out.println(y++);
        }

        int z = 4;

        do {
            if(z > 10) {
                break;
            }
            System.out.println(z++);
        } while (z <= 10);
    }
}
