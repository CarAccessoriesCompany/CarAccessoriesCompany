package CarAccessoriesCompany_Main;

import java.util.ArrayList;

public class DataArrayList {
	
	public static ArrayList<User> Admin = new ArrayList<User>();
	public static ArrayList<Customer> Customers = new ArrayList<Customer>();
	public static ArrayList<Installer> Installers = new ArrayList<Installer>();
	
//	public static ArrayList<Product> Interior = new ArrayList<Product>();
//	public static ArrayList<Product> Exterior = new ArrayList<Product>();
//	public static ArrayList<Product> Electronics = new ArrayList<Product>();
	
	public static ArrayList<Product> Products = new ArrayList<Product>();
	public static ArrayList<Category> Categories = new ArrayList<Category>();
	
	public static ArrayList<Order> Orders = new ArrayList<Order>();
	
//	public static String[] Category = {"Interior", "Exterior", "Electronics"};
	
	public DataArrayList() {
		User firstAdmin = new User("Ahmaddweikat@gmail.com","Ahmad123");
		User secondAdmin = new User("Hameedo@gmail.com","Hameedo123");
		Admin.add(firstAdmin);
		Admin.add(secondAdmin);
		
		Customer firstCustomer = new Customer("Customer1@gmail.com","Customer123", "Customer1","056-1234567");
		Customer secondCustomer = new Customer("Customer2@gmail.com","Customer456", "Customer2","056-345678");
		Customers.add(firstCustomer);
		Customers.add(secondCustomer);
		
		Installer firstInstaller = new Installer("Installer1@gmail.com","Installer123", "Installer1", "Available");
		Installer secondInstaller = new Installer("Installer2@gmail.com","Installer456", "Installer2", "Busy");
		Installers.add(firstInstaller);
		Installers.add(secondInstaller);
		
		Product  InteriorPart1 = new Product("Steering Wheel", "The wheel which the driver holds when he or she is driving", "100$", "Yes","Interior");
		Product  InteriorPart2 = new Product("Speedometer and Fuel Gauge", "The speedometer displays wheel speed. Meanwhile, the fuel gauge displays the level of fuel in the tank."
				, "250$", "Yes","Interior");
//		Interior.add(InteriorPart1);
//		Interior.add(InteriorPart2);
		
		Product ExteriorPart1 = new Product("Body Shell", "The outer shell of an automobile body, excluding doors, window glass, interior fittings, and all mechanical components."
				, "150$", "Yes","Exterior");
		Product ExteriorPart2 = new Product("Front Bumper", "A bar attached transversely in front of or behind a car body to prevent contact between an obstruction and the car body or to cushion the shock of collision between vehicles"
				, "200$", "No","Exterior");
//		Exterior.add(ExteriorPart1);
//		Exterior.add(ExteriorPart2);
		
		Product ElectronicPart1 = new Product("Anti-lock Braking System", "Help you steer in emergencies by restoring traction to your tires", "50$", "No","Electronic");
		Product ElectronicPart2 = new Product("Tire pressure monitoring system", "consists of small electric sensors fitted to each wheel of the vehicle to monitor tyre pressure and feed this data back to the car"
				, "450$", "Yes","Electronic");
//		Electronics.add(ElectronicPart1);
//		Electronics.add(ElectronicPart2);
		
		Products.add(InteriorPart1);
		Products.add(InteriorPart2);
		Products.add(ExteriorPart1);
		Products.add(ExteriorPart2);
		Products.add(ElectronicPart1);
		Products.add(ElectronicPart2);
		
		Category cat1 = new Category("Interior");
		Category cat2 = new Category("Exterior");
		Category cat3 = new Category("Electronic");
		
		Categories.add(cat1);
		Categories.add(cat2);
		Categories.add(cat3);
		
		Order ord1 = new Order("Customer123", "Customer1@gmail.com", "Body Shell", "150$", "Confirmed");
		Order ord2 = new Order("Customer123", "Customer1@gmail.com", "Anti-lock Braking System", "450$", "Not Confirmed");
		Orders.add(ord1);
		Orders.add(ord2);
		
	}
}