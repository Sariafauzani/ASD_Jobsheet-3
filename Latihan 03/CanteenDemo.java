public class CanteenDemo {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "Nasi Uduk";
        item1.price = 10000;
        item1.stock = 10;
        item1.displayInfo();

        Item item2 = new Item();
        item2.name = "Angsle";
        item2.price = 6000;
        item2.stock = 10;
        item2.displayInfo();

        Item item3 = new Item();
        item3.name = "Teh Pucuk";
        item3.price = 5000;
        item3.stock = 5;
        item3.displayInfo();
    }
}