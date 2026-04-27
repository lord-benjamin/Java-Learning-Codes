class A extends Thread{
    public void run(){   // The run method is where we define the code that will be executed in the new thread when we call start()
        for(int i=1; i<5; ++i){
            System.out.println("Hi from A");
            try{
                Thread.sleep(1);  // This will make the current thread (the one executing this code) sleep for 1 millisecond
            }
            catch(InterruptedException e){  // This exception is thrown if another thread interrupts the current thread while it is sleeping
                System.out.println("Thread A was interrupted: " + e.getMessage());
            }
        }
    }
}

class B extends Thread{
    public void run(){   // The run method is where we define the code that will be executed in the new thread when we call start()
        for(int i=1; i<5; ++i){
            System.out.println("Hello from B");
            try{
                Thread.sleep(1);  // This will make the current thread (the one executing this code) sleep for 1 millisecond
            }
            catch(InterruptedException e){  // This exception is thrown if another thread interrupts the current thread while it is sleeping
                System.out.println("Thread B was interrupted: " + e.getMessage());
            }
        }
    }
}

public class MultiThread {
    public static void main(String[] args){
        A a = new A();
        B b = new B();

        // Thread Priority
        a.setPriority(Thread.MIN_PRIORITY);  // Setting the priority of thread a to minimum (1)
        b.setPriority(Thread.MAX_PRIORITY);  // Setting the priority of thread b to maximum
        // By default, all threads have a priority of 5 (Thread.NORM_PRIORITY)
        // Setting priority doesn't mean that the thread with higher priority will always execute first, it is just a hint to the thread scheduler.
        // The actual scheduling of threads is determined by the JVM and the underlying operating system.


        a.start();  // This will call the run method of class A in a new thread
        b.start();  // This will call the run method of class B in a new thread
    }
}
