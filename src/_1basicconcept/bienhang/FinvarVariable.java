package _1basicconcept.bienhang;

class Finvar {
    //bien final
    final int i;

    // i = 10 --error
    //phai duoc dinh nghia trong ham khoi tao
    Finvar(int x) {
        i = x;
    }
}
public class FinvarVariable {
    public static void main(String[] args) {
        //bien static trong phuong thuc
        final int i;
        //i = 100;
        //khong gan duoc, chi co the thay doi thong qua ham khoi tao
        Finvar f1 = new Finvar(20);
        System.out.println("F1 = " + f1.i);
        Finvar f2 = new Finvar(30);
        System.out.println("F2 = " + f2.i);
    }
}


