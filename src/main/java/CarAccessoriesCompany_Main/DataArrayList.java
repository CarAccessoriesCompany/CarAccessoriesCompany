package CarAccessoriesCompany_Main;

import java.util.ArrayList;

public class DataArrayList {
	
	public static ArrayList<User> Admin = new ArrayList<User>();
	public static ArrayList<Customers> Customer = new ArrayList<Customers>();
	public static ArrayList<User> Installer = new ArrayList<User>();
	
	public static ArrayList<Product> Interior = new ArrayList<Product>();
	public static ArrayList<Product> Exterior = new ArrayList<Product>();
	public static ArrayList<Product> Electronics = new ArrayList<Product>();
	
	public static String[] Category = {"Interior", "Exterior", "Electronics"};
	
	public DataArrayList() {
		User firstAdmin = new User("Ahmaddweikat@gmail.com","Ahmad123");
		User secondAdmin = new User("Hameedo@gmail.com","Hameedo123");
		Admin.add(firstAdmin);
		Admin.add(secondAdmin);
		
		Customers firstCustomer = new Customers("Customer1@gmail.com","Customer123", "Customer1","056-1234567");
		Customers secondCustomer = new Customers("Customer2@gmail.com","Customer456", "Customer2","056-345678");
		Customer.add(firstCustomer);
		Customer.add(secondCustomer);
		
		User firstInstaller = new User("Installer1@gmail.com","Installer123");
		User secondInstaller = new User("Installer2@gmail.com","Installer456");
		Installer.add(firstInstaller);
		Installer.add(secondInstaller);
		
		Product  InteriorPart1 = new Product("Interior", "Steering Wheel", "The wheel which the driver holds when he or she is driving", "100$", "Yes");
		Product  InteriorPart2 = new Product("Interior","Speedometer and Fuel Gauge", "The speedometer displays wheel speed. Meanwhile, the fuel gauge displays the level of fuel in the tank."
				, "250$", "Yes");
		Interior.add(InteriorPart1);
		Interior.add(InteriorPart2);
		
		Product ExteriorPart1 = new Product("Exterior","Body Shell", "The outer shell of an automobile body, excluding doors, window glass, interior fittings, and all mechanical components."
				, "150$", "Yes");
		Product ExteriorPart2 = new Product("Exterior","Front Bumper", "A bar attached transversely in front of or behind a car body to prevent contact between an obstruction and the car body or to cushion the shock of collision between vehicles"
				, "200$", "No");
		Exterior.add(ExteriorPart1);
		Exterior.add(ExteriorPart2);
		
		Product ElectronicPart1 = new Product("Electronic","Anti-lock Braking System", "Help you steer in emergencies by restoring traction to your tires", "50$", "No");
		Product ElectronicPart2 = new Product("Electronic","Tire pressure monitoring system", "consists of small electric sensors fitted to each wheel of the vehicle to monitor tyre pressure and feed this data back to the car"
				, "450$", "Yes");
		Electronics.add(ElectronicPart1);
		Electronics.add(ElectronicPart2);
				
	}
}
