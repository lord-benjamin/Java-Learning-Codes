import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        List<String> upperCaseNames = names.stream()
                                        .map(String::toUpperCase)  // This is a method reference, it is a shorthand for lambda expression n -> n.toUpperCase()  // It is used to refer to a method of a class or an instance without invoking it
                                        .toList();
        
        upperCaseNames.forEach(System.out::println);  // This is also a method reference, it is a shorthand for lambda expression n -> System.out.println(n)
    }
}
