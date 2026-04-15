class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {   // method overloading
        return a + b + c;
    }
    public double add(double a, double b) {    // method overloading
        return a + b;
    }
}

public class Classes {
    public static void main(String[] args) {
        int num1=4, num2=5, num3=6;
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);

        int result2 = calc.add(num1, num2, num3);
        System.out.println("The sum of " + num1 + ", " + num2 + " and " + num3 + " is: " + result2);

        double d1 = 3.5, d2 = 4.5;
        double result3 = calc.add(d1, d2);
        System.out.println("The sum of " + d1 + " and " + d2 + " is: " + result3);
    }
}
