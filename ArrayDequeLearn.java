import java.util.*;
public class ArrayDequeLearn {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(89);
        adq.offerLast(650);
        adq.offer(56);
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println(adq.poll());
        System.out.println("poll " + adq);
        System.out.println(adq.pollFirst());
        System.out.println("pollfirst " + adq);
        System.out.println(adq.pollLast());
        System.out.println("pollast " + adq);


    }
    
}
