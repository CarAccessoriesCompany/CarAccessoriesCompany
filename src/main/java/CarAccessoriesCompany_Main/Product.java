package CarAccessoriesCompany_Main;

public class Product {
	
	public String ProductName;
	public String Description;
	public String Price;
	public boolean Availability;
	
	
	
	public Product(String ProductName, String Description, String Price, boolean Availability) {
		this.ProductName = ProductName;
		this.Description = Description;
		this.Price = Price;
		this.Availability = Availability;
	}
	
	public void setProductName(String ProductName ) {
		this.ProductName = ProductName;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setDescription(String Description) {
		this.Description = Description;
	}
	public String setDescription() {
		return Description;
	}
	public void setPrice(String Price) {
		this.Price = Price;
	}
	public String getPrice() {
		return Price;
	}
	public void setAvailability(boolean Availability) {
		this.Availability = Availability;
	}
	public boolean getAvailability() {
		return Availability;
	}
	
}
