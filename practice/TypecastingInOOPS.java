class A{
    public void display1() {
        System.out.println("Hello from A");
    }
}

class B extends A{
    public void display2() {
        System.out.println("Hello from B");
    }
}

public class TypecastingInOOPS {
    public static void main(String[] args) {
        A obj = (A) new B();  // Upcasting: B is being treated as A
        obj.display1(); // Hello from A

        // obj.display2(); // Compile-time error: cannot find symbol

        B obj1 = (B) obj; // Downcasting: A is being treated as B
        obj1.display2(); // Hello from B
    }
}
