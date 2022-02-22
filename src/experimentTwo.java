public class experimentTwo {
    static class nonParameterizedConstructor {
        int n = 1955991593;
        String name = "Tanay";

        nonParameterizedConstructor() {
            System.out.println("Constructor Called");
        }
    }

    static class parameterizedConstructor {
        parameterizedConstructor(int n, String name) {
            System.out.println("Constructor Called with parameters - " + n + " " + name);
        }
    }

    public static void main(String[] args) {
        nonParameterizedConstructor c = new nonParameterizedConstructor();

        System.out.println(c.n);
        System.out.println(c.name);
        System.out.println();
        parameterizedConstructor c1 = new parameterizedConstructor(1955991593, "Tanay");
    }
}
