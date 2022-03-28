import java.util.LinkedList;

public class experimentTen {
    public static void main(String[] args) {
        System.out.println("Tanay " + 1955991593);
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("beautiful");
        list.add("world");
        list.add("!");
        System.out.println(list);
        System.out.println("Size of linked list is: " + list.size());
        System.out.println("Is the list empty? " + list.isEmpty());
        System.out.println("Does list have Hello? " + list.contains("Hello"));
        list.addFirst("First");
        list.addLast("Last");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(2));
    }
}
