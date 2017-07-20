
public class StudentConstructorPractice  {

    private String name = "";

     private StudentConstructorPractice()
    {
        System.out.println("Default Constructor....");
    }
    private StudentConstructorPractice(String name)
    {
        this.name = name;
        System.out.println(name);
    }

    public static void getObject(String name)
    {
        StudentConstructorPractice s1 = new StudentConstructorPractice();
        StudentConstructorPractice s = new StudentConstructorPractice(name);
    }
}
