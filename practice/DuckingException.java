class A{
    public void show(){  // This method is handling the exception, so it will not throw any exception to the caller of this method
        try {
            Class.forName("NotExistingClass");  // This will throw ClassNotFoundException
        }
        catch (ClassNotFoundException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
    public void show1() throws ClassNotFoundException {  // throws keyword is used to declare that this method can throw an exception - should be handled by the caller of this method
        Class.forName("NotExistingClass1");  // This will throw ClassNotFoundException
    }
}

public class DuckingException {
    public static void main(String[] args){
        A a = new A();
        a.show();  // This will not throw any exception because we have handled the exception in show() method of class A
        try {
            a.show1();  // This will throw ClassNotFoundException because we have not handled the exception in show1() method of class A
        }
        catch (ClassNotFoundException e) {
            System.out.println("Caught an exception: " + e.getMessage());
            e.printStackTrace();  // This will print the stack trace of the exception, which is helpful for debugging
        }
    }
}

