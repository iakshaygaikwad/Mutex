package collectionpractice.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

    public static void printer(Vector vector)
    {
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements())
            System.out.println(enumeration.nextElement());
    }
    public static void main(String[] args) {
        Vector vector = new Vector();
        for ( int i = 1; i <= 10; i++)
            vector.addElement(i);
        VectorDemo.printer(vector);
        System.out.println("capacity = " + vector.capacity());
    }
}
