package threadpractice.producerconsumerproblem;

public class Godown {
    public static final int CAPACITY = 10;
    int itemCount;
    //Godown()
    {
        itemCount = 0;
    }
    public synchronized void pushItem() throws InterruptedException {
        if (itemCount < CAPACITY)
        {
            if (itemCount == 0)
            {
                itemCount++;
                System.out.println("++Item Count= "+itemCount);
                System.out.println("Waking Up Consumer.....");
                notify();

            }
            else
            {
                itemCount++;
                System.out.println("++Item Count= " + itemCount);
            }
        }
        else
        {
            System.out.println("Producer Going to Sleep....");
            wait();
        }
    }
    public synchronized void takeItem() throws InterruptedException {
        if (itemCount == 0)
        {
            System.out.println("Consumer Going to Sleep....");
            wait();
        }
        else
        {
            if (itemCount == CAPACITY)
            {
                itemCount--;
                System.out.println("--Item Count= " + itemCount);
                System.out.println("Waking Up Producer.....");
                notify();
            }
            else
            {
                itemCount--;
                System.out.println("--Item Count= " + itemCount);
            }
        }
    }
}
