enum Status{
    Running, Failed, Pending, Success
}

public class SwitchWithEnum {
    public static void main(String[] args){
        Status s = Status.Pending;
        switch(s){
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Something went wrong");
                break;
            case Pending:
                System.out.println("In progress");
                break;
            case Success:
                System.out.println("Operation completed successfully");
                break;
            default:
                System.out.println("Invalid status");
                break;
        }
    }
}
