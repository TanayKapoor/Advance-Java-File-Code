import java.util.Deque;
import java.util.LinkedList;

class queue {
    private static int front, rear, capacity;
    private static int queue[];

    queue(int size) {
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];
    }

    static void queueEnqueue(int item) {
        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        } else {
            queue[rear] = item;
            rear++;
        }
        return;
    }

    static void queueDequeue() {
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }


            if (rear < capacity)
                queue[rear] = 0;

            rear--;
        }
        return;
    }

    static void queueDisplay() {
        int i;
        if (front == rear) {
            System.out.printf("Queue is Empty\n");
            return;
        }

        for (i = front; i < rear; i++) {
            System.out.printf(" %d , ", queue[i]);
        }
        return;
    }

    static void queueFront() {
        if (front == rear) {
            System.out.printf("Queue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element of the queue: %d", queue[front]);
        return;
    }
}

public class experiment13P1 {
    public static void main(String[] args) {
        System.out.println("Tanay " + 1955991593);

//        Dequeue
        Deque<String> deque = new LinkedList<String>();
        deque.add("Element 1 (Tail)");
        deque.addFirst("Element 2 (Head)");
        deque.addLast("Element 3 (Tail)");
        deque.push("Element 4 (Head)");
        deque.offer("Element 5 (Tail)");
        deque.offerFirst("Element 6 (Head)");
        System.out.println(deque + "\n");
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing " + "first and last: " + deque);

//        Queue
        queue q = new queue(4);

        System.out.println("Initial Queue:");
        q.queueDisplay();

        q.queueEnqueue(10);
        q.queueEnqueue(30);
        q.queueEnqueue(50);
        q.queueEnqueue(70);

        System.out.println("Queue after Enqueue Operation:");
        q.queueDisplay();

        q.queueFront();

        q.queueEnqueue(90);

        q.queueDisplay();

        q.queueDequeue();
        q.queueDequeue();
        System.out.printf("\nQueue after two dequeue operations:");

        q.queueDisplay();

        q.queueFront();
    }
}

