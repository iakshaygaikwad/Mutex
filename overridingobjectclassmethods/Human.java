package overridingobjectclassmethods;

public class Human extends Object{

    String name;
    Human(){
        name ="";
    }

    //@Override
    public String toString() {

        String student = "Name = " + name + "Roll Number = " +Student.rollNumber;
        return student;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
