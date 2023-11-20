import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientMenu implements Menu, OrderObserver{
    private String name1;
    private String surname1;
    private PaymentAdapter paymentMethod;

    @Override
    public void update(String product) {
        System.out.println(name1 + " " + surname1 + " is notified: Product '" + product + "' has been purchased.");
    }
    private DeliveryStrategy deliveryStrategy = new StandardDelivery();
    private Client client = new Client();

    public static List<Client> clients = new ArrayList<>();

    @Override
    public void buyProduct() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What product do you want to buy? (We have Iphone, MacBook Pro, Air Book)");
        String product = scanner.nextLine();
        ProductComponent coreProduct = new ConreteProduct("Iphone", 1000);
        if(product.equals("Iphone")){
            deliveryStrategy.deliverProduct("Iphone");
            coreProduct = new EarphonesDecorator(coreProduct, 250);
            coreProduct = new CaseDecorator(coreProduct, 30);
            System.out.println("Product: " + coreProduct.getName() + ", Cost: $" + coreProduct.getCost());
        }
        else if(product.equals("MacBook Pro")){
            deliveryStrategy.deliverProduct("MacBook Pro");
        }
        else if(product.equals("Air Book")){
            deliveryStrategy.deliverProduct("Air Book");
        }
    }
    public void setDeliveryStrategy(DeliveryStrategy strategy) {
        this.deliveryStrategy = strategy;
    }
    @Override
    public void sellProduct() {

    }

    @Override
    public boolean subscribe() {
        if (!clients.contains(client)) {
            clients.add(client);
            return true;
        }
        return false;
    }

    @Override
    public boolean unsubscribe() {
        if(clients.contains(client)){
            clients.remove(client);
            return true;
        }
        return false;
    }

    @Override
    public void notifySubscriber() {
    }

    @Override
    public void inBasket() {
        if (paymentMethod != null) {
            int totalCost = calculateTotalCost();
            paymentMethod.pay(totalCost);
        } else {
            System.out.println("Please set a payment method before proceeding to the basket.");
        }
    }
    public void setPaymentMethod(PaymentAdapter paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    private int calculateTotalCost() {
        return 4500;
    }
}
