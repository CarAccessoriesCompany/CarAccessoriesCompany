package CarAccessoriesCompany_Main;

import java.util.ArrayList;

public class DataArrayList {
	
	public static ArrayList<User> Admin = new ArrayList<User>();
	public static ArrayList<User> Customer = new ArrayList<User>();
	public static ArrayList<User> Installer = new ArrayList<User>();
	
	public DataArrayList() {
		User firstAdmin = new User("Ahmaddweikat@gmail.com","Ahmad123");
		User secondAdmin = new User("Hameedo@gmail.com","Hameedo123");
		Admin.add(firstAdmin);
		Admin.add(secondAdmin);
		
		User firstCustomer = new User("Customer1@gmail.com","Customer123");
		User secondCustomer = new User("Customer2@gmail.com","Customer456");
		Customer.add(firstCustomer);
		Customer.add(secondCustomer);
		
		User firstInstaller = new User("Installer1@gmail.com","Installer123");
		User secondInstaller = new User("Installer2@gmail.com","Installer456");
		Installer.add(firstInstaller);
		Installer.add(secondInstaller);
		
	}
}
