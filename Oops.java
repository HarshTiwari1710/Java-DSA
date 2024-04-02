public class Oops {
        public static void main(String[] args) {
            Person p1 = new Person();
            p1.name = "Harsh";
            p1.Gender = "Male";
            p1.age = 22;
            p1.eat("Lunch");
            Person p2 = new Person(21, "Monika");
            // p2.name = "Monika";
            // p2.Gender = "Female";
            // p2.age = 21;
            p2.walk();
            p2.walk(355);
            System.out.println(p1.name + " " + p1.Gender + " " + p1.age);
            System.out.println(p2.name + " " + p2.Gender + " " + p2.age);
            System.out.println(Person.count);
        }
    }
    

class Person{
    static int count;
    public Person(){
        count++;
        System.out.println("Creating an object");
    }
    public Person( int newAge, String newName){
        this();
        name = newName;
        age = newAge;
    }
    String name;
    String Gender;
    int age;
    //Every class has its behaviour so we can access it with class methods like this
    void walk(){
        System.out.println(name + " is walking." );
    }
    //We can also pass arguments in the methods
    void walk(int steps){
        System.out.println(name + " walked" + " " +steps + " steps");
    }
    void eat(String meal){
        System.out.println(name + " is eating " + " " + meal);
    }
}
