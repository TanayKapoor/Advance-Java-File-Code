public class experiment3P2 {
    interface a {
        public void printName();
    }

    interface b {
        public void printRoll();
    }

    interface c extends a, b {
        public void printName();
    }

    static class child implements c {
        public void printName() {
            System.out.println("Tanay");
        }

        public void printRoll() {
            System.out.println("1955991593");
        }
    }

    public static void main(String[] args) {
        c obj = new child();
        obj.printName();
        obj.printRoll();
    }
}
