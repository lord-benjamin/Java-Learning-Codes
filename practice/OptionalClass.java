import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        Optional<String> name1 = names.stream()
                        .filter(n -> n.startsWith("A"))
                        .findFirst();  // This will return an Optional<String> which may or may not contain a value (in this case, it will contain a value as there is a name that starts with "A")
        System.out.println(name1.orElse("No name found"));

        String name2 = names.stream()
                        .filter(n -> n.startsWith("Z"))
                        .findFirst()  // This will return an Optional<String> which may or may not contain a value (in this case, it will not contain a value as there is no name that starts with "Z")
                        .orElse("No name found");  // This will return the value contained in the Optional if it is present, otherwise it will return the default value provided as an argument (in this case, "No name found")
        System.out.println(name2);
    }
}
