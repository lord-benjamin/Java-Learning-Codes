import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {   // Not a good practice to throw IOException from main method
        // Try-finally  // Better than try-with-resources as we know which resources we are closing
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(br.readLine());
            System.out.println("You entered: " + num);
        }
        finally{  // finally block will always execute, even if an exception is thrown in the try block   // This is where we can close the resources to ensure it happens regardless of exceptions
            // br.close(); // We will not close the BufferedReader here because it will also close System.in, which will be used by the BufferedReader in next lines. In a real application, we would want to close resources here, but for this example, we will leave it open.
        }

        // Try-with-resources
        try (BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in))) {  // br1 will be automatically closed at the end of this try block, even if an exception occurs
            System.out.print("Enter a number: ");
            int num1 = Integer.parseInt(br1.readLine());
            System.out.println("You entered: " + num1);
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
