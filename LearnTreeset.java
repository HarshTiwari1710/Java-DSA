import java.util.Set;
import java.util.TreeSet;

public class LearnTreeset {
   public static void main(String[] args) {
    Set<Integer> tst = new TreeSet<>();
    //0(logn)
        tst.add(34);
        tst.add(98);
        tst.add(54);
        tst.add(73);
        tst.add(822);
        tst.remove(822);
        System.out.println(tst.hashCode());
        System.out.println(tst);
        System.out.println(tst.contains(98));
        System.out.println(tst.isEmpty());
   } 
}
