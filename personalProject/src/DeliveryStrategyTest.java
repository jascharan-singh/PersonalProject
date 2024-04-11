import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeliveryStrategyTest {

    @Test
    void testOrderDeliveredViaWebsite() {
        RestaurantDeliverySystem deliverySystem = new RestaurantDeliverySystem();
        WebsiteDelivery websiteDelivery = new WebsiteDelivery();

        deliverySystem.setDeliveryStrategy(websiteDelivery);
        Order order = new Order("Pizza", 15.99);
        deliverySystem.placeOrder(order);

        assertTrue(websiteDelivery.isOrderDelivered());
    }


    @Test
    void testOrderDeliveredViaMobileApp() {
        RestaurantDeliverySystem deliverySystem = new RestaurantDeliverySystem();
        MobileAppDelivery mobileAppDelivery = new MobileAppDelivery(); // Initialize MobileAppDelivery

        deliverySystem.setDeliveryStrategy(mobileAppDelivery);
        Order order = new Order("Pizza", 15.99);
        deliverySystem.placeOrder(order);

        assertTrue(mobileAppDelivery.isOrderDelivered()); // Assert order delivery status
    }



    private class TestObserver implements DeliveryStrategy {
        private boolean orderDelivered = false;

        @Override
        public void deliverOrder(Order order) {
            orderDelivered = true;
        }

        public boolean isOrderDelivered() {
            return orderDelivered;
        }

        public void reset() {
            orderDelivered = false;
        }
    }

}