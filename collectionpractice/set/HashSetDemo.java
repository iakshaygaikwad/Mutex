package collectionpractice.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void printer(HashSet hashSet)
    {
        System.out.println("This is Printer Method...");
        if (hashSet.isEmpty()){
            System.out.println("Hashset is EMPTY.....");
            return;
        }
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
    public static void main(String[] args) {
        HashSet hashSet = new HashSet(8,7);

        for (int i = 1; i < 10; i++)
            hashSet.add(i);
        System.out.println("Direct Print " + hashSet);
        printer(hashSet);
        for (int i = 0; !hashSet.isEmpty(); i++) {
            hashSet.remove(i);
            System.out.println("Removed... " + i);
        }
        printer(hashSet);
    }
}
