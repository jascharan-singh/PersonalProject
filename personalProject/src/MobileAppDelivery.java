
public class MobileAppDelivery implements DeliveryStrategy {
    private boolean orderDelivered = false;

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Delivering order via mobile app: " + order);
        // Perform delivery logic
        // Update orderDelivered flag upon successful delivery
        orderDelivered = true;
    }

    public boolean isOrderDelivered() {
        return orderDelivered;
    }
}

