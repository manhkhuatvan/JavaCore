package _1basicconcept.bien;

public class LocalVariable {
    public double exchangeMoney(double money) {
        //bien cuc bo money va result
        double result = 0;
        result = money * 0.9 * 24000;
        return result;
    }
    public static void main(String[] args) {
        //bien cuc bo yourMoney
        double yourMoney = 1000d;
        System.out.println("Lam on, doi cho toi " + yourMoney + "$ sang tien Viet Nam");
        LocalVariable localVariable = new LocalVariable();
        double myMoney = localVariable.exchangeMoney(yourMoney);
        System.out.println("Ok, tien cua ban sau khi doi la: " + yourMoney + "VND");
        //su dung bien money ben ngoai pham vi phuong thuc exchangeMoney
        System.out.println("Ok, tien cua ban sau khi doi la: " + myMoney + "VND");
    }
}
