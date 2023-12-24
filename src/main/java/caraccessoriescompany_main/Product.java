package caraccessoriescompany_main;

public class Product {
	private String productName;
	private String description;
	private String price;
	private String availability;
	private String category;
	private String review;
	private int rate;
	
	public Product(String productName, String description, String price, String availability, String category) {
		this.category = category;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.availability = availability;
	}
	public void setProductName(String productName ) {
		this.productName = productName;
	}
	public String getProductName() {
		return productName;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPrice() {
		return price;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getAvailability() {
		return availability;
	}
	public void setCategory(String category ) {
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
	
	public void setReview(String review) {
		this.review = review;
	}
	public String getReview() {
		return review;
	}
	
	public int getRating() {
		return rate;
	}
	public void setRating(int rate) {
		this.rate = rate;
	}
	
}
