package _4string.string;

public class MyString {
    public static void main(String[] args) {
        //Khai báo một biến kiểu dữ liệu String
        String it1; // = null
        //Khai báo và định nghĩa
        String it2 = "IT Student"; //mang đặc tính nguyên thủy, lưu trong bộ nhớ stack, được quản lý bởi HDH
        String bk = new String("BK SoftWareVN");
        //lưu trong bộ nhớ heap, không được quản lý bới hệ điều hành
        //chuỗi bk mang đặc tính đối tượng
        String bk2 = new String(); // chuỗi rỗng
        System.out.println(bk2);
        //Khai báo sử dụng mảng ký tự
        char[] charArray = {'I', 'T', 'S', 'T', 'U', 'D', 'E', 'N', 'T'};
        String it3 = new String(charArray);
        System.out.println(it3);
        String it4 = new String(charArray, 2, 7);
        System.out.println(it4);
        //Khởi tạo dùng mã unicode
        int[] codePoint = {54, 65, 87, 84}; //tương ứng với kí tự unicode
        it3 = new String(codePoint, 0, 4);
        System.out.println(it3);
        //Các phowng thức khởi tạo kahcs tự nghiên cứu trong lớp String
        //Các phương thức String
        //length(): lấy độ dài chuỗi
        System.out.println("Length of BK: " + bk.length());
        //isEmpty(): kiểm tra xem chuỗi có rỗng không (trả về true/false)
        System.out.println(bk2.isEmpty());
        System.out.println(bk.isEmpty());
        //charAt : lấy ký tự tại một vị trí bất kì từ 0 -> length - 1
        System.out.println(bk.charAt(0));
        System.out.println(bk.charAt(3));
        //codePointAt: lấy mã unicode của một ký tự vị trí bât kì từ 0 -> length - 1
        System.out.println(bk.codePointAt(0)); //trả về mã unicode 66: tương ứng với B
        //concat(): hàm nối chuỗi
        String s1 = "BK ";
        String s2 = "Software";
        String s3 = s1 + s2;
        System.out.println(s3);
        String s4 = s1.concat(s2);
        System.out.println(s4);

        if (bk.compareTo(s4) == 0) {
            System.out.println("Hãi chuỗi bằng nhau");
        } else if (bk.compareTo(s4) > 0) {
            System.out.println("chuỗi s4 < bk");
        } else {
            System.out.println("chuỗi s4 > bk");
        }

        if (bk.endsWith("Việt Nam")) {
            System.out.println("BK kết thúc bởi chuỗi Việt Nam");
        }

        String s5 = "   BK SoftWare Việt Nam    ";
        System.out.println(s5);
        s5 = s5.trim(); // trim(): loại bỏ khoảng trắng đầu cuối
        System.out.println(s5);
        //Tách chuỗi bằng hàm split()
        String[] bka = bk.split(" ");
        for ( String x : bka) {
            System.out.println(x);
        }

        //substring(): lấy chuỗi con
        String subBK = bk.substring(3);
        System.out.println(subBK);
        String subBK2 = bk.substring(3, 11);
        System.out.println(subBK2);

        //equals(): so sánh giá trị hai ô nhớ đang chứa
        System.out.println("==============Equals================");
        String kma1 = "BK";
        String kma2 = "BK";
        String kma3 = kma1;
        String kma4 = new String("BK");
        String kma5 = new String("BK");
        String kma6 = kma4;
        String kma7 = "bK";

        System.out.println(kma1 == kma2); //true
        System.out.println(kma3 == kma2); //true
        System.out.println(kma4 == kma1); //false
        System.out.println(kma4.equals(kma1)); //true
        System.out.println(kma6 == kma5); //false
        System.out.println(kma6 == kma4); //true
        System.out.println(kma1.equals(kma7)); //false
        System.out.println(kma1.equalsIgnoreCase(kma7));//true
        System.out.println("_________________________");

    }
}
