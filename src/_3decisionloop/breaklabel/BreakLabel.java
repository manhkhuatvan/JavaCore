package _3decisionloop.breaklabel;

public class BreakLabel {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Before break the statement");
                    if (t) {
                        break second;
                    }
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second block.");
        }
    }
}
