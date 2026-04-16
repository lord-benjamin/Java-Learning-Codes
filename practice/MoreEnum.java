enum Laptop{
    Macbook(2000),Dell(1500),HP,Lenovo(1200);

    private int price;

    Laptop(){}

    Laptop(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}

public class MoreEnum {
    public static void main(String[] args) {
        Laptop lap = Laptop.Dell;
        System.out.println(lap + " costs $" + lap.getPrice());

        Laptop[] arr = Laptop.values();
        for(Laptop i: arr){
            System.out.println(i + " costs $" + i.getPrice());
        }
    }
}
