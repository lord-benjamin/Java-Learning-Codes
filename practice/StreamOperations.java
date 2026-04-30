import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(8,2,9,1,5,3);
        
        Predicate<Integer> isEven = new Predicate<>(){
            public boolean test(Integer n){
                return n%2==0;
            }
        };

        Function<Integer, Integer> square = new Function<>(){
            public Integer apply(Integer n){
                return n*2;
            }
        };

        Stream<Integer> s = nums.stream()
                        .filter(isEven)
                        .map(square)
                        .sorted();
        s.forEach(n -> System.out.println(n));
    }
}
