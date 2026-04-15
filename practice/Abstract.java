abstract class Car {  // Abstract class (cannot be instantiated)
    public abstract void drive();  // Abstract method (no implementation)
    public void playMusic(){
        System.out.println("Playing music...");
    }
}

class WagonR extends Car {  // Subclass that extends the abstract class and implements the abstract method
    public void drive() {
        System.out.println("Driving a WagonR...");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Car car = new WagonR();  // Creating an instance of the subclass
        car.drive();  // Calling the implemented method
        car.playMusic();
    }
}
