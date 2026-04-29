import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();  // Unordered collection of unique elements, it does not allow duplicate values and it does not maintain any order of the elements
        nums.add(65);
        nums.add(59);
        nums.add(82);
        nums.add(21);
        nums.add(65);

        for(int n : nums){
            System.out.print(n+" ");
        }
        System.out.println();

        Set<Integer> nums2 = new TreeSet<Integer>();  // Ordered collection of unique elements, it does not allow duplicate values and it maintains the natural order of the elements (ascending order for numbers)
        nums2.add(65);
        nums2.add(59);
        nums2.add(82);
        nums2.add(21);
        nums2.add(65);

        for(int n : nums2){
            System.out.print(n+" ");
        }
        System.out.println();


        Iterator<Integer> it = nums.iterator();  // We can use an iterator to traverse through the elements of a collection
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }
}
