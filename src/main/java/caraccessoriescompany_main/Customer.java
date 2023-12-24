package caraccessoriescompany_main;
//h
import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private String email;
	private String password;
	private String username;
	private String phoneNumber;
    protected List<String> orders = new ArrayList<>();
    protected List<String> request = new ArrayList<>();
    protected List<String> inbox = new ArrayList<>();
    
	public Customer(String email, String password, String username, String phoneNumber) {
		this.email = email;
		this.password = password;
		this.username = username;
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<String> getOrders() {
		return orders;
	}
	public List<String> getRequest() {
		return request;
	}
	public List<String> getInbox() {
		return inbox;
	}
}

