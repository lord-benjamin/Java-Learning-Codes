import java.util.Arrays;
import java.util.List;

class Student{
    private String name;
    private int age;
    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    
}

public class ConstructorReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        List<Student> students = names.stream()
                                .map(name -> new Student(name))
                                .toList();
        System.out.println(students);

        List<Student> students1 = names.stream()
                                .map(Student::new)  // This is a constructor reference, it is a shorthand for lambda expression name -> new Student(name)  // It is used to refer to a constructor of a class without invoking it
                                .toList();
        System.out.println(students1);
    }
}
