import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashset {
    public static void main(String[] args) {
        Set<Integer> lst = new LinkedHashSet<>();
        lst.add(34);
        lst.add(98);
        lst.add(54);
        lst.add(73);
        lst.add(822);
        lst.remove(822);
        System.out.println(lst.hashCode());
        System.out.println(lst);
        System.out.println(lst.contains(98));
        System.out.println(lst.isEmpty());
    }
}
