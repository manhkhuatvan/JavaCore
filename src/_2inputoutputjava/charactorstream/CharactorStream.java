package _2inputoutputjava.charactorstream;

import java.io.FileReader;
import java.io.IOException;

public class CharactorStream {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("data//user.txt");
        int temp;

        while (( temp = fileReader.read()) != -1) {
            char c = (char) temp;
            System.out.print(c);
        }

        fileReader.close();

    }
}
