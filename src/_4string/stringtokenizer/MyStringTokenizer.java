package _4string.stringtokenizer;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.StringTokenizer;

public class MyStringTokenizer {
    public static void main(String[] args) {
        String bk = "BK     Software Viet\t Nam\n!!";
        System.out.println("Chuỗi ban đầu: " + bk);
        //Dạng 1: tạo một StringTokenizer mới
        //Với str là chuỗi mà chúng ta  cần tách ra thành cách token
        //ký tự phân tách mặc định là khoảng cách tab , khoẳng trắng, cách kí tự xuống dòng
        StringTokenizer stringTokenizer = new StringTokenizer(bk);
        /*
        Dạng 2: tạo một StringTokenizer mới
        Với str là chuỗi mà chúng ta cần tách thanhfcachs token
        với delim là các kí tự cần phân tách
         */
        String bk1 = new String("Bk \nSoftware Viet \nNam");
        StringTokenizer stringTokenizer1 = new StringTokenizer(bk1, "\n");
        /*
        Dạng 3:
        với str là chuỗi mà chúng ta cần tách ra thành các token
        delim là tập các ký tự phân tách/
        returnDelims có giá trị là true hoặc false.
        Nếu là true thì ký tự phân cách cũng được trả về như các token, ngược lại thì không
         */
        String bk2 = "BK, Software, Viet, Nam";
        StringTokenizer stringTokenizer2 = new StringTokenizer(bk2, ",", true);
        // returnDelims: true : lấy cả phần phân tách vào làm phần tử
        //returnDelims : false: không lấy phần tử phân cách vào làm phần tử
        int countToken = stringTokenizer.countTokens(); //countToken(): trả về số token còn lại
        System.out.println("Tổng số token còn lai: " + countToken);
        while (stringTokenizer.hasMoreTokens()) {
            //nextToken: lấy token hiện tại ra và di chuyển tới token kế tiếp
            System.out.println(stringTokenizer.nextToken());
        }

        System.out.println("=========================================================");
        while (stringTokenizer1.hasMoreTokens()) {
            System.out.println(stringTokenizer1.nextToken());
        }

        System.out.println("=========================================================");
        while (stringTokenizer2.hasMoreTokens()) {
            System.out.println(stringTokenizer2.nextToken());
        }
    }
}
