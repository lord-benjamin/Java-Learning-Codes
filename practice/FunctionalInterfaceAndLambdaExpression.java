@FunctionalInterface   // Functional interface - an interface with only one abstract method
interface A{
    void show(int i);
}

@FunctionalInterface
interface B{
    int add(int i,int j);
}

public class FunctionalInterfaceAndLambdaExpression {
    public static void main(String[] args) {
        A a = (i) -> System.out.println(i);  // Using a lambda expression to implement the functional interface
        a.show(5);

        B b = (i, j) -> i + j;  // Lambda expression - can only be used for functional interfaces
        System.out.println(b.add(5, 10));
    }
}
