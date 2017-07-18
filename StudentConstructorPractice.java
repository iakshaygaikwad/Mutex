
public class StudentConstructorPractice  {


    private String name = "";
    private static StudentConstructorPractice s = new StudentConstructorPractice();
     private StudentConstructorPractice()
    {
        System.out.println("Default Constructor....");
    }
//    private StudentConstructorPractice(String name)
//    {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Object getObject()
    {
        return s;
    }
}
