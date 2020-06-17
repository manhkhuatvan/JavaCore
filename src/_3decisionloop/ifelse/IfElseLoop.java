package _3decisionloop.ifelse;

public class IfElseLoop {
    public static void main(String[] args) {
        int inventory = 10;
        int wantBuy = 11;

        if (inventory > 0) {
            System.out.println("Còn hàng");
            if (wantBuy > 0 && wantBuy <= inventory) {
                System.out.println("Có thể thêm vào giỏ hàng");
            } else if (wantBuy <= 0 || wantBuy > inventory) {
                System.out.println("Không thể mua hàng với số lượng này");
            }
        } else if (inventory == 0) {
            System.out.println("Hết hàng");
        } else {
            System.out.println("Mặt hàng này không còn được bán");
        }

        //This statement will be executed
        //as if considers one statement by default

        System.out.println("Cảm ơn bạn đã sử dụng dịch vụ này");
    }
}
