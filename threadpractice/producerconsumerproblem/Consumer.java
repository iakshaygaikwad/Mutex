package threadpractice.producerconsumerproblem;

public class Consumer extends Thread{
    Godown godown;
    Consumer(Godown g)
    {
        this.godown = g;
    }
    public void run(){

        for(int i = 0; i < 100; i++)
        {
            try {
                godown.takeItem();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
