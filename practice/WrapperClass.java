public class WrapperClass {
    public static void main(String[] args) {
        int a = 5; // Primitive data type

        Integer num1 = new Integer(a); // Converting primitive to wrapper class (boxing)
        num1 = a; // Auto-boxing: Java automatically converts primitive to wrapper class
        System.out.println("Wrapper class value: " + num1);

        int num2 = num1.intValue(); // Converting wrapper class to primitive (unboxing)
        num2 = num1; // Auto-unboxing: Java automatically converts wrapper class to primitive
        System.out.println("Primitive value: " + num2);

        String str = "12";
        int num3 = Integer.parseInt(str); // Converting String to primitive int
        System.out.println(num3*2); // 24
    }
}