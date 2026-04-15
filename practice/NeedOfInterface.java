interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("developing laptop");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("developing desktop");
    }
}

class Developer{
    public void develop(Computer comp){
        comp.code();
    }
}

public class NeedOfInterface {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        Developer dev = new Developer();
        dev.develop(laptop);
        dev.develop(desktop);
    }
}
