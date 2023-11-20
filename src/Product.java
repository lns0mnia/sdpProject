public class Product {
    Product(String Name, int Cost){
        getProp(Name, Cost);
    }
    String name;
    int cost;
    public void getProp(String Name, int Cost){
        name = Name;
        cost = Cost;
    }
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
}
