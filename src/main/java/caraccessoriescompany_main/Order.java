package caraccessoriescompany_main;

public class Order {
	
	public String Username;
	public String CustomerEmail;
	public String ProductName;
	public String Price;
	public String Status;
	//h
	public Order(String Username, String CustomerEmail, String ProductName, String Price, String Status) {
		this.Username = Username;
		this.CustomerEmail = CustomerEmail;
		this.ProductName = ProductName;
		this.Price = Price;
		this.Status = Status;
	}
	
	public String GetUsername() {
		return Username;
	}
	
	public String GetCustomerEmail() {
		return CustomerEmail;
	}
	public String GetProductName() {
		return  ProductName;
	}
	public String GetPrice() {
		return Price;
	}
	
	public String GetStatus() {
		return Status;
	}
	
	public void setStatus(String Status ) {
		this.Status = Status;
	}
	
}
