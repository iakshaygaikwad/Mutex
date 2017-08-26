package threadpractice.producerconsumerproblem;

public class Producer extends Thread{
    Godown godown;
    Producer(Godown g)
    {
        this.godown = g;
    }
    public void run(){
        for(int i = 0; i < 100; i++)
        {
            try {
                godown.pushItem();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
