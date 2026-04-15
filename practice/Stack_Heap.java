public class Stack_Heap {
    public static void main(String[] args) {
        // Stack memory example
        int x = 10; // primitive type stored in stack
        System.out.println("Value of x: " + x);

        // Heap memory example
        String str1 = new String("Hello"); // reference type stored in heap
        String str2 = new String("Hello"); // another reference type stored in heap

        System.out.println("Value of str1: " + str1);
        System.out.println("Value of str2: " + str2);
    }
}
