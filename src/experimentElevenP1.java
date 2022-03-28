import java.util.Vector;

public class experimentElevenP1 {
    public static void main(String[] args) {
        System.out.println("Tanay " + 1955991593);
        int n = 5;
        Vector<Integer> v = new Vector<>(n);
        for (int i = 0; i < n; i++) {
            v.add(i);
        }

        System.out.println(v);

        v.remove(2);
        System.out.println(v);

        for (Integer integer : v) {
            System.out.print(integer + " ");
        }
    }
}
