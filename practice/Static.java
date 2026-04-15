class Mobile {
    String brand;
    int price;
    static String name; // Static variable shared by all instances

    // static block - used to initialize static variables - will be called once when the class is loaded
    static {
        System.out.println("inside static block");
        name = "Default Mobile Name";
    }

    public Mobile() {
        System.out.println("inside constructor");
        brand = "Unknown";
        price = 0;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Name: " + name + ", Price: $" + price); // Can use static variable directly in instance method
    }

    public static void staticDisplay() {
        // System.out.println(price); // Cannot access non-static variable in static
        // method (will cause error)
        System.out.println("This is a static method. Name: " + name);
    }

    public static void staticDisplayWithInstance(Mobile m) {
        System.out.println("This is a static method with instance. Brand: " + m.brand + ", Name: " + name + ", Price: $" + m.price);
    }
}

public class Static {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile"); // loads the Mobile class (executes the static block)

        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 999;
        m1.name = "iPhone 13";

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 899;
        m2.name = "Galaxy S21";

        Mobile.name = "Smartphone"; // Accessing static variable through class name

        m1.display();
        m2.display();

        Mobile.staticDisplay(); // Calling static method through class name

        Mobile.staticDisplayWithInstance(m1); // Calling static method with instance
        Mobile.staticDisplayWithInstance(m2); // Calling static method with instance
    }
}
