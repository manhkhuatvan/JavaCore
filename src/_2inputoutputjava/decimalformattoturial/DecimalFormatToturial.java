package _2inputoutputjava.decimalformattoturial;

import java.text.DecimalFormat;

public class DecimalFormatToturial {
    public static void main(String[] args) {
        double num = 123.4567;
        DecimalFormat decimalFormat = new DecimalFormat("####");

        System.out.println(decimalFormat.format(num));

        decimalFormat = new DecimalFormat("##.#");
        System.out.println(decimalFormat.format(num));

        decimalFormat = new DecimalFormat(".###");
        System.out.println(decimalFormat.format(num));
    }
}
