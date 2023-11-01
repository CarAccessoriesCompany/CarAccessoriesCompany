package CarAccessoriesCompany_Main;

import java.util.regex.Pattern;
import java.util.List;
import java.util.regex.Matcher;

public class MyCarApplication {
	
	public boolean isLogedin;
	public boolean invalidEmail;
	public boolean incorrectPassword;
	public boolean isEmpty;
	public boolean isSignedup;
	public boolean inMenu;
	public boolean validCommand;
	public boolean validCategory;
	public boolean validProduct; 
	public boolean isAdmin; 
	public boolean isCustomer; 
	public boolean isInstaller; 
	public boolean inProfile;
	public boolean isExist;
	public boolean isupdated;
	public boolean displayOrder;
	public boolean NoOrder;
	public boolean DisplayList;
	
	public boolean inDashboard;
	public boolean catIsExist;
	public boolean catIsAdded;
	public boolean catIsEdited;
	public boolean catIsDeleted;
	
	public boolean prodIsExist;
	public boolean prodIsAdded;
	public boolean prodIsValid;
	
	public boolean prodnameIsUpdated;
	public boolean proddescriptionIsUpdated;
	public boolean prodpriceIsUpdated;
	public boolean prodavlIsUpdated;
	public boolean prodcatIsUpdated;
	
	
	
	public boolean customerAccIsExist;
	public boolean displayCustomerInfo;
	public boolean customerNameUpdated;
	public boolean customerIsDeleted;
	public boolean ProductIsDeleted;
	
	DataArrayList list;
	
	public MyCarApplication() {
		isLogedin = false;
		invalidEmail = false;
		incorrectPassword = false;
		isEmpty = false;
		isSignedup = false;
		inMenu = true;
		validCommand = false;
		validCategory = false;
		validProduct = false;
		isAdmin = false;
		isCustomer = false;
		isInstaller = false;
		inProfile = false;
		isExist = false;
		isupdated = false;
		displayOrder = false;
		NoOrder = false;
		DisplayList = false;
		
		inDashboard=true;
		catIsExist=false;
		catIsAdded=false;
		catIsEdited=false;
		catIsDeleted=false;
		
		
		prodIsExist=false;
		prodIsAdded=false;
	    prodIsValid=true;
	    prodnameIsUpdated=false;
	    proddescriptionIsUpdated=false;
	    prodpriceIsUpdated=false;
	    prodavlIsUpdated=false;
	    prodcatIsUpdated=false;
	    
	    ProductIsDeleted = false;
	    
	    
	    
	    customerAccIsExist=false;
	    displayCustomerInfo=false;
	    customerNameUpdated=false;
	    customerIsDeleted=false;
	    
		list = new DataArrayList();
		
	}
	public boolean UserID(String Email) {
		InvalidEmailType(Email);
	    if (invalidEmail == false) {
			for(User n : DataArrayList.Admin) {
		        if(Email.equals(n.getEmail())) {
		           isAdmin = true;
		           break;
		        }
		       
		    }
			for(Customer n : DataArrayList.Customers) {
		        if(Email.equals(n.getEmail()) ) {
		           isCustomer = true;
		           break;
		        }
		        
		    }
			for(User n : DataArrayList.Installer) {
		        if(Email.equals(n.getEmail())) {
		           isInstaller = true;
		           break;
		        }
		        
		    }
		}
		
		
		return isAdmin || isCustomer || isInstaller;
		
	}

	// Admin sign-in functions
	public boolean Adminlogin(String Email, String Password) {
		InvalidEmailType(Email);
	    if (invalidEmail == false) {
		for(User n : DataArrayList.Admin) {
	        if(Email.equals(n.getEmail())) {
	        	if(n.getPassword().equals(Password)) {
	        	   isLogedin = true;
		           break;
	        }
	          
	        }
	    }
	    }
		return isLogedin;
	}
	
