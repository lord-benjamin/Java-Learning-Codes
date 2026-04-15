class A{
    void display() {
        System.out.println("Hello from A");
    }
    void config() {
        System.out.println("Config from A");
    }
}

class B extends A{
    void display() {
        System.out.println("Hello from B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
    B b = new B();
    b.display();
    b.config();
    }
}
