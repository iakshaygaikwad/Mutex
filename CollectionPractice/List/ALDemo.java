package collectionpractice.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ALDemo {

    public static void printer(List list){
        System.out.println("This is printer Method");
//Print using for
//        for (Object a : list)
//        {
//            System.out.print(a + "   ");
//        }
//        System.out.println();

        //Print using iterator()
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Creating two List -> Arraylist");
        List list = new ArrayList();
        List list1 = new ArrayList();
        System.out.println("Calculator Class Object Creation");
        Calculator calculator = new Calculator();
        System.out.println("Adding diff element elements to list1");
        list.add(calculator.add(10,20));
        list.add(calculator);
        list.add(100);
        list.add("Akshay");
        list.add(30.30);
        list.add('a');

        ALDemo.printer(list);           //Printing List
        System.out.println("Adding Element at specific location at index 5 element 112");
        list.add(5,112);

        ALDemo.printer(list);           //Printing List

        System.out.println("Adding element to list2");
        list1.add(30.30);
        list1.add("Hello");

        ALDemo.printer(list1);          //Printing List

        System.out.println("remove Specific element in list (index 2)");
        list.remove(2);
        printer(list);

        System.out.println("Removing elements from list1 that are in list2 - removeAll()");
        list.removeAll(list1);

        ALDemo.printer(list);           //Printing List

        System.out.println("retainAll() - Only retain element that are matched in input collection delete other (opposite to removeAll)");
        list.add("Hello");
        list.retainAll(list1);

        System.out.println("Direct Print list");
        System.out.println(list);

        System.out.println("ClearList");
        list.clear();
        if (list.isEmpty()){
            System.out.println("List is Empty.");
        }

    }
}