	public boolean AdminInvalidEmail(String Email) {
		InvalidEmailType(Email);
	    if (invalidEmail == false) {
	        for (User n : DataArrayList.Admin) {
	            if (Email.equals(n.getEmail())) {
	                isLogedin = true;
	                break;
	            }
	        }
	    }

	    return isLogedin;
	}
	
	public boolean AdminIncorrectPassword(String Email, String Password) {
		InvalidEmailType(Email);
	    if (invalidEmail == false) {
		for(User n : DataArrayList.Admin) {
	        if(Email.equals(n.getEmail()) && !Password.equals(n.getPassword())) {
	        	incorrectPassword = true;
	           break;
	        }
	    }
		
	}
	    isLogedin = !incorrectPassword;
		return isLogedin;
	}
	
	public boolean AdminEmptyPassword(String Email, String Password) {
		InvalidEmailType(Email);
	    if (invalidEmail == false) {
		for(User n : DataArrayList.Admin) {
	        if(Email.equals(n.getEmail()) && Password.isEmpty()) {
	           isEmpty = true;
	           break;
	        }
	    }
	    }
	    isLogedin = !isEmpty;
		return isLogedin;
	}
	
	// Customer sign-in functions
	public boolean Customerlogin(String Email, String Password) {
		InvalidEmailType(Email);
	    if (invalidEmail == false) {
		for(Customer n : DataArrayList.Customers) {
	        if(Email.equals(n.getEmail()) && n.getPassword().equals(Password)) {
	           isLogedin = true;
	           break;
	        }
	    }
	    }
		return isLogedin;
	}
	
	public boolean CustomerInvalidEmail(String Email) {
		
		InvalidEmailType(Email);
	    if (invalidEmail == false) {
	        for (Customer n : DataArrayList.Customers) {
	            if (Email.equals(n.getEmail())) {
	                isLogedin = true;
	                break;
	            }
	        }
	    }

	    return isLogedin;
	}
	
	public boolean CustomerIncorrectPassword(String Email, String Password) {
		InvalidEmailType(Email);
	    if (invalidEmail == false) {
		for(Customer n : DataArrayList.Customers) {
	        if(Email.equals(n.getEmail()) && !Password.equals(n.getPassword())) {
	           incorrectPassword = true;
	           break;
	        }
	    }
	    }
	    
	    isLogedin = !incorrectPassword;
		return isLogedin;
	}
	
	public boolean CustomerEmptyPassword(String Email, String Password) {
		InvalidEmailType(Email);
	    if (invalidEmail == false) {
		for(Customer n : DataArrayList.Customers) {
	        if(Email.equals(n.getEmail()) && Password.isEmpty()) {
	        	isEmpty = true;
	            break;
	        }
	    }
	    }
		
	    isLogedin = !isEmpty;
		return isLogedin;
	}
	
	// Installer sign-in function
	public boolean Installerlogin(String Email, String Password) {
		InvalidEmailType(Email);
	    if (invalidEmail == false) {
		for(User n : DataArrayList.Installer) {
	        if(Email.equals(n.getEmail()) && n.getPassword().equals(Password)) {
	           isLogedin = true;
	           break;
	        }
	    }
	    }
		return isLogedin;
	}
	
	public boolean InstallerInvalidEmail(String Email) {
		
		InvalidEmailType(Email);
	    if (invalidEmail == false) {
	        for (User n : DataArrayList.Installer) {
	            if (Email.equals(n.getEmail())) {
	                isLogedin = true;
	                break;
	            }
	        }
	    }

	    return isLogedin;
	}
	
	public boolean InstallerIncorrectPassword(String Email, String Password) {
		
		InvalidEmailType(Email);
	    if (invalidEmail == false) {
		for(User n : DataArrayList.Installer) {
	        if(Email.equals(n.getEmail()) && !Password.equals(n.getPassword())) {
	           incorrectPassword = true;
	           break;
	        }
	    }
	    }
	    isLogedin = !incorrectPassword;
		return isLogedin;
	}
	
