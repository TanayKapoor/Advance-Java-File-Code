public class experiment3P1 {
    class A {
        public void printA() {
            System.out.println("Class A");
        }
    }

    class B extends A {
        public void printB() {
            System.out.println("Class B");
        }
    }

    class C extends A {
        public void printC() {
            System.out.println("Class C");
        }
    }

    class D extends A {
        public void printD() {
            System.out.println("Class D");
        }
    }

    public static void main(String[] args) {
        System.out.println("Tanay " + 1955991593);
        experiment3P1 e = new experiment3P1();
        A a = e.new A();
        B b = e.new B();
        C c = e.new C();
        D d = e.new D();

        a.printA();
        b.printB();
        c.printC();
        d.printD();
    }

}
