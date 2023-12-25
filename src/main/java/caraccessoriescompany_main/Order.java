package caraccessoriescompany_main;

public class Order {
	
	private String username;
	private String customerEmail;
	private String productName;
	private String price;
	private String status;
	
	public Order(String username, String customerEmail, String productName, String price, String status) {
		this.username = username;
		this.customerEmail = customerEmail;
		this.productName = productName;
		this.price = price;
		this.status = status;
	}
	
	public String GetUsername() {
		return username;
	}
	
	public String GetCustomerEmail() {
		return customerEmail;
	}
	public String GetProductName() {
		return  productName;
	}
	public String GetPrice() {
		return price;
	}
	
	public String GetStatus() {
		return status;
	}
	
	public void setStatus(String status ) {
		this.status = status;
	}
	
}
