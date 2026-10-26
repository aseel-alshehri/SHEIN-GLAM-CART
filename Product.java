public class Product {
    private  int ID;
    private String name;
    private double price;

    public Product() {
    }
// Constructor to initialize product info
    public Product(int ID, String name, double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
// Returns product info as a formatted string
    @Override
    public String toString() {
         return "Product ID: " + ID + ", Name: " + name + ", Price: " + price + "$";
    }
    
}
