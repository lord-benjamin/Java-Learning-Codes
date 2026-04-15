class A{
    public void show(){
        System.out.println("in show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A a = new A() {   // Anonymous inner class (no name, extends A)
            public void show(){
                System.out.println("in anonymous inner class");
            }
        };
        a.show();
    }
}
