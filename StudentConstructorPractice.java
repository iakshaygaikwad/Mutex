
public class StudentConstructorPractice  {

    private static StudentConstructorPractice s = new StudentConstructorPractice();
     private StudentConstructorPractice()
    {
        System.out.println("Default Constructor....");
    }

     public static Object getObject()
    {
        return s;
    }
}
