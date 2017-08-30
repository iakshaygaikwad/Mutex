package CollectionPractice.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LLDemo {

    public static void printer(List list){
        System.out.println("This is printer Method");
        //Print using iterator()
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            Student student = (Student)iterator.next();
            System.out.println("Name = "+ student.name + " Roll No = "+student.rollno);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Creating LinkedList..");
        LinkedList<Student> linkedList = new LinkedList <Student>();
        System.out.println("Adding Values in LL. add()");
        linkedList.add(new Student("Akshay",11));
        linkedList.add(new Student("Mukesh", 12));
        linkedList.add(new Student("ABC",13));
        linkedList.add(new Student("XYZ", 14));
        LLDemo.printer(linkedList);
        System.out.println("Adding at first in LL. addFirst()");
        linkedList.addFirst(new Student("Sid", 10));
        LLDemo.printer(linkedList);
        System.out.println("Adding at Last LL. addList()");
        linkedList.addLast(new Student("Vishal", 16));
        LLDemo.printer(linkedList);
        System.out.println("First Record is : Name = "+linkedList.getFirst().name + " Roll Number = " + linkedList.getFirst().rollno);
        System.out.println("Last Record is : Name = "+linkedList.getLast().name + " Roll Number = " + linkedList.getLast().rollno);
        System.out.println("Removing First Record...");
        linkedList.removeFirst();
        LLDemo.printer(linkedList);
        System.out.println("Removing Last Record...");
        linkedList.removeLast();
        LLDemo.printer(linkedList);
        System.out.println("Clearing LinkedList...");
        linkedList.clear();
    }
}
