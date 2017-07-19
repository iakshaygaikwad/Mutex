package inheritancepractice;

public class Student extends Human{

    public void doActivity()
    {
        super.doActivity();
        System.out.println("Studying...");
    }
}
