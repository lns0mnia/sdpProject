
interface DeliveryStrategy {
    void deliverProduct(String product);
}

class StandardDelivery implements DeliveryStrategy {
    @Override
    public void deliverProduct(String product) {
        System.out.println("Delivering " + product + " with standard delivery.");
    }
}

class ExpressDelivery implements DeliveryStrategy {
    @Override
    public void deliverProduct(String product) {
        System.out.println("Delivering " + product + " with express delivery.");
    }
}