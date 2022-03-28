import java.util.ArrayList;

public class experimentNine {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Random");
        System.out.println("Original list: " + list);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("First");
        list2.add("Second");
        System.out.println("Second list after copy: " + list2);
    }
}
