class A {
    public A() {
        System.out.println("Constructor of class A");
    }
    void display() {
        System.out.println("Hello from class A");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        // Using an anonymous object to call a method directly
        new A().display(); // Creates an A object and calls display() without storing the reference
        // Cannot call display() again on the same object since it is anonymous and not stored in a variable
    }
}
