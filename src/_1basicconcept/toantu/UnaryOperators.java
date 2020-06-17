package _1basicconcept.toantu;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10, b = 30, c = 0, d = 40, e = 60, f = 45;
        boolean condition = true;

        // pre-increment operator 
        // a = a+1 and then c = a;

        c = ++a;
        System.out.println("Value of c (++a) = " + c);

        // pre-decrement operator
        // d=d-1 then c=d

        c = --d;
        System.out.println("Value of c (--d) = " + c);

        // post-decrement operator
        // c=e then e=e-1

        c = e--;
        System.out.println("Value of c (e--) = " + c);

        // Logical not operator
        System.out.println("Value of !condition =" + !condition);
    }
}
