package inheritancepractice;

public class Student extends Human{

    Student(){
        System.out.println("Student Constructor...");
    }
    public void doActivity()
    {
        super.doActivity();
        System.out.println("Studying...");
    }
}
