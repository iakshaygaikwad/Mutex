package collectionpractice.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void printer(TreeSet treeSet)
    {
        System.out.println("This is Printer Method...");
        if (treeSet.isEmpty()){
            System.out.println("LinkedHashset is EMPTY.....");
            return;
        }
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add('Y');
        treeSet.add('H');
        treeSet.add('A');
        treeSet.add('K');
        treeSet.add('S');
        printer(treeSet);

        treeSet.clear();
        printer(treeSet);
        System.out.println("A".compareTo("D"));
    }
}
