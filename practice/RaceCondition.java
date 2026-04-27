class Counter{
    public int count = 0;
    public synchronized void increment(){  // This will make sure that only one thread can execute this method at a time, this is how we can prevent race condition  // Thread-safe
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException{
        Counter c = new Counter();
        Runnable a = () -> {
            for(int i=0; i<10000; ++i){
                c.increment();
            }
        };
        Runnable b = () -> {
            for(int i=0; i<10000; ++i){
                c.increment();
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

        t1.join();  // This will make the main thread wait until t1 is finished  // Throws InterruptedException
        t2.join();  // This will make the main thread wait until t2 is finished  // Throws InterruptedException

        System.out.println("Final count: " + c.count);
    }
}
