package threadpractice.producerconsumerproblem;

public class PCApp {

    public static void main(String[] args) {
        Godown godown = new Godown();
        System.out.println("Godown Object Created....");
        Producer producer = new Producer(godown);
        System.out.println("Producer Object Created....");
        Consumer consumer = new Consumer(godown);
        System.out.println("Consumer Object Created....");
        producer.start();
        consumer.start();

    }
}
