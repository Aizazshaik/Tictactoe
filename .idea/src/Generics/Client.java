package Generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Genericpair<String,Double> p1 =new Genericpair<>();
        p1.first="aizaz";
        p1.second=12.1;
//    p1.second="aa"; this gives warning because it checks type as we created a specific genric pair
        System.out.println(p1.getFirst());
        String s = Genericpair.doSomething("sonali");
        Number val=Genericpair.getadd(5,7);
        List<User> users =new ArrayList<User>();
        Instructor instructor=new Instructor();
        instructor.setName("Mohit");
        Student student =new Student();
        student.setName("aizaz");
        users.add(instructor);
        users.add(student);

        List<Instructor> instructors=new ArrayList<>();
        instructors.add(instructor);
        Userutility.printUsernames(instructors);


    }
}
