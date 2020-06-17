package _4string.stringbuffer;

public class MyStringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        // mặc định tạo ra 16 ký tự
        StringBuffer stringBuffer1 = new StringBuffer("BK Soft");
        //tổng 16 + 7(BK Soft) = 23 ô nhớ (BK Soft.length + 16)
        StringBuffer stringBuffer2 = new StringBuffer(50);
        //tạo ra bộ đệm lưu 50 kí tự
        // hàm append(): nối thêm chuỗi vào cuối chuỗi ban đầu
        stringBuffer1.append(" Việt Nam");
        System.out.println(stringBuffer1);

        // insert(): chèn thêm chuỗi hoặc kí tự vào vị trí bất kì
        stringBuffer1.insert(7, "Ware");
        System.out.println(stringBuffer1);

        //delete(): xóa chuỗi

        stringBuffer1.delete(0, 3);
        System.out.println(stringBuffer1);
        System.out.println(stringBuffer1.reverse());

        //reverse(): đảo ngược chuỗi






    }
}
