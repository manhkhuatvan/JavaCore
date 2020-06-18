package _4string.stringjoiner;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class MyStringJoiner {
    public static void main(String[] args) {
        //StringJoiner stringJoiner = new StringJoiner("-");
        StringJoiner stringJoiner = new StringJoiner("-","#","$");
        String bk2 = "BK, Software, Viet, Nam";
        StringTokenizer stringTokenizer2 = new StringTokenizer(bk2, ",", false);
        String res;
        while (stringTokenizer2.hasMoreTokens()) {
            String token = stringTokenizer2.nextToken().trim();
            stringJoiner.add(token);
        }

        res = stringJoiner.toString();
        System.out.println(res);
    }
}
