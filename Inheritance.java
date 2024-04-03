public class Inheritance {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Rollno = 56;
        s1.Subject = "Maths";
        s1.name = "Harsh";
        s1.display();
        Student s2 = new Student();
        s2.Rollno = 77;
        s2.Subject = "Accounts";
        s2.name = "Monika";
        s2.display();
    }
}
class Student{
    int Rollno;
    String name;
    String Subject;

    void display(){
        System.out.println(name + " Roll number is " + Rollno + " And the subject he is good in " + Subject);
    }
}

class Teacher extends Student{
    
}
