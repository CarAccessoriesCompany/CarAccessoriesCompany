package CarAccessoriesCompany_Main;

public class Product {
	
	public String ProductName;
	public String Description;
	public String Price;
	public String Availability;
	public String Category;
	public String Review;
	public int Rate;
	
	//h
	public Product(String ProductName, String Description, String Price, String Availability, String Category) {
		this.Category = Category;
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
	public String getDescription() {
		return Description;
	}
	public void setPrice(String Price) {
		this.Price = Price;
	}
	public String getPrice() {
		return Price;
	}
	public void setAvailability(String Availability) {
		this.Availability = Availability;
	}
	public String getAvailability() {
		return Availability;
	}
	public void setCategory(String Category ) {
		this.Category = Category;
	}
	public String getCategory() {
		return Category;
	}
	
	public void setReview(String Review) {
		this.Review = Review;
	}
	public String getReview() {
		return Review;
	}
	
	public int getRating() {
		return Rate;
	}
	public void setRating(int Rate) {
		this.Rate = Rate;
	}
	
}
