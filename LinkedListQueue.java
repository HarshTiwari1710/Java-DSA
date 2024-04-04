import java.util.*;
public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(23);
        queue.offer(45);
        System.err.println(queue);
        System.err.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
