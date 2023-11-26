package CarAccessoriesCompany_Main;

import java.util.ArrayList;

public class Customer {
	
	public  String Email;
    public  String Password;
    public String Username;
    public String PhoneNumber;
    public static ArrayList<String> Orders = new ArrayList<String>();
    public static ArrayList<String> Request = new ArrayList<String>();
//    public String Address;
    
	public Customer(String Email, String Password, String Username, String PhoneNumber) {
		// TODO Auto-generated constructor stub
		this.Email = Email;
		this.Password = Password;
		this.Username = Username;
		this.PhoneNumber = PhoneNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String Username) {
		this.Username = Username;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	public ArrayList<String> getOrders() {
		return Orders;
	}
	public ArrayList<String> getRequest() {
		return Request;
	}
//	public String getAddress() {
//		return PhoneNumber;
//	}
//	public void setAddress(String Address) {
//		this.Address = Address;
//	}
}

