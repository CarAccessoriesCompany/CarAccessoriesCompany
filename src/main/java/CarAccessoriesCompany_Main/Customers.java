package CarAccessoriesCompany_Main;

import java.util.ArrayList;

public class Customers {
	public  String Email;
    public  String Password;
    public String Username;
    public String PhoneNumber;
    public static ArrayList<Customers> Orders = new ArrayList<Customers>();
    public static ArrayList<Customers> Request = new ArrayList<Customers>();
//    public String Address;
    
	public Customers(String Email, String Password, String Username, String PhoneNumber) {
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
	public ArrayList<Customers> getOrders() {
		return Orders;
	}
	public ArrayList<Customers> getRequest() {
		return Request;
	}
//	public String getAddress() {
//		return PhoneNumber;
//	}
//	public void setAddress(String Address) {
//		this.Address = Address;
//	}
}

