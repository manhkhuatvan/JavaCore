package _1basicconcept.toantu;

public class ArithmeticOperators {
    public static void main(String[] args) {
        float a = 10, b = 31, c = 0, d = 40, e = 60, f = 45;
        String x = "Thank", y = "You";

        // + and - operator
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));

        // + operator if used with strings
        // concatenates the given strings.

        System.out.println("x + y = " + x + y);
        // * and / operator

        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        // modulo operator gives remainder
        // on dividing first operand with second

        System.out.println("a % b = " + (a % b));

        // if denominator is 0 in division
        // then Arithmetic exception is thrown.
        // uncommenting below line would throw
        // an exception
        // System.out.println(a/c);

        System.out.println("b % a = " +(b % a));


    }
}
