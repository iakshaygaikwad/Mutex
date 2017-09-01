package collectionpractice.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void printer(LinkedHashSet linkedHashSet)
    {
        System.out.println("This is Printer Method...");
        if (linkedHashSet.isEmpty()){
            System.out.println("LinkedHashset is EMPTY.....");
            return;
        }
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(8,7);

        for (int i = 1; i < 10; i++)
            linkedHashSet.add(i);
        System.out.println("Direct Print " + linkedHashSet);
        printer(linkedHashSet);
        for (int i = 0; !linkedHashSet.isEmpty(); i++) {
            linkedHashSet.remove(i);
            System.out.println("Removed... " + i);
        }
        printer(linkedHashSet);
    }
}
