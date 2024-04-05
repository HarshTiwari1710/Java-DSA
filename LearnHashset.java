import java.util.*;
public class LearnHashset {
    //O(1)
    public static void main(String[] args) {

        

        Set<product> products = new HashSet<>();
        products.add(new product("AC", 5));
        products.add(new product("Clock", 65));
        products.add(new product("Bag", 54));
        products.add(new product("Phone", 87));
        products.add(new product("laptop", 5));
        System.out.println(products);
        // Set<Integer> set = new HashSet<>();
        // set.add(34);
        // set.add(98);
        // set.add(54);
        // set.add(73);
        // set.add(822);
        // set.remove(822);
        // System.out.println(set.hashCode());
        // System.out.println(set);
        // System.out.println(set.contains(98));
        // System.out.println(set.isEmpty());
    }

   

    
}
