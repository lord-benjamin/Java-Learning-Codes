import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<String, Integer>();  //Unordered collection of key-value pairs, it does not allow duplicate keys and it does not maintain any order of the elements

        students.put("Ajay",85);
        students.put("Vijay",90);
        students.put("Sanjay",80);
        students.put("Digvijay",95);
        students.put("Ajay",88);  // This will update the value of key "Ajay" to 88, as keys are unique in a map and it does not allow duplicate keys

        System.out.println(students);

        System.out.println(students.get("Vijay"));

        System.out.println(students.keySet());

        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }
    }
}
