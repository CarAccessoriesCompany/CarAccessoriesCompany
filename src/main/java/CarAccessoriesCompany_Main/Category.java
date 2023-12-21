package CarAccessoriesCompany_Main;

public class Category {
//h
	public String CatName;
	
	public Category(String name) {
		this.CatName=name;
		
	}
	
	public void setCatName(String Name ) {
		this.CatName = Name;
	}
	public String getCatName() {
		return CatName;
	}
	
}