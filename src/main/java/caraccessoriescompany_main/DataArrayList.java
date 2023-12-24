package caraccessoriescompany_main;

import java.util.ArrayList;

public class DataArrayList {
	protected  static final ArrayList<User> admin = new ArrayList<>();
	public static final ArrayList<Customer> customers = new ArrayList<>();
	public static final  ArrayList<Installer> installers = new ArrayList<>();
	public static final ArrayList<Product> products = new ArrayList<>();
	public static final ArrayList<Category> categories = new ArrayList<>();
	public static final ArrayList<Order> orders = new ArrayList<>();
	public static final ArrayList<Appointment> appointments = new ArrayList<>();
	
	public DataArrayList() {
		User firstadmin = new User("Ahmaddweikat@gmail.com","Ahmad123");
		User secondadmin = new User("Hameedo@gmail.com","Hameedo123");
		admin.add(firstadmin);
		admin.add(secondadmin);
		Customer firstCustomer = new Customer("Customer1@gmail.com","Customer123", "Customer1","056-1234567");
		Customer secondCustomer = new Customer("Customer2@gmail.com","Customer456", "Customer2","056-345678");
		customers.add(firstCustomer);
		customers.add(secondCustomer);
		Installer firstInstaller = new Installer("Installer1@gmail.com","Installer123", "Installer1", "Available");
		Installer secondInstaller = new Installer("Installer2@gmail.com","Installer456", "Installer2", "Busy");
		installers.add(firstInstaller);
		installers.add(secondInstaller);
		Product  InteriorPart1 = new Product("Steering Wheel", "The wheel which the driver holds when he or she is driving", "100$", "Yes","Interior");
		Product  InteriorPart2 = new Product("Speedometer and Fuel Gauge", "The speedometer displays wheel speed. Meanwhile, the fuel gauge displays the level of fuel in the tank."
				, "250$", "Yes","Interior");
		Product ExteriorPart1 = new Product("Body Shell", "The outer shell of an automobile body, excluding doors, window glass, interior fittings, and all mechanical components."
				, "150$", "Yes","Exterior");
		Product ExteriorPart2 = new Product("Front Bumper", "A bar attached transversely in front of or behind a car body to prevent contact between an obstruction and the car body or to cushion the shock of collision between vehicles"
				, "200$", "No","Exterior");
		Product ElectronicPart1 = new Product("Anti-lock Braking System", "Help you steer in emergencies by restoring traction to your tires", "50$", "No","Electronic");
		Product ElectronicPart2 = new Product("Tire pressure monitoring system", "consists of small electric sensors fitted to each wheel of the vehicle to monitor tyre pressure and feed this data back to the car"
				, "450$", "Yes","Electronic");
		products.add(InteriorPart1);
		products.add(InteriorPart2);
		products.add(ExteriorPart1);
		products.add(ExteriorPart2);
		products.add(ElectronicPart1);
		products.add(ElectronicPart2);
		Category cat1 = new Category("Interior");
		Category cat2 = new Category("Exterior");
		Category cat3 = new Category("Electronic");
		categories.add(cat1);
		categories.add(cat2);
		categories.add(cat3);
		Order ord1 = new Order("Customer123", "Customer1@gmail.com", "Body Shell", "150$", "Confirmed");
		Order ord2 = new Order("Customer123", "Customer1@gmail.com", "Anti-lock Braking System", "450$", "Not Confirmed");
		orders.add(ord1);
		orders.add(ord2);
		Appointment ap1=new Appointment("October 20, 2023, 10:00 AM","Installer1","Customer1","Steering Wheel");
		Appointment ap2=new Appointment("October 20, 2023, 10:00 PM","Installer2","Customer2","Body Shell");
		appointments.add(ap1);
		appointments.add(ap2);
	}
}