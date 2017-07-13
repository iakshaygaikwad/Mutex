import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Akshay on 13-07-2017.
 */
public class StudentApp{

    static Student acceptData( BufferedReader bufferedReader) throws IOException

    {
        Student student = new Student();
        System.out.println("Enter Name : ");
        student.name = bufferedReader.readLine();
        System.out.println("Enter Roll Number : ");
        student.rollNumber = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter Marks : ");
        student.marks = Float.parseFloat(bufferedReader.readLine());

        return student;
    }

    static void printData(Student student)
    {
        System.out.println("\n");
        System.out.println("Name = " +student.name);
        System.out.println("Roll Number = "+student.rollNumber);
        System.out.println("Marks = "+student.marks);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        Student student1 = acceptData(bufferedReader);
        Student student2 = acceptData(bufferedReader);
        Student student3 = acceptData(bufferedReader);

        printData(student1);
        printData(student2);
        printData(student3);

    }

}
