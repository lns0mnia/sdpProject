import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> data = new ArrayList<>();
        ArrayList<Product> prod = new ArrayList<>();
        Menu menu;
        Scanner scan = new Scanner(System.in);
        User user1 = new User("Alikhan", "Boltekov", 0);
        User user2 = new User("Dauren", "Kambarov", 1);
        data.add(user1);
        data.add(user2);
        Product product1 = new Product("Iphone", 1150);
        prod.add(product1);
        DataBase databasecon = DataBase.getConnection();
        databasecon.insertData(data);
        DataBase databaseProd = DataBase.getConnection();
        databaseProd.insertProduct(prod);
        System.out.println("Welcome, who are you? (Client/Seller)");
        String classname = scan.nextLine();
        String username;
        if ("Client".equalsIgnoreCase(classname.trim())){
            System.out.println("What is your client name?");
            username = scan.nextLine();
            for (int i = 0; i < databasecon.userData.size(); i++) {
                if (databasecon.userData.get(i).name.equals(username)){
                    System.out.println("Hello Client " + databasecon.userData.get(i).name);
                    ClientMenu men = new ClientMenu();
                    System.out.println("What type of ship do you prefer?");
                    String ship = scan.nextLine();
                    if(ship.equals("Express")){
                        men.setDeliveryStrategy(new ExpressDelivery());
                        men.buyProduct();
                    }
                    else if(ship.equals("Standart")){
                        men.setDeliveryStrategy(new StandardDelivery());
                        men.buyProduct();
                    }
                    return;
                }
            }
        }
        else if (classname.equals("Seller")){
            System.out.println("What is your sellername?");
            username = scan.nextLine();
            for (int i = 0; i < databasecon.userData.size(); i++) {
                if (databasecon.userData.get(i).name.equals(username)){
                    System.out.println("Hello Seller " + databasecon.userData.get(i).name);
                    menu = new SellerMenu();
                    menu.sellProduct();
                    menu.notifySubscriber();
                    return;
                }
            }
        }

    }
}