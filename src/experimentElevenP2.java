import java.util.LinkedList;
import java.util.Queue;

public class experimentElevenP2 {
    public static void main(String[] args) {
        System.out.println("Tanay " + 1955991593);
        int n = 5;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(i);
        }

        System.out.println("Queue: " + queue);

        queue.remove(3);
        System.out.println("Queue: " + queue);

        System.out.println("Size of queue: " + queue.size());
        System.out.println("Does queue contain 3? " + queue.contains(3));
    }
}
