public class WebsiteDelivery implements DeliveryStrategy {
    private boolean orderDelivered = false;

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Delivering order via website: " + order);
        orderDelivered = true;
    }

    public boolean isOrderDelivered() {
        return orderDelivered;
    }
}
