import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionsClass {
  public static void main(String[] args) {
    
    List<product> products = new ArrayList<>();
    products.add(new product("AC", 5));
    products.add(new product("Clock", 65));
    products.add(new product("Bag", 54));
    products.add(new product("Phone", 87));

    product p1 = new product("Laptop", 1);
    product p2 = new product("Oil", 2);
    Collections.sort(products);
    System.out.println(products);
    products.sort((o1, o2) -> o1.name.compareTo(o2.name));
    System.out.println(products);
    // System.out.println(p1.compareTo(p2));
    
    // List<Integer> list = new ArrayList<>();
    // list.add(34);
    // list.add(56);
    // list.add(89);
    // list.add(87);
    // list.add(74);
    // list.add(02);
    // System.out.println("Min element " + Collections.min(list));
    // System.out.println("Max element " + Collections.max(list));
    // System.out.println("Frequent element " + Collections.frequency(list, 87)); 
    // Collections.sort(list); 
    // System.out.println(list);
    // Collections.sort(list,Comparator.reverseOrder());
    // System.out.println(list);
}  
}
