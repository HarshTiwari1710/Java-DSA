import java.util.*;
public class stacks {
    public static void main(String[] args) {
        Stack <String> tracks = new Stack<>();
        tracks.push("Breakup Party");
        tracks.push("Tere Vaaste");
        tracks.push("One Bottle Down");
        tracks.push("4 men down");
        System.err.println("Stack element" + tracks);
        System.out.println(tracks.peek());
        tracks.pop();
        System.out.println(tracks);
        System.out.println(tracks.peek());
    }
}
