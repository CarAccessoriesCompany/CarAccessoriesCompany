package CarAccessoriesCompany_Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import java.util.regex.Pattern;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;

public class MyCarApplication {
	//h
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
	
	
	public boolean isInproductPage;
	public boolean isReviewed;
	public boolean isRated;
	public boolean DisplayReview;
	public boolean DisplayRate;
					
	public boolean isInServicePage;
	public boolean ValidRequest;
	public boolean isAvailable;
	DataArrayList list;
	public boolean isConfirmed;
	
	
	
	public boolean appIsSechduled;
	public boolean viewAppointment;
	public boolean appReschduled;
	public boolean appCanceled;
	public boolean InstallerScheduleViewd;
	
	
	
	public boolean IsOrdered;
	public boolean sendEmail;
	public boolean InstallationReqReceived;
	
	
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
	    
	 	isInproductPage = true;
	 	isReviewed = false;
	 	isRated = false;
	 	DisplayReview = false;
	 	DisplayRate = false;
	    
	 	isInServicePage = true;
	 	ValidRequest = true;
	 	isAvailable = false;
	 	
	 	
	 	appIsSechduled=false;
	 	viewAppointment=false;
	 	appReschduled=false;
	 	appCanceled=false;
	 	InstallerScheduleViewd=false;
	 	
	 	
	 	
