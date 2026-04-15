class A{
    public void display() {
        System.out.println("Hello from A");
    }
}

class B extends A{
    public void display() {
        System.out.println("Hello from B");
    }
}

class C extends B{
    public void display() {
        System.out.println("Hello from C");
    }
}

public class DynamicMemoryDispatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.display(); // Hello from A

        obj = new B();
        obj.display(); // Hello from B

        obj = new C();
        obj.display(); // Hello from C

        // B obj1 = new A(); // Compile-time error: incompatible types: A cannot be converted to B
    }
}
