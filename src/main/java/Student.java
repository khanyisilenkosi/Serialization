import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private String course;
    private static final long serialVersionUID = 1L;

    public Student(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;


    }
    public void displayInfo() {
        System.out.println("Name" + name);
        System.out.println("Age" + age);
        System.out.println("Course" + course);
    }
}