	public boolean InstallerEmptyPassword(String Email, String Password) {
		InvalidEmailType(Email);
	    if (invalidEmail == false) {
		for(User n : DataArrayList.Installer) {
	        if(Email.equals(n.getEmail()) && Password.isEmpty()) {
	        	isEmpty = true;
	            break;
	        }
	    }
	    }
		
	    isLogedin = !isEmpty;
		return isLogedin;
	}
	
	// User Sign-up functions
	public boolean UserSignUp(String Email, String Password, String Username, String PhoneNumber) {
		isSignedup = true;
		
		InvalidEmailType(Email);
	    if (invalidEmail == true) {
	        isSignedup = false;
	        return isSignedup;
	    }
	    for (Customer n : DataArrayList.Customers) {
	        if (Email.equals(n.getEmail()) || Username.equals(n.getUsername()) || PhoneNumber.equals(n.getPhoneNumber())) {
	            isSignedup = false;
	            return isSignedup;
	        }
	    }
	    
	    Customer newUser = new Customer(Email, Password, Username, PhoneNumber);
	    DataArrayList.Customers.add(newUser);

	    return isSignedup;
	}
	
	public boolean ExistEmail(String Email) {
		
		isSignedup = true;
		InvalidEmailType(Email);
	    if (invalidEmail == false) {
		for(Customer n : DataArrayList.Customers) {
	        if(Email.equals(n.getEmail())) {
	           isSignedup = false;
	           break;
	        }
	        
	    }
		for(User n : DataArrayList.Admin) {
	        if(Email.equals(n.getEmail())) {
	           isSignedup = false;
	           break;
	        }
	        
	    }
		for(User n : DataArrayList.Installer) {
	        if(Email.equals(n.getEmail())) {
	           isSignedup = false;
	           break;
	        }
	        
	    }
	    }
		return isSignedup;
	}
	
public boolean ExistUsername(String Username) {
		
		isSignedup = true;
		for(Customer n : DataArrayList.Customers) {
	        if(Username.equals(n.getUsername())) {
	           isSignedup = false;
	           break;
	        } 
	    }
	
		return isSignedup;
	}

public boolean ExistPhoneNumber(String PhoneNumber) {
	
	isSignedup = true;
	
	for(Customer n : DataArrayList.Customers) {
        if(PhoneNumber.equals(n.getPhoneNumber())) {
           isSignedup = false;
           break;
        } 
    }
	return isSignedup;
}
	public boolean SignupEmptyPassword(String Email, String Password) {
		
		isSignedup = true;
		InvalidEmailType(Email);
	    if (invalidEmail == false) {
		Customer newUser = new Customer(Email, Password, null, null);
		if(Password.isEmpty()) {
			isSignedup = false;
		}
	    }
		return isSignedup;
	}
	
	public boolean SignupWeakPassword(String Email, String Password) {
		isSignedup = true;
		invalidEmail = true;
		InvalidEmailType(Email);
	    if (invalidEmail == false) {
		User newUser = new User(Email, Password);
		 if (Password.length() < 8) {
			 isSignedup = false;
			 invalidEmail = false;
		 }
	    }
		    return isSignedup; 
	}
	
	public boolean InvalidEmailType(String Email) {
		invalidEmail = false;
	    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(Email);
	    	if(!matcher.matches()) {
	    		invalidEmail = true;
	    	}
	    	isSignedup = !invalidEmail;
	    	return invalidEmail;
	}
	
