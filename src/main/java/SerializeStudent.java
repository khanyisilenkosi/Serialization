import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class SerializeStudent {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Student student = new Student("Kaycee", 25, "Computer Science");
        Student student1 = new Student("Jean", 20, "Civil engineering");
        Student student2 = new Student("Zaden", 19, "FireFighter");

        FileOutputStream fileOutputStream = new FileOutputStream("student");


    }

}
