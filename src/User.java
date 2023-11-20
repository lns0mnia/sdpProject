public class User {
    User(String Name, String Surname, int id){
        setProps(Name, Surname, id);
    }
    User(){}
    String name;
    String surname;
    int ID;
    public void setProps(String Name, String Surname, int id){
        name = Name;
        surname = Surname;
        ID = id;
    }
    void displayInfprmation(){
        System.out.println("User Info: "  + name + " " + surname + " " + ID);

    }
}