	// ProductCatalog functions
	public boolean Category(String Menu) {
		if(Menu.equals("Category")) {
			validCommand = true;
		}
		else if(Menu.equals("Search")) {
			validCommand = true;
		}
		return validCommand;
	}
	public boolean CategoryName(String Name) {
		if (Name.equals("Interior") || Name.equals("Exterior") || Name.equals("Electronics")) {
	        validCategory = true;
	    }
	    return validCategory;
	}
	public boolean ProductName(String CategoryName, String ProductName) {
	if(CategoryName.equals("Interior")) {
		for(Product n : DataArrayList.Products) {
	        if(ProductName.equals(n.getProductName())) {
	           validProduct = true;
	           break;
	        }
	    }
	}
		else if(CategoryName.equals("Exterior")) {
			for(Product n : DataArrayList.Products) {
		        if(ProductName.equals(n.getProductName())) {
		           validProduct = true;
		           break;
		        }
		    }
		}
		else if(CategoryName.equals("Electronics")) {
			for(Product n : DataArrayList.Products) {
		        if(ProductName.equals(n.getProductName())) {
		           validProduct = true;
		           break;
		        }
		    }
		}
	
	
	return validProduct;
	
}
	///// UserProfile
	public boolean UserProfile(String Command) {
		if(Command.equals("My Profile")) {
			inProfile = true;
		}
		
		return inProfile;
	}
	public boolean EditCommand() {
		validCommand = true;
		return validCommand;
	}
	
	
	public boolean editField(String Email, String FieldName, String Update) {
		
		boolean EmailExists = DataArrayList.Customers.stream()
	            .anyMatch(customer -> customer.getEmail().equals(Update));
		boolean UsernameExists = DataArrayList.Customers.stream()
		        .anyMatch(customer -> customer.getUsername().equals(Update));
		boolean PhoneNumber = DataArrayList.Customers.stream()
		        .anyMatch(customer -> customer.getPhoneNumber().equals(Update));
		

		if (!EmailExists) {
			for (Customer customer : DataArrayList.Customers) {
		        if (customer.getEmail().equals(Email)) {
		            if (FieldName.equals("Email")) {
		                if (!Update.equals(customer.getEmail())) {
		                    customer.setEmail(Update);
		                    isupdated = true;
		                }
		            } 
		        }
			}
			}
		
		 if (FieldName.equals("Password")) {
		        if (Update != null && !Update.isEmpty() && Update.length() >= 8) {
		            for (Customer customer : DataArrayList.Customers) {
		                if (customer.getEmail().equals(Email)) {
		                    customer.setPassword(Update);
		                    isupdated = true;
		                }
		            }
		        }
		    }
		
		if (!UsernameExists) {
			for (Customer customer : DataArrayList.Customers) {
		        if (customer.getEmail().equals(Email)) {
		            if (FieldName.equals("Username")) {
		                if (!Update.equals(customer.getUsername())) {
		                    customer.setUsername(Update);
		                    isupdated = true;
		                }
		            } 
		        }
			}
			}
		if (!PhoneNumber) {
			for (Customer customer : DataArrayList.Customers) {
		        if (customer.getEmail().equals(Email)) {
		            if (FieldName.equals("PhoneNumber")) {
		                if (!Update.equals(customer.getPhoneNumber())) {
		                    customer.setPhoneNumber(Update);
		                    isupdated = true;
		                }
		            } 
		        }
			}
			}
		
	    return isupdated;
		}
	
	public boolean DisplayCustomerOrders(String Email) {
		 Customer customer = findCustomerByEmail(Email);
		if (customer != null) {
	        // Assuming that the customer has a list of orders
	        List<Customer> customerOrders = customer.getOrders();
	        
	        if (customerOrders.isEmpty()) {
	        	DisplayList = false;
	        }
	        else {
	        	 for (Customer order : customerOrders) {
	        		 if(customerOrders.size() >= 1) {
	        			 DisplayList = true;
	        		 }
	        	 }
	        }
		
	}
		return DisplayList;
	}
	public boolean DisplayInstallationRequests(String Email) {
		 Customer customer = findCustomerByEmail(Email);
		if (customer != null) {
	        // Assuming that the customer has a list of orders
	        List<Customer> customerRequest = customer.getRequest();
	        
	        if (customerRequest.isEmpty()) {
	        	DisplayList = false;
	        }
	        else {
	        	 for (Customer order : customerRequest) {
	        		 if(customerRequest.size() >= 1) {
	        			 DisplayList = true;
	        		 }
	        	 }
	        }
		
	}
		return DisplayList;
	}
	
	public Customer findCustomerByEmail(String email) {
	    // Search for the customer by email in your data source (DataArrayList.Customer)
	    for (Customer customer : DataArrayList.Customers) {
	        if (customer.getEmail().equals(email)) {
	            return customer;
	        }
	    }
	    return null; // Customer not found
	}
	
	
	
	public boolean AddCategory(String cat) {
		 catIsExist=false;
		
	    java.util.Iterator<Category> iterator = DataArrayList.Categories.iterator();
       Category c=new Category(cat);

	    while (iterator.hasNext()) {
	        Category s = iterator.next();
	        if (c.getCatName().equals(s.getCatName())) {
	            catIsExist = true;
	            break;
	        }
	    }

	    if (!catIsExist) {
	        DataArrayList.Categories.add(c);
	    }

	    return catIsExist;
	}
	
	public boolean editCat(String oldname, String newName) {
	    for (Category s : DataArrayList.Categories) {
	        if (s.getCatName().equals(oldname)) {
	            s.setCatName(newName);
	            catIsEdited = true;
	            break; // Exit the loop after updating the category name
	        }
	        
	        
	    }
	    return catIsEdited;
	}
	
	public boolean deleteCat(String catName) {
		java.util.Iterator<Category> iterator = DataArrayList.Categories.iterator();
	    boolean catIsDeleted = false;

	    while (iterator.hasNext()) {
	        Category category = iterator.next();
	        if (category.getCatName().equals(catName)) {
	            iterator.remove(); // Removes the category from the list
	            catIsDeleted = true;
	            break; // Exit the loop after deleting the category
	        }
	    }

	    return catIsDeleted;
	}
	
	public boolean deleteProd(String ProdName) {
		java.util.Iterator<Product> iterator = DataArrayList.Products.iterator();
	    boolean ProductIsDeleted = false;

	    while (iterator.hasNext()) {
	    	Product product = iterator.next();
	        if (product.getProductName().equals(ProdName)) {
	            iterator.remove(); // Removes the category from the list
	            ProductIsDeleted = true;
	            break; // Exit the loop after deleting the category
	        }
	    }

	    return ProductIsDeleted;
	}
	
	
	public boolean addProduct(String name, String description, String price, String availability, String categoryName) {
		 prodIsExist=false;
			
		    java.util.Iterator<Product> iterator = DataArrayList.Products.iterator();
	        Product p=new Product(name,description,price,availability,categoryName);

	        
	       
		    while (iterator.hasNext()) {
		       Product s = iterator.next();
		        if (p.getProductName().equals(s.getProductName())) {
		           prodIsExist = true;
		            break;
		        }
		    }

		        if (!prodIsExist) {
		        DataArrayList.Products.add(p);
		    }
		    
	        

		    return prodIsExist;
	}
		
	public boolean isValidProductData(String name, String description, String price, String availability, String category) {
	       

        prodIsValid = !name.isEmpty() && !description.isEmpty() && !category.isEmpty();
      
           double parsedPrice = Double.parseDouble(price);
          if(parsedPrice <=0) {
       	   prodIsValid =false;
          }
           

         

      
       return prodIsValid;
   }
	
	public boolean updateProdName(String oName, String nName ) {	
		if(!nName.isEmpty()) {
			for(Product p:DataArrayList.Products) {
				if(p.getProductName().equals(oName)) {
					p.setProductName(nName);
					prodnameIsUpdated = true;
					break;
					
				}
			}
		}
		
		return prodnameIsUpdated;
	}
	
	public boolean updateProdPrice(String nprice, String name) {
		
		 double parsedPrice = Double.parseDouble(nprice);
        if(parsedPrice <=0) {
			for(Product p:DataArrayList.Products) {
				if(p.getProductName().equals(name)) {
					p.setPrice(nprice);
					prodpriceIsUpdated=true;
					
				}
			}
		}
		
		return prodpriceIsUpdated;
	}
	
