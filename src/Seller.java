import java.util.ArrayList;

public class Seller extends User{
    private String name;
    private int rating;
    public Seller(String name, int rating){
        this.name = name;
        this.rating = rating;
    }

    @Override
    void displayInfprmation() {
        super.displayInfprmation();{
            System.out.println("Rating of Seller: " + rating);
        }
    }

    public boolean putForSale(){
        return true;
    }

}
