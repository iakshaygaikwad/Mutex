package overridingobjectclassmethods;

public class OverridingPractice {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Akshay");
        student.setRollNumber(17);
        System.out.println(student.toString()); //calling overrided method
    }

}
