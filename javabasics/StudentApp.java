package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentApp{

    String name;
    int rollNumber;
    float marks;

    public void setData(BufferedReader bufferedReader, Student student) throws  IOException{

        System.out.println("Enter Name : ");
        name = bufferedReader.readLine();
        student.setName(name);
        System.out.println("Enter Roll Number : ");
        rollNumber = Integer.parseInt(bufferedReader.readLine());
        student.setRollNumber(rollNumber);
        System.out.println("Enter Marks : ");
        marks = Float.parseFloat(bufferedReader.readLine());
        student.setMarks(marks);

    }
    public void getData(Student student){
        System.out.println("Name = " + student.getName());
        System.out.println("Roll Number = " + student.getRollNumber());
        System.out.println("Marks = " + student.getMarks());

    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Student student = new Student();
        new StudentApp().setData(bufferedReader, student);
        new StudentApp().getData(student);

    }

}
