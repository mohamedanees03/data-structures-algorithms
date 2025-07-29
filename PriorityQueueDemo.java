import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(9.5);
        queue.offer(7.2);
        queue.offer(8.2);
        queue.offer(8.9);
        queue.offer(6.5);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
