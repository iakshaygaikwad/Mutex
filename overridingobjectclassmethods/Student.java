package overridingobjectclassmethods;

public class Student extends Human {

    //public String toString() {return getClass().getName() + "@" + Integer.toHexString(hashCode());}

    static int rollNumber;
    Student(){
        rollNumber = 0;
    }

    public void setRollNumber(int rollNumber)
    {
        this.rollNumber = rollNumber;
    }


}
