import java.util.*;
public class Collection {
    // 1. List Interface - items stored in contiguous fashion
    public static void main(String[] args) {
        //arraylist - Used to store data dynamically
        // ArrayList<String> studentsName = new ArrayList<>();
        // studentsName.add("Rakesh");
        // size = n + n/2 + 1
        // System.out.println(studentsName);
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);
        list.add(4); // this will add 4 at the end only
        System.out.println(list);
        list.add(1,45); //We can also define index to add to the list
        System.out.println(list);
        List<Integer> newlist = new ArrayList<>();
        newlist.add(123);
        newlist.add(456);
        System.out.println(newlist);
        list.addAll(0,newlist);
        // System.out.println(list);
        // System.out.println(list.get(4));
        // list.remove(3);
        // System.out.println(list); 
        // list.remove(Integer.valueOf(5));
        // System.out.println(list);
        // list.clear();/
        list.set(2, 34);
        System.out.println(list);
        System.out.println(list.contains(500));
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println("The element is" + list.get(i));
        // }
        // for (Integer element : list) {
        //     System.err.println("for each element is" + element); 
        // }

        //Iterator
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator" + it.next());
        }


    } 
}
