import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        Stream<Integer> s = nums.stream();  // This will create a stream of integers from the list of integers (will not modify the original list)  // One stream can be used only once
        Stream<Integer> s1 = s.filter(n -> n%2==0);  // This will create a new stream that contains only the even numbers from the original stream (s)
        Stream<Integer> s2 = s1.map(n -> n*2);  // This will create a new stream that contains the squares of the even numbers from the original stream (s)
        int result = s2.reduce(0, (a,b) -> a+b);  // This will reduce the stream to a single value by applying the given binary operator (in this case, it will sum up all the elements in the stream)  // The first argument is the identity value for the reduction operation (in this case, 0 for addition)
        System.out.println(result);

        // We can also chain all the operations together in a single statement because one stream can be used only once and each operation returns a new stream
        int result2 = nums.stream()
                        .filter(n -> n%2==0)
                        .map(n-> n*2)
                        .reduce(0,(a,b) -> a+b);
        System.out.println(result2);
    }
}
