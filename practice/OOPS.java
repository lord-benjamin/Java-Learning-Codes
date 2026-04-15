class Human {
    private int age;
    private String name;

    public Human() {   // Default Constructor
        age = 12;
        name = "John Doe";
    }

    public Human(int age, String name) {   // Parameterized Constructor
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class OOPS {
    public static void main(String[] args) {
        Human h = new Human();
        System.out.println("Name: " + h.getName() + ", Age: " + h.getAge());
        h.setAge(25);
        h.setName("Alice Smith");
        System.out.println("Name: " + h.getName() + ", Age: " + h.getAge());

        Human h2 = new Human(30, "Bob Johnson");
        System.out.println("Name: " + h2.getName() + ", Age: " + h2.getAge());
    }
}
