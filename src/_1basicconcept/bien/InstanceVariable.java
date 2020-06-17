package _1basicconcept.bien;

public class InstanceVariable {
    int id;
    float mathMarks;
    double money;
    public void hiddenInstanceVariable() {
        int id;
        id = 100;
        System.out.println("ID: " + id);
        System.out.println("ID: " + this.id);
    }

}
class InstanceVariableDemo {
    public static void main(String[] args) {
        InstanceVariable instanceVariable = new InstanceVariable();
        instanceVariable.id = 1;
        instanceVariable.mathMarks = 9.5f;
        instanceVariable.money = 100;

        //hien thi thong tin cua cac bien
        System.out.println("ID: " + instanceVariable.id);
        System.out.println("MathMarks: " + instanceVariable.mathMarks);
        System.out.println("Money: " + instanceVariable.money);
    }
}
