package _3decisionloop.switchcase;

public class SwitchCaseDesicon {
    public static void main(String[] args) {
        int i = 3;

        switch (i) {
            case 1:
                System.out.println("Tài khoản chưa được kích hoạt");
                break;
            case 2:
                System.out.println("Tài khoản thông thường");
                break;
            case 3:
                System.out.println("Tài khoản người kiểm duyệt");
                break;
            case 4:
                System.out.println("Tài khoản người quản lý");
                break;
            default:
                System.out.println("Tài khoản không tồn tại");
        }
    }
}
