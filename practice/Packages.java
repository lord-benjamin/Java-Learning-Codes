import calculators.*; // Importing all classes (not folders) from the calculators package

public class Packages {
    public static void main(String[] args) {
        AdvanceCalculator calc = new AdvanceCalculator();
        System.out.println(calc.addition(5, 3));
        System.out.println(calc.subtraction(5, 3));
        System.out.println(calc.multiplication(5, 3));
        System.out.println(calc.division(5, 3));
    }
}
