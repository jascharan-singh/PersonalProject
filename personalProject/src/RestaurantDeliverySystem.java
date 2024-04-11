public class RestaurantDeliverySystem {
    private DeliveryStrategy deliveryStrategy;

    public void setDeliveryStrategy(DeliveryStrategy strategy) {
        this.deliveryStrategy = strategy;
    }

    public void placeOrder(Order order) {
        deliveryStrategy.deliverOrder(order);
    }
}