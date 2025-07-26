/*
    A Queue is a linear data structure that follows the FIFO principle:
    FIFO (First In, First Out) → The element inserted first will be removed first.
*/

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Queue<String> queue = new Queue<>(); -> We can't implement this because Queue is an interface 
        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        // System.out.println(queue);
        // System.out.println(queue.poll());
        // System.out.println(queue.peek()); -> It gives the first member (A) as output

        // queue.poll(); -> It removes the first element from the queue

        queue.poll();
        queue.poll();
        queue.poll();
        
        System.out.println(queue);

        System.out.println(queue.isEmpty());
    }
}
