public class Organization {
    private String name;
    private String address;
    private int ID;
    
    private Product [] products;
    private Customer [] customer;

    public Organization() {
    }
// Constructor to initialize organization with products and customers
    public Organization(String name, String address, int ID, Product[] products, Customer[] customers) {
        this.name = name;
        this.address = address;
        this.ID = ID;
        this.products = products;
        this.customer = customers;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] Products) {
        this.products = Products;
    }

    public Customer[] getCustomer() {
        return customer;
    }

    public void setCustomer(Customer[] Customer) {
        this.customer = Customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
// Returns full organization info including products and customers
    @Override
    public String toString() {
         String result = "Organization Info:\n";
    result += "Name: " + name + "\n";
    result += "Address: " + address + "\n";
    result += "ID: " + ID + "\n";

    result += "\n--- Products ---\n";
    for (int i = 0; i < products.length; i++) {
        result += products[i].toString() + "\n";
    }

    result += "\n--- Customers ---\n";
    for (int i = 0; i < customer.length; i++) {
        result += customer[i].toString() + "\n";
    }

    return result;
    }
}
