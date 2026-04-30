import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        Consumer<Integer> con = new Consumer<>(){
            public void accept(Integer n){
                System.out.println(n);
            }
        };

        nums.forEach(con);
        nums.forEach(n -> System.out.println(n));  // More concise way
    }
}
