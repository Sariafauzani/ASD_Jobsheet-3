public class Item {
    public String name;
    public int price;
    public int stock;
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }
}