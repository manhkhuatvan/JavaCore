package _1basicconcept.bien;

class Person {
    static String country = "Viet Nam";
    static String country2;
}

public class StaticVariable {
    public static void main(String[] args) {
        System.out.println("Quoc gia: " + Person.country);
        //truy cap bien static thong qua ten lop
        Person.country2 = "Nhat Ban";
        System.out.println("Quoc gia 2: " + Person.country2);
        Person p = new Person();
        p.country = "VN";
        p.country2 = "EN";
        System.out.println("Country1 : " + p.country);
        System.out.println("Country2 : " + p.country2);
    }
}
