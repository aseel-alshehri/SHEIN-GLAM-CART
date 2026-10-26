public class Customer {
    private String name;
    private int ID;
    private String address;
    private int mobilenumber;
    private String email;
    
// Constructor to initialize full customer details
    public Customer(String name, int ID, String address, int mobilenumber, String email) {
        this.name = name;
        this.ID = ID;
        this.address = address;
        this.mobilenumber = mobilenumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(int mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
// Returns customer details as a formatted string
    @Override
    public String toString() {
        return "" +"name : " + name + ", ID : " + ID + ", address : " + address + ", mobilenumber : " + mobilenumber + ", email : " + email ;
    }
    
    
    
            
}
