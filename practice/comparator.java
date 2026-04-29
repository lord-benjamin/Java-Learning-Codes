import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("fivaeuv");
        strings.add("eveablivbav");
        strings.add("cevaf");
        strings.add("jeavib");
        strings.add("avlajalve");

        Comparator<String> comp = (String a, String b) -> {  // We are creating a lambda expression to implement the Comparator interface and override the compare method to sort the strings in ascending order based on their lengths
            return a.length() > b.length() ? 1 : -1;
        };

        Collections.sort(strings, comp);

        for(String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    
}
