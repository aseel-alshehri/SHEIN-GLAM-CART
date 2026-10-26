import java.util.Scanner;


public class APP {

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        // Collect user input and create Customer object
        System.out.println("-------- Welcome to your SHEIN glam cart! --------");
        System.out.println("Let's get to know you!  Please enter your information below:");
        
        System.out.println("Enter your name:  ");
        String name = in.nextLine();
        
        System.out.println("Enter your address:  ");
        String address = in.nextLine();
        
        System.out.println("Enter your email:  ");
        String email = in.nextLine();

        System.out.println("Enter your mobile number:  ");
        int mobilenumber = in.nextInt();
        
        System.out.println("Ernter your ID: ");
        int ID = in.nextInt();
        

        
        
        Customer customer1 = new Customer (name , ID , address, mobilenumber , email);

        
        // Create sample Product objects
        Product person1 = new Product(123456,"lip stick aheglam",11.75);
        Product person2 = new Product(1299956,"concealer",55.95);
        Product person3 = new Product(123456,"blusher",88.25);
        Product person4 = new Product(1299956,"eyeliner",35.99);
        
        Customer[] CustomerArray = {customer1};
        Product[] ProductAraay = {person1 ,person2,person3,person4};
        // Create Organization object and display details
        Organization shein = new Organization("shein","China",43213,ProductAraay,CustomerArray);
        
        System.out.println();
        System.out.println(shein);
        
    }
    
}
