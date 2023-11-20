import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SellerMenu implements Menu, OrderObject{
    private List<OrderObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String product) {
        for (OrderObserver observer : observers) {
            observer.update(product);
        }
    }
    @Override
    public void sellProduct() {
        System.out.println("What you want to sell ?");
        Scanner scam = new Scanner(System.in);
        String nameOfProd = scam.nextLine();
        if(nameOfProd.equals("Iphone") || nameOfProd.equals("AirBook")){
            System.out.println("How much it will cost? ");
            int costOfProd = scam.nextInt();
            System.out.println("Nice! Your product have inserted in market! ");
            notifyObservers(nameOfProd);
        }
        else{
            System.out.println("We can not apply this product! ");
        }
    }

    @Override
    public void buyProduct() {

    }

    @Override
    public boolean subscribe() {
        return false;
    }
    @Override
    public boolean unsubscribe() {
        return false;
    }

    @Override
    public void notifySubscriber() {

    }

    @Override
    public void inBasket() {

    }


}
