package _1basicconcept.phamvibien;

public class ScopeVariable {
        static int x = 10;
        private int y =20;

        public void fun(){
            ScopeVariable s = new ScopeVariable();
            this.x = 11;
            y=22;
            System.out.println("ScopeVariable.x = " + ScopeVariable.x);
            System.out.println("s.x = " +s.x);
            System.out.println("s.y = " + s.y);
            System.out.println("y = " + y);
        }

        public static void main(String[] args) {
            ScopeVariable s = new ScopeVariable();
            s.fun();
        }
}
