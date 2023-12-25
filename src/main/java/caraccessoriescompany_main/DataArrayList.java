package caraccessoriescompany_main;

import java.util.ArrayList;
import java.util.List;

public class DataArrayList {
	public static final List<User> admin = new ArrayList<>();
	private List<Customer> customers = new ArrayList<>();
	public static final  List<Installer> installers = new ArrayList<>();
	private List<Product> products = new ArrayList<>();
	private List<Category> categories = new ArrayList<>();
	private List<Order> orders = new ArrayList<>();
	private List<Appointment> appointments = new ArrayList<>();
	
	private static final String defaultEmail = "Customer1@gmail.com";
	private static String ir = "Interior";
	private static String ex = "Exterior";
	private static String el = "Electronic";
	private static String bodyShell = "Body Shell";
	private static String firscustomer = "Customer1";
	private static String secscustomer = "Customer2";
	private static final String firstin = "Installer1";
	private static final String secstin = "Installer2";
	
	public DataArrayList() {
		User firstadmin = new User("Ahmaddweikat@gmail.com","Ahmad123");
		User secondadmin = new User("Hameedo@gmail.com","Hameedo123");
		admin.add(firstadmin);
		admin.add(secondadmin);
		Customer firstCustomer = new Customer(defaultEmail, "Customer123", firscustomer,"056-1234567");
		Customer secondCustomer = new Customer(defaultEmail,"Customer456", secscustomer,"056-345678");
		customers.add(firstCustomer);
		customers.add(secondCustomer);
		Installer firstInstaller = new Installer("Installer1@gmail.com","Installer123", firstin, "Available");
		Installer secondInstaller = new Installer("Installer2@gmail.com","Installer456", secstin, "Busy");
		installers.add(firstInstaller);
		installers.add(secondInstaller);
		Product  interiorPart1 = new Product("Steering Wheel", "The wheel which the driver holds when he or she is driving", "100$", "Yes",ir);
		Product  interiorPart2 = new Product("Speedometer and Fuel Gauge", "The speedometer displays wheel speed. Meanwhile, the fuel gauge displays the level of fuel in the tank."
				, "250$", "Yes",ir);
		Product exteriorPart1 = new Product(bodyShell, "The outer shell of an automobile body, excluding doors, window glass, interior fittings, and all mechanical components."
				, "150$", "Yes",ex);
		Product exteriorPart2 = new Product("Front Bumper", "A bar attached transversely in front of or behind a car body to prevent contact between an obstruction and the car body or to cushion the shock of collision between vehicles"
				, "200$", "No",ex);
		Product electronicPart1 = new Product("Anti-lock Braking System", "Help you steer in emergencies by restoring traction to your tires", "50$", "No",el);
		Product electronicPart2 = new Product("Tire pressure monitoring system", "consists of small electric sensors fitted to each wheel of the vehicle to monitor tyre pressure and feed this data back to the car"
				, "450$", "Yes",el);
		products.add(interiorPart1);
		products.add(interiorPart2);
		products.add(exteriorPart1);
		products.add(exteriorPart2);
		products.add(electronicPart1);
		products.add(electronicPart2);
		Category cat1 = new Category(ir);
		Category cat2 = new Category(ex);
		Category cat3 = new Category(el);
		categories.add(cat1);
		categories.add(cat2);
		categories.add(cat3);
		Order ord1 = new Order(firscustomer, defaultEmail, bodyShell, "150$", "Confirmed");
		Order ord2 = new Order(firscustomer, defaultEmail, "Anti-lock Braking System", "450$", "Not Confirmed");
		orders.add(ord1);
		orders.add(ord2);
		Appointment ap1=new Appointment("October 20, 2023, 10:00 AM",firstin,firscustomer,"Steering Wheel");
		Appointment ap2=new Appointment("October 20, 2023, 10:00 PM",secstin,secscustomer, bodyShell);
		appointments.add(ap1);
		appointments.add(ap2);
	}
	public List<Customer> getCustomers(){
		return customers;
		
	}
	 public void setCustomers(List<Customer> newCustomers) {
	        this.customers = new ArrayList<>(newCustomers);
	    }
	 
	 public List<Product> getProducts(){
			return products;
			
		}
	 public void setProducts(List<Product> newProducts) {
		     this.products = new ArrayList<>(newProducts);
		 }
	 
	 public List<Category> getCategories(){
			return categories;
			
		}
	 public void setCategories(List<Category> newCategory) {
		     this.categories = new ArrayList<>(newCategory);
		 }
	 
	 public List<Order> getOrders(){
			return orders;
			
		}
	 public void setOrders(List<Order> newOrder) {
		     this.orders = new ArrayList<>(newOrder);
		 }
	 
	 
	 public List<Appointment> getAppointment(){
			return appointments;
			
		}
	 public void setAppointments(List<Appointment> newAppointment) {
		     this.appointments = new ArrayList<>(newAppointment);
		 }
	 
	 
	 
	 
	 

}