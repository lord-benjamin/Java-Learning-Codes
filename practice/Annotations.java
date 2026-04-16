class A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("This is class A");
    }
}

class B extends A{
    @Override    // Annotations - tells the intention of the programmer
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("This is class B");
    }
}

public class Annotations {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
