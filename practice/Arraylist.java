import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();  // Good to add numbers, but better to use List interface instead of Collection interface as it has more methods that are specific to lists
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(6);

        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(5));

        for(int n : nums){
            System.out.print(n+" ");
        }
        System.out.println();
    }
}