	 	IsOrdered=false;
	 	sendEmail=false;
	 	InstallationReqReceived=false;
	 	
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
			for(Installer n : DataArrayList.Installers) {
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
		for(Installer n : DataArrayList.Installers) {
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
	        for (Installer n : DataArrayList.Installers) {
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
		for(Installer n : DataArrayList.Installers) {
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
		for(Installer n : DataArrayList.Installers) {
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
		for(Installer n : DataArrayList.Installers) {
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
	public void addProductToCustomerArray(String email, String prodName) {
	    for (Customer customer : DataArrayList.Customers) {
	        if (email.equals(customer.getEmail())) {
	            for (Product product : DataArrayList.Products) {
	                if (prodName.equals(product.getProductName())) {
	                    // Assuming that the customer has a list to store orders
	                    List<String> customerOrders = customer.getOrders();

	                    // Add product information to the customer's orders
	                    customerOrders.add("Product name: " + prodName);
	                    customerOrders.add("Price: " + String.valueOf(product.getPrice())); // Assuming getPrice returns a numeric value
	                    customerOrders.add("Category: " + product.getCategory());

	                    
	                }
	            }
	        }
	    }
	}

	
	public void displayCustomerOrders(String email) {
	    Customer customer = findCustomerByEmail(email);

	    if (customer != null) {
	        List<String> customerOrders = customer.getOrders();

	        if (!customerOrders.isEmpty()) {
	           
	            int orderNumber = 1;

	            for (int i = 0; i < customerOrders.size(); i += 3) {
	                System.out.println(orderNumber + ". " +
	                        customerOrders.get(i) + " " +
	                        customerOrders.get(i + 1) + " " +
	                        customerOrders.get(i + 2));
	                orderNumber++;
	            }
	            System.out.print("\n");
	        } else {
	            System.out.println("No orders");
	        }
	    } else {
	        System.out.println("Customer not found with email: ");
	    }
	}

	public boolean displayInstallationRequests(String email) {
	    Customer customer = findCustomerByEmail(email);

	    boolean displayList = false; // Initialize the variable outside the conditions

	    if (customer != null) {
	        // Assuming that the customer has a list of requests
	        List<String> customerRequests = customer.getRequest();

	        if (!customerRequests.isEmpty()) {
	            int requestNumber = 1;
	            // Iterate through the list of requests and print them
	            for (int i = 0; i < customerRequests.size(); i += 4) {
	                System.out.println(requestNumber + ". " +
	                		customerRequests.get(i) + " " +
	                		customerRequests.get(i + 1) + " " +
	                		customerRequests.get(i + 2) + " " +
	                		customerRequests.get(i + 3));
	                requestNumber++;
	            }
	            System.out.print("\n");
	            displayList = true; // Set the flag to true since the list is not empty
	        }
	    }

	    return displayList;
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
	        Product p = new Product(name,description,price,availability,categoryName);
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
	
		
		
	public boolean Review(String ProdName,String Review) {
		for(Product n : DataArrayList.Products) {
	        if(ProdName.equals(n.getProductName())) {
	        	if(!Review.isEmpty()) {
	        		n.setReview(Review);
		        	isReviewed = true;
		        	break;
	        	}
	        }
	        }
		return isReviewed;
	}
	
	public boolean Rated(String ProdName,int Rate) {
		for(Product n : DataArrayList.Products) {
	        if(ProdName.equals(n.getProductName())) {
	        	if(Rate <= 5 && Rate >= 0) {
	        		n.setRating(Rate);
	        		isRated = true;
		        	break;
	        	}
	        }
	        }
		return isRated;
	}
	
	
	
	public boolean DispalyReview(String ProdName) {
		for(Product n : DataArrayList.Products) {
	        if(ProdName.equals(n.getProductName())) {
	        		DisplayReview = true;
	        	}
	        }
	        return DisplayReview;
	}
	public boolean DispalyRate(String ProdName) {
		for(Product n : DataArrayList.Products) {
	        if(ProdName.equals(n.getProductName())) {
	        	if(n.getRating() >= 0 && n.getRating() <= 5){
	        		DisplayRate = true;
	        	}
	        	}
	        }
	        return DisplayRate;
	}
	public boolean Request(String Username, String Email, String Car_Model, String Descriptions , String Date) {
		for(Customer u : DataArrayList.Customers) {
	        	if(Email.equals(u.getEmail()) && Username.equals(u.getUsername())) {
	        		for(String c : Customer.Request) {
	                	if(!Car_Model.isEmpty() && !Descriptions.isEmpty() && !Date.isEmpty()) {
	                		Customer.Request.add(Car_Model);
	                		Customer.Request.add(Descriptions);
	                		Customer.Request.add(Date);
	                		
	                	}
	                	
	            	}
	        		ValidRequest = true;
	        		break;
	        	}
	        	
        	}
	
		return ValidRequest;
	}
	
	public boolean InstAvalibilty(String Username) {
		for(Installer in: DataArrayList.Installers) {
			if(Username.equals(in.getUsername())) {
				if(in.getInstallerAvalibilty().equals("Available")) {
					isAvailable = true;
				}
			}
		}
		return isAvailable;
	}

	public void PrintAdminMenu() {
		System.out.println("\tWelcome Admin");
		System.out.println("1.Admin Dashboard");
		System.out.println("0.Sign out");
		
	}
	public void PrintAdminDashoard() {
		System.out.println("1.Add Product");
		System.out.println("2.Edit Product");
		System.out.println("3.Delete Product");
		
		System.out.println("4.Add Category");
		System.out.println("5.Edit Category");
		System.out.println("6.Delete Category");
		
		System.out.println("7.Change Username");
		System.out.println("8.Delete User");
		
		System.out.println("0.Back to Menu");
	}
	public void PrintCustomerMenu() {
		System.out.println("1.Browse products");
		System.out.println("2.My Profile");
		System.out.println("0.Sign out");
	}
	public void PrintInstallerMenu() {
		System.out.println("1.My Installation Requests and Schedule Appointments");
		System.out.println("0.Sign out");
	}
	
	public void PrintTheProducts(int Cat) {
		if(Cat == 1) {
			for(Product p:DataArrayList.Products) {
				System.out.println("Product Name:" + p.getProductName());
				System.out.println("Product Discription:" + p.getDescription());
				System.out.println("Product Price:" + p.getPrice());
				System.out.println("Product Availability:" + p.getAvailability());
				System.out.println("Product Category:" + p.getCategory());
				System.out.println("/////////////////////////////////////////////////////");
				}
		}
		else if(Cat == 2) {
			for(Product p:DataArrayList.Products) {
				if (p.getCategory().equals("Interior")) {
				System.out.println("Product Name:" + p.getProductName());
				System.out.println("Product Discription:" + p.getDescription());
				System.out.println("Product Price:" + p.getPrice());
				System.out.println("Product Availability:" + p.getAvailability());
				System.out.println("Product Category:" + p.getCategory());
				System.out.println("/////////////////////////////////////////////////////");
				}
			}
		}
		else if(Cat == 3) {
			for(Product p:DataArrayList.Products) {
				if (p.getCategory().equals("Exterior")) {
				System.out.println("Product Name:" + p.getProductName());
				System.out.println("Product Discription:" + p.getDescription());
				System.out.println("Product Price:" + p.getPrice());
				System.out.println("Product Availability:" + p.getAvailability());
				System.out.println("Product Category:" + p.getCategory());
				System.out.println("/////////////////////////////////////////////////////");
				}
			}
		}
		else if(Cat == 4) {
			for(Product p:DataArrayList.Products) {
				if (p.getCategory().equals("Electronic")) {
				System.out.println("Product Name:" + p.getProductName());
				System.out.println("Product Discription:" + p.getDescription());
				System.out.println("Product Price:" + p.getPrice());
				System.out.println("Product Availability:" + p.getAvailability());
				System.out.println("Product Category:" + p.getCategory());
				System.out.println("/////////////////////////////////////////////////////");
				}
			}
		}
		
		
	}
	public void PrintEditChoices(){
		System.out.println("1.Product Name" );
		System.out.println("2.Product Discription");
		System.out.println("3.Product Price");
		System.out.println("4.Product Availability");
		System.out.println("5.Product Category");
		System.out.println("0.Back");
	}
	
	public void PrintCat() {
		System.out.println("Categories:");
		int index = 1;
		for(Category cat:DataArrayList.Categories) {
			System.out.println(index +"." + cat.getCatName());
			index++;
			}
		
	}
	public void PrintUsers() {
		System.out.println("Customers:");
		int i = 1;
		for(Customer n : DataArrayList.Customers) {
	       System.out.println(i + "." + n.getUsername());
	       System.out.println("/////////////////////////////////////////////////////");
	       i++;
	        }
		for(Installer J : DataArrayList.Installers) {
		       System.out.println(i + "." + J.getUsername());
		       System.out.println("/////////////////////////////////////////////////////");
		       i++;
		        }
	    }
	
	
	
	
	
	public boolean appointmentSchedule(String date,String insName,String cusName,String proName) {
		Appointment ap1=new Appointment();
		ap1.setDate(date);
		ap1.setInsName(insName);
		ap1.setCusName(cusName);
		ap1.setProName(proName);
		
		DataArrayList.Appointments.add(ap1);
		appIsSechduled=true;
		return appIsSechduled;
	}
	
	
	public boolean appointmentView(String date) {
		for(Appointment ap:DataArrayList.Appointments) {
			if(ap.getDate().equals(date));
			viewAppointment=true;

		}
		return viewAppointment;
	}
	
	
	public boolean appReschdule(String oDate, String insName, String cusName, String nDate) {
		for(Appointment ap:DataArrayList.Appointments) {
			if(ap.getCusName().equals(cusName) && ap.getDate().equals(oDate) && ap.getInsName().equals(insName)) {
			ap.setDate(nDate);
			
			appReschduled=true;
			}

		}
		return appReschduled;
	}
	
	
	public boolean appCancel(String cusName, String Date, String insName) {
		for(Appointment ap:DataArrayList.Appointments) {
			if(ap.getCusName().equals(cusName) && ap.getDate().equals(Date) && ap.getInsName().equals(insName)) {
				DataArrayList.Appointments.remove(ap);
				appCanceled=true;
				
			}
		}
		return appCanceled;
	}
	
	
	public boolean ViewInstallerSchedule(String insName) {

	    boolean InstallerScheduleViewed = false;

	    for (Installer in : DataArrayList.Installers) {
	        List<String> InstallerRequest = in.getschedule();
	        if (!insName.equals(in.getUsername())) {
	            // System.out.println("No installer with this name! Re-enter new order with valid Installer");
	        } else {
	            int index = 1;

	            // Custom comparator for sorting by date
	            Comparator<String> dateComparator = new Comparator<String>() {
	                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	                @Override
	                public int compare(String str1, String str2) {
	                    if (isDate(str1) && isDate(str2)) {
	                        try {
	                            Date date1 = dateFormat.parse(str1);
	                            Date date2 = dateFormat.parse(str2);
	                            return date1.compareTo(date2);
	                        } catch (ParseException e) {
	                            e.printStackTrace(); // Handle the exception according to your needs
	                        }
	                    }
	                    // If not both are dates, compare as strings
	                    return str1.compareTo(str2);
	                }

	                private boolean isDate(String str) {
	                    try {
	                        dateFormat.parse(str);
	                        return true;
	                    } catch (ParseException e) {
	                        return false;
	                    }
	                }
	            };

	            // Sort the schedule by date or as strings
	            Collections.sort(InstallerRequest, dateComparator);

	            for (int i = 0; i < InstallerRequest.size(); i += 3) {
	                System.out.println(index + ". " +
	                        InstallerRequest.get(i) + " " +
	                        InstallerRequest.get(i + 1) + " " +
	                        InstallerRequest.get(i + 2));
	                index++;
	            }
	            System.out.println();

	            InstallerScheduleViewed = true;
	        }
	    }

	    return InstallerScheduleViewed;
	}

	
	

	
	public boolean orderIsPlacedBy(String email, String prodname, String status) {
	    boolean sendEmail = false;

	    for (Customer customer : DataArrayList.Customers) {
	        if (email.equals(customer.getEmail())) {
	            for (Product product : DataArrayList.Products) {
	                if (prodname.equals(product.getProductName())) {
	                    List<String> customerRequest = customer.getRequest();
	                    List<String> Inbox = customer.getInbox();
	                    

	                    if ("Confirm".equals(status)) { // Use equals() for string comparison
	                        Inbox.add("Product Name: " + product.getProductName());
	                        Inbox.add("Price: " + product.getPrice());
	                        Inbox.add("Category: " + product.getCategory());
	                        sendEmail = true; // Set sendEmail to true if the status is "Confirm"
	                        
	                    }
	                    
	                    
	                    break; // Exit the product loop once a match is found
	                }
	            }
	        }
	    }

	    return sendEmail;
	}
	
	public boolean getorderIsPlacedBy(String email) {
	    for (Customer customer : DataArrayList.Customers) {
	        List<String> Inbox = customer.getInbox();
	        if (email.equals(customer.getEmail())) {
	            int index = 1;
	            for (int i = 0; i < Inbox.size(); i += 3) {
	                System.out.println(index + ". " +
	                        Inbox.get(i) + " " +
	                        Inbox.get(i + 1) + " " +
	                        Inbox.get(i + 2));
	                index++;
	            }
	            System.out.println();
	            return true; // Return true if the email is found
	        }
	    }
	    return false; // Return false if the email is not found
	}

	
	
	public boolean getAnInsallationReqFot(String name) {
		for(Installer n:DataArrayList.Installers) {
			if(n.getUsername().equals(name) && n.getInstallerAvalibilty().equals("Available")) {
				InstallationReqReceived=true;
			}
		}
		return InstallationReqReceived;
	}
	
	public boolean isProductNameExist(String ProdName) {
		for(Product p : DataArrayList.Products) {
	        if(ProdName.equals(p.getProductName())) {
	        	prodIsExist = true;
	           break;
	        } 
	    }
		return prodIsExist;
	}	
	public boolean isCategoryNameExist(String CatName) {
		for (Category s : DataArrayList.Categories) {
	        if (s.getCatName().equals(CatName)) {
	        	catIsExist = true;
	            break; 
	        } 
	    }
		return catIsExist;
	}	
	public void changeUsernameforCust(String email, String nname) {
		for(Customer c : DataArrayList.Customers) {
			System.out.println("Before " + c.getUsername());
	        if(email.equals(c.getEmail())) {
	        	c.setUsername(nname);
	        	System.out.println(c.getUsername());
	           break;
	        } 
	        
	    }
	}
	public void changePasswordforCust(String email, String nPass) {
		for(Customer c : DataArrayList.Customers) {
			System.out.println("Before " + c.getPassword());
	        if(email.equals(c.getEmail())) {
	        	c.setPassword(nPass);
	        	System.out.println(c.getPassword());
	           break;
	        } 
	        
	    }
	}
	public void changePhoneforCust(String email, String nPhone) {
		for(Customer c : DataArrayList.Customers) {
			System.out.println("Before " + c.getPhoneNumber());
	        if(email.equals(c.getEmail())) {
	        	c.setPhoneNumber(nPhone);
	        	System.out.println(c.getPhoneNumber());
	           break;
	        } 
	        
	    }
	}
	
	public void addReq(String email, String prodname, String carModel, String installer, String date) {
	    for (Customer customer : DataArrayList.Customers) {
	        if (email.equals(customer.getEmail())) {
	            for (Product product : DataArrayList.Products) {
	                if (prodname.equals(product.getProductName())) {
	                    // Assuming that the customer has a list to store orders
	                    List<String> customerRequest = customer.getRequest();

	                    List<String> installerRequest = null; // Create a list to store installer requests

	                    for (Installer in : DataArrayList.Installers) {
	                        if (installer.equals(in.getUsername())) {
	                            installerRequest = in.getschedule();
	                            break; // Exit the loop once the installer is found
	                        }
	                    }

	                    if (installerRequest == null) {
	                        System.out.println("No installer with this name! Re-enter new order with a valid Installer");
	                        return; // Exit the method if no valid installer is found
	                    }

	                    // Check if the preferred date is already booked for the installer
	                    if (isDateBooked(installerRequest, date)) {
	                        System.out.println("Installer is busy on the selected date.");
	                        
	                        return;
	                    }

	                    // Add the request to the customer
	                    customerRequest.add("Product Name: " + prodname);
	                    customerRequest.add("Car Model: " + carModel);
	                    customerRequest.add("Installer Name: " + installer);
	                    customerRequest.add("Preferred Date: " + date);

	                    // Add the request to the installer
	                    installerRequest.add("Customer Name: " + customer.getUsername());
	                    installerRequest.add("Product Name: " + prodname);
	                    installerRequest.add("Preferred Date: " + date);

	                    // Add product information to the customer's orders
	                }
	            }
	        }
	    }
	}

	// Method to check if the preferred date is already booked for the installer
	private boolean isDateBooked(List<String> installerSchedule, String date) {
	    for (int i = 0; i < installerSchedule.size(); i++) {
	        if (installerSchedule.get(i).contains("Preferred Date: " + date)) {
	            return true; // Date is already booked
	        }
	    }
	    return false; // Date is available
	}
	
	
	

	
}