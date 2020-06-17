package _4string.stringbuilder;

public class MyStringBuilder {

    public static void main(String[] args) {
        // Tạo chuỗi rỗng với kích thước bộ đệm mặc định là 16 kỹ tự
        StringBuilder sb = new StringBuilder();
        //Tạo chuỗi với nội dung truyền vào và khởi tạo thêm vùng đệm kích thước 16 kỹ tự
        StringBuilder sb2 = new StringBuilder("BK Software Việt Nam");
        // Tạo chuỗi với kích thước bộ đệm truyền vào
        StringBuilder sb3 = new StringBuilder(20);

        // Các phương thức

        /*
        1. public  StringBuilder append(String s): được sử dụng để nối thêm (append) chuỗi đã cho với chuỗi này.
           Phương thức append() được nạp chồng giống dạng append(char), append(boolean), append(int), append(float),
           append(double) ...

        2. public  StringBuilder insert(int offset, String s): được sử dụng để chèn chuỗi đã cho với chuỗi
           này tại vị trí offset. Phương thức insert() được nạp chồng giống dạng insert(int, char),
           insert(int, boolean),
            insert(int, int), insert(int, float), insert(int, double) ...
        3. public  StringBuilder replace(int startIndex, int endIndex, String str): được sử dụng để thay thế
            chuỗi từ vị trí startIndex đến vị trí endIndex đã cho.

        4. public  StringBuilder delete(int startIndex, int endIndex): được sử dụng để xóa chuỗi từ vị trí
           startIndex đến endIndex đã cho.

        5.  public StringBuilder reverse(): được sử dụng để đảo ngược chuỗi.
        6.  public int capacity(): được sử dụng để trả về kích thước bộ đệm capacity hiện tại.
        7.  public void ensureCapacity(int minimumCapacity): được sử dụng để bảo đảm rằng capacity ít nhất bằng với
        minimum đã cho.
        8.  public char charAt(int index): được sử dụng để trả về ký tự tại vị trí đã cho.
        9.  public char deleteCharAt(int index): được sử dụng để xóa ký tự tại vị trí đã cho.
        10. public int length(): được sử dụng để trả về độ dài của chuỗi (tổng số ký tự).
        11. public String substring(int beginIndex): được sử dụng để trả về chuỗi con từ vị trí beginIndex đến cuối.
        12. public String substring(int beginIndex, int endIndex): được sử dụng để trả về chuỗi con từ beginIndex
        đến endIndex đã cho.
        13. public void trimToSize(): phương thức cố gắng giảm dung lượng sử dụng cho chuỗi ký tự
         */


    }
}
