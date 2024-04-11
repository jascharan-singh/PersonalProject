public class Order {
    private String item;
    private double price;

    public Order(String item, double price) {
        this.item = item;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }
}