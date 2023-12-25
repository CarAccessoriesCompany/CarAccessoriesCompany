package caraccessoriescompany_main;

public class Category {
	private String catName;
	
	public Category(String name) {
		this.catName = name;
		
	}
	
	public void setCatName(String name ) {
		this.catName = name;
	}
	public String getCatName() {
		return catName;
	}
	
}