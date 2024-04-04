import java.util.*;
public class Priorityque {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(89);
        pq.offer(23);
        pq.offer(45);
        pq.offer(98);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
