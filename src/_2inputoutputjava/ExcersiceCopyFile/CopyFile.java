package _2inputoutputjava.ExcersiceCopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("data\\user.txt");
        FileOutputStream outputStream = new FileOutputStream("data\\target.txt");

        int temp;
        temp = inputStream.read();

        while (temp != -1) {
            outputStream.write((byte) temp);
            temp = inputStream.read();
        }

        if (inputStream != null) {
            inputStream.close();
        }

        if (outputStream != null) {
            outputStream.close();
        }

        System.out.println("Done !");
    }
}
