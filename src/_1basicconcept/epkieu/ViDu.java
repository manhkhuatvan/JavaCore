package _1basicconcept.epkieu;

public class ViDu {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 433.666;
        System.out.println("Conversion of int to byte: ");
        b = (byte) i;
        System.out.println("i = " + i + " b = " + b);
        System.out.println("\nConversion of double to byte");
        b = (byte) d;
        System.out.println("d = " + d + " b = " + b);

    }
}