	public boolean updateProdDescription(String nDescription, String name){
		
		 
		if(!nDescription.isEmpty()){
			for(Product p:DataArrayList.Products) {
				if(p.getProductName().equals(name)) {
					p.setDescription(nDescription);
					proddescriptionIsUpdated=true;
					break;
					
				}
			}
		}
		
		return proddescriptionIsUpdated;
	}
	
	public boolean updateProdAvailability(String avl, String name){
		
		if(!avl.isEmpty()){
			for(Product p:DataArrayList.Products) {
				if(p.getProductName().equals(name)) {
					p.setAvailability(avl);
					prodavlIsUpdated=true;
					
				}
			}
		}
		
		return prodavlIsUpdated;
	}
	
	
	public boolean isExistProduct(String pName) {
		for(Product p:DataArrayList.Products) {
			if(p.getProductName().equals(pName)) {
				prodIsExist = true;
				
			}
		}
		return prodIsExist;
	}
	
	
	
	
	
	
	
public boolean updateProdCategory(String cat, String name){
		
		for(Category c:DataArrayList.Categories) {
			if(c.getCatName().equals(cat)) {
				
				for(Product p:DataArrayList.Products) {
					if(p.getProductName().equals(name)) {
						p.setCategory(cat);
						prodcatIsUpdated=true;
						
					}
				}
			}
			
		}
		
		
		
		return prodcatIsUpdated;
	}
	
	public boolean selectCustomerAcc(String name) {
		for(Customer c:DataArrayList.Customers) {
			if(c.getUsername().equals(name)) {
				displayCustomerInfo=true;
			}
		}
		
		return displayCustomerInfo;
	}
	
	
	public boolean changeCustomerUsername(String oName,String nName) {
		for(Customer c:DataArrayList.Customers) {
			if(c.getUsername().equals(oName)) {
				c.setUsername(nName);
				customerNameUpdated=true;
			}
		}
		
		return customerNameUpdated;
	}
	
	public boolean deleteCustomerAcc(String name) {
		java.util.Iterator<Customer> iterator = DataArrayList.Customers.iterator();
		customerIsDeleted = false;

	    while (iterator.hasNext()) {
	        Customer c = iterator.next();
	        if (c.getUsername().equals(name)) {
	            iterator.remove(); // Removes the category from the list
	            customerIsDeleted = true;
	            break; // Exit the loop after deleting the category
	        }
	    }
	    
	    return customerIsDeleted;
	}


	public void PrintAdminMenu() {
		System.out.println("\tWelcome Admin");
		System.out.println("1.Admin Dashboard");
		System.out.println("2.My profile");
		System.out.println("0.Sign out");
		
	}
	public void PrintAdminDashoard() {
		System.out.println("1.Add Product");
		System.out.println("2.Edit Product");
		System.out.println("3.Delete Product");
		
		System.out.println("4.Add Category");
		System.out.println("5.Edit Category");
		System.out.println("6.Delete Category");
		System.out.println("0.Back to Menu");
	}
	
	public void PrintTheProducts() {
		for(Product p:DataArrayList.Products) {
			System.out.println("Product Name:" + p.getProductName());
			System.out.println("Product Discription:" + p.getDescription());
			System.out.println("Product Price:" + p.getPrice());
			System.out.println("Product Availability:" + p.getAvailability());
			System.out.println("Product Category:" + p.getCategory());
			System.out.println("/////////////////////////////////////////////////////");
			}
		
	}
	public void PrintEditChoices(){
		System.out.println("1.Product Name:" );
		System.out.println("2.Product Discription:");
		System.out.println("3.Product Price:" );
		System.out.println("4.Product Availability:");
		System.out.println("5.Product Category:");
	}
	
	public void PrintCat() {
		for(Category cat:DataArrayList.Categories) {
			System.out.println("Category Name:" + cat.getCatName());
			}
		
	}
	
}