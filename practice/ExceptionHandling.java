class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        int i=20,j=0;
        int a[] = {1,2,3,4,5};
        String str = null;
        try {
            j = 10/i;  //Critical statements are written in try block
            if(j == 0){
                throw new MyException("I don't want to print 0");
            }

            System.out.println(str.length());  //Critical statement
            System.out.println(a[10]);   //Critical statement
        }   
        catch (MyException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        catch (Exception e) {  // If we don't know type of exception, the we can catch it by using parent class of all exceptions i.e. Exception class
            System.out.println("Caught an exception: " + e.getMessage());
        }
        System.out.println(j);
    }
}
