enum Status{
    Running, Failed, Pending, Success
}

public class Enum {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] arr = Status.values();
        for(Status i: arr){
            System.out.println(i + " " + i.ordinal());
        }
    }
}
