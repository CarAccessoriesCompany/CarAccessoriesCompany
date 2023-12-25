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
	
	public String getUsername() {
		return username;
	}
	
	public String getCustomerEmail() {
		return customerEmail;
	}
	public String getProductName() {
		return  productName;
	}
	public String getPrice() {
		return price;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status ) {
		this.status = status;
	}
	
}
