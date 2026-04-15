interface A{  // Interface (no implementation, only method signatures) (like a abstract class with only abstract methods)
    int age = 10;          // by default variables in interface are public, static and final (constant)
    String name = "John";  // by default variables in interface are public, static and final (constant)
    
    void show();   // by default public and abstract
    void config();
}
interface X{
    void run();
}
interface Y extends X{

}

class B implements A,X{  // Class B implements interface A (must provide implementations for all methods)
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("in run");
    }
}

public class Interface {
    public static void main(String[] args) {
        A a = new B();  // Creating an instance of class B using interface reference
        a.show();
        a.config();

        System.out.println("A's age: " + A.age);  // Accessing interface variable
        System.out.println("A's name: " + A.name);

        X x = new B();
        x.run();
        // x.show();  // This will cause a compile-time error because show() is not defined in interface X
    }
}
