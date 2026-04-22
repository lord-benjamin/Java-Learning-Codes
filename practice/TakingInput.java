import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        // BufferedReader
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(br.readLine());  //br.readLine() returns a String, so we need to parse it to an integer  // Throws IOException, so we need to handle it with try-catch
            System.out.println("You entered: " + num);
            // br.close();  // Remove this line to avoid closing System.in for the Scanner later
        }
        catch (IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }

        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("You entered: " + num1);
        sc.close();
    }
}
