package threadpractice;

public class PrinterThread implements Runnable{

    public void run(){
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Thread " + Thread.currentThread().getName() + " = "+ i );
            System.out.println("Current Priority of " + Thread.currentThread().getName() + " is " + Thread.currentThread().getPriority());
            Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
            System.out.println("Changed Priority of " + Thread.currentThread().getName() + " is " + Thread.currentThread().getPriority());
        }

    }
    public static void main(String[] args) {
        PrinterThread printerThread = new PrinterThread();
        Thread thread = new Thread(printerThread);
        Thread thread1 = new Thread(printerThread);
        Thread thread2 = new Thread(printerThread);

        thread.start();
        try {thread.join();}
        catch(InterruptedException e) { e.printStackTrace(); }

        thread1.start();
        thread2.start();

    }
}
