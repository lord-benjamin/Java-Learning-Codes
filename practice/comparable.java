import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
    @Override
    public int compareTo(Student that) {
        if(this.age > that.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}

public class comparable {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Ajay",23));
        studs.add(new Student("Vijay",68));
        studs.add(new Student("Sanjay",54));
        studs.add(new Student("Digvijay",32));
        studs.add(new Student("Ejay",43));

        // Collections.sort(studs);  // This will give an error because the Student class does not implement the Comparable interface and does not override the compareTo method, so the sort method does not know how to compare two Student objects to determine their order in the sorted list.
        Collections.sort(studs);

        for(Student s : studs) {
            System.out.println(s);
        }
    }
}
