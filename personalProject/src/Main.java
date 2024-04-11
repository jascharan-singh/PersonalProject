
public class Main {
    public static void main(String[] args) {
        RestaurantDeliverySystem deliverySystem = new RestaurantDeliverySystem();
        WebsiteDelivery websiteDelivery = new WebsiteDelivery();
        MobileAppDelivery mobileAppDelivery = new MobileAppDelivery();

        deliverySystem.setDeliveryStrategy(websiteDelivery);// we are call calling web site and mobil to insure unit test working
        Order order = new Order("Pizza", 15.99);// for exaple we gave order by hard code
        deliverySystem.placeOrder(order);

        deliverySystem.setDeliveryStrategy(mobileAppDelivery);
        deliverySystem.placeOrder(order);
    }
}