import java.util.ArrayList;
public class DataBase {
    ArrayList<User> userData;
    ArrayList<Product> productData;
    private static DataBase databaseConnection;
    private DataBase(){
        System.out.println("Connecting to Data Base");
        userData = new ArrayList<>();
        productData = new ArrayList<>();
    }
    public static DataBase getConnection(){
        if(databaseConnection == null){
            databaseConnection = new DataBase();
        }
        return databaseConnection;
    }
    public User selectData(int index){
        return userData.get(index);
    }
    public Product selectProduct(int index){
        return productData.get(index);
    }
    public void insertData(ArrayList<User> d){
        if (d != null) {
            for (int i = 0; i < d.size(); i++) {
                userData.add(d.get(i));
                System.out.println("New user: [" + selectData(i).surname + ", " + selectData(i).name + ", " + selectData(i).ID + "] inserted in Data Base! ");
            }
        }
    }
    public void insertProduct(ArrayList<Product> p){
        if (p != null) {
            for (int i = 0; i < p.size(); i++) {
                productData.add(p.get(i));
                System.out.println("New Product: [" + selectProduct(i).name + ", " + selectProduct(i).cost + "] inserted in Data Base! ");
            }
        }
    }

}
