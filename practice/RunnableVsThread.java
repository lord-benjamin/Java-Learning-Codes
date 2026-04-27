class A implements Runnable{  // same as class A extends Thread, but now we need to implement run() method from Runnable interface and we don't have any other methods from Thread class available to us
    public void run(){
        for(int i=1; i<5; ++i){
            System.out.println("Hi from A");
            try{
                Thread.sleep(1);
            }
            catch(InterruptedException e){
                System.out.println("Thread A was interrupted: " + e.getMessage());
            }
        }
    }
}

class B implements Runnable{  // same as class B extends Thread, but now we need to implement run() method from Runnable interface and we don't have any other methods from Thread class available to us
    public void run(){
        for(int i=1; i<5; ++i){
            System.out.println("Hello from B");
            try{
                Thread.sleep(1);
            }
            catch(InterruptedException e){
                System.out.println("Thread B was interrupted: " + e.getMessage());
            }
        }
    }
}

public class RunnableVsThread {
    public static void main(String[] args){
        Runnable a = () -> {  // Using lambda function as Runnable is a functional interface, we can use lambda expressions to create instances of Runnable without having to write a separate class that implements Runnable and overrides the run() method.
            for(int i=1; i<5; ++i){
                System.out.println("Hi from A");
                try{
                    Thread.sleep(1);
                }
                catch(InterruptedException e){
                    System.out.println("Thread A was interrupted: " + e.getMessage());
                }
            }
        };
        Runnable b = () -> {  // Using lambda function as Runnable is a functional interface, we can use lambda expressions to create instances of Runnable without having to write a separate class that implements Runnable and overrides the run() method.
            for(int i=1; i<5; ++i){
                System.out.println("Hello from B");
                try{
                    Thread.sleep(1);
                }
                catch(InterruptedException e){
                    System.out.println("Thread B was interrupted: " + e.getMessage());
                }
            }
        };

        Thread t1 = new Thread(a);  // We need to create a Thread object and pass the Runnable object to it, this is how we can run the code in a new thread when we are using Runnable interface. The Thread class has a constructor that takes a Runnable object as an argument and it will call the run() method of that Runnable object when we call start() on the Thread object.
        Thread t2 = new Thread(b);  // We need to create a Thread object and pass the Runnable object to it, this is how we can run the code in a new thread when we are using Runnable interface. The Thread class has a constructor that takes a Runnable object as an argument and it will call the run() method of that Runnable object when we call start() on the Thread object.

        t1.start();
        t2.start();
    }
}
