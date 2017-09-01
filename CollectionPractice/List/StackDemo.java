package collectionpractice.list;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class StackDemo{
        public static void printer(Vector vector)
        {
            Enumeration enumeration = vector.elements();
            while (enumeration.hasMoreElements())
                System.out.println(enumeration.nextElement());
        }
    public static void main(String[] args) {
            Stack stack = new Stack();
            for (int i = 1; i < 10; i++)
            {
                stack.push(i);
            }
            ALDemo.printer(stack);

        System.out.println("Size of stack = "+ stack.size() + " Capacity of Stack = "+stack.capacity());
        stack.push(10);
        stack.push(11);
        System.out.println("Size of stack = "+ stack.size() + " Capacity of Stack = "+stack.capacity());

       // System.out.println(stack.pop());
        //pop operation
        while (!stack.isEmpty())
        {
            System.out.println(stack.pop() + " POP");
        }
    }
}
