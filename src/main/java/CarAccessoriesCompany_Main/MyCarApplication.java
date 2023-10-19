package CarAccessoriesCompany_Main;

import java.util.regex.Pattern;
import java.util.List;
import java.util.regex.Matcher;

public class MyCarApplication {
	
	public boolean isLogedin;
	public boolean invalidEmail;
	public boolean validEmail;
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
	
	DataArrayList list;
	
	public MyCarApplication() {
		isLogedin = false;
		invalidEmail = false;
		validEmail = false;
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
		list = new DataArrayList();
		
	}
	public boolean UserID(String Email) {
		for(User n : DataArrayList.Admin) {
	        if(Email.equals(n.getEmail())) {
	           isAdmin = true;
	           break;
	        }
	       
	    }
		for(Customers n : DataArrayList.Customer) {
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
		
		return isAdmin || isCustomer || isInstaller;
		
	}
	
	public boolean ValidEmail(String Email) {
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(Email);
	    if (matcher.matches()) {
	    	validEmail = true;
	    }
	    System.out.println(validEmail);
	    return validEmail;
	}
	
	// Admin sign-in functions
	public boolean Adminlogin(String Email, String Password) {
		isLogedin = false;
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(Email);
	    if (matcher.matches()) {
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
		
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(Email);
	    
	    if (matcher.matches()) {
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
		for(User n : DataArrayList.Admin) {
	        if(Email.equals(n.getEmail()) && Password.equals(n.getPassword())) {
	           isLogedin = true;
	           break;
	        }
	    }
		return isLogedin;
	}
	
	public boolean AdminEmptyPassword(String Email, String Password) {
		isLogedin = true;
		for(User n : DataArrayList.Admin) {
	        if(Email.equals(n.getEmail()) && Password.isEmpty()) {
	           isLogedin = false;
	           break;
	        }
	    }
		
		return isLogedin;
	}
	
	// Customer sign-in functions
	public boolean Customerlogin(String Email, String Password) {
		for(Customers n : DataArrayList.Customer) {
	        if(Email.equals(n.getEmail()) && n.getPassword().equals(Password)) {
	           isLogedin = true;
	           break;
	        }
	    }
		return isLogedin;
	}
	
	public boolean CustomerInvalidEmail(String Email) {
		
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(Email);
	    
	    if (matcher.matches()) {
	        for (Customers n : DataArrayList.Customer) {
	            if (Email.equals(n.getEmail())) {
	                isLogedin = true;
	                break;
	            }
	        }
	    }

	    return isLogedin;
	}
	
	public boolean CustomerIncorrectPassword(String Email, String Password) {
		for(Customers n : DataArrayList.Customer) {
	        if(Email.equals(n.getEmail()) && Password.equals(n.getPassword())) {
	           isLogedin = true;
	           break;
	        }
	    }
		return isLogedin;
	}
	
	public boolean CustomerEmptyPassword(String Email, String Password) {
		isLogedin = true;
		for(Customers n : DataArrayList.Customer) {
	        if(Email.equals(n.getEmail()) && Password.isEmpty()) {
	           isLogedin = false;
	           break;
	        }
	    }
		
		return isLogedin;
	}
	
	// Installer sign-in function
	public boolean Installerlogin(String Email, String Password) {
		for(User n : DataArrayList.Installer) {
	        if(Email.equals(n.getEmail()) && n.getPassword().equals(Password)) {
	           isLogedin = true;
	           break;
	        }
	    }
		return isLogedin;
	}
	
	public boolean InstallerInvalidEmail(String Email) {
		
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(Email);
	    
	    if (matcher.matches()) {
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
		for(User n : DataArrayList.Installer) {
	        if(Email.equals(n.getEmail()) && Password.equals(n.getPassword())) {
	           isLogedin = true;
	           break;
	        }
	    }
		return isLogedin;
	}
	
	public boolean InstallerEmptyPassword(String Email, String Password) {
		isLogedin = true;
		for(User n : DataArrayList.Installer) {
	        if(Email.equals(n.getEmail()) && Password.isEmpty()) {
	           isLogedin = false;
	           break;
	        }
	    }
		
		return isLogedin;
	}
	
	// User Sign-up functions
	
	public boolean UserSignUp(String Email, String Password, String Username, String PhoneNumber) {
		isSignedup = true;
		
		String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(Email);
	    
	    if (!matcher.matches()) {
	        isSignedup = false;
	        return isSignedup;
	    }
	    for (Customers n : DataArrayList.Customer) {
	        if (Email.equals(n.getEmail()) || Username.equals(n.getUsername()) || PhoneNumber.equals(n.getPhoneNumber())) {
	            isSignedup = false;
	            return isSignedup;
	        }
	    }
	    
	    Customers newUser = new Customers(Email, Password, Username, PhoneNumber);
	    DataArrayList.Customer.add(newUser);

	    return isSignedup;
	}
	
	public boolean ExistEmail(String Email) {
		
		isSignedup = true;
		for(Customers n : DataArrayList.Customer) {
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
		return isSignedup;
	}
	
	public boolean SignupEmptyPassword(String Email, String Password) {
		isSignedup = true;
		Customers newUser = new Customers(Email, Password, null, null);
		if(Password.isEmpty()) {
			isSignedup = false;
		}
		
		
		return isSignedup;
	}
	
	public boolean SignupWeakPassword(String Email, String Password) {
		isSignedup = true;
		invalidEmail = true;
		User newUser = new User(Email, Password);
		 if (Password.length() < 8) {
			 isSignedup = false;
			 invalidEmail = false;
		 }
		    return isSignedup; 
	}
	
	public boolean InvalidEmailType(String Email) {
		isSignedup = true;
		
	    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(Email);

	    	if(!matcher.matches()) {
	    		isSignedup = false;
	    		invalidEmail = true;
	    		
	    	}
	    	return isSignedup;
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
		for(Product n : DataArrayList.Interior) {
	        if(ProductName.equals(n.getProductName())) {
	           validProduct = true;
	           break;
	        }
	    }
	}
		else if(CategoryName.equals("Exterior")) {
			for(Product n : DataArrayList.Exterior) {
		        if(ProductName.equals(n.getProductName())) {
		           validProduct = true;
		           break;
		        }
		    }
		}
		else if(CategoryName.equals("Electronics")) {
			for(Product n : DataArrayList.Electronics) {
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
		
		boolean EmailExists = DataArrayList.Customer.stream()
	            .anyMatch(customer -> customer.getEmail().equals(Update));
		boolean UsernameExists = DataArrayList.Customer.stream()
		        .anyMatch(customer -> customer.getUsername().equals(Update));
		boolean PhoneNumber = DataArrayList.Customer.stream()
		        .anyMatch(customer -> customer.getPhoneNumber().equals(Update));
		

		if (!EmailExists) {
			for (Customers customer : DataArrayList.Customer) {
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
		            for (Customers customer : DataArrayList.Customer) {
		                if (customer.getEmail().equals(Email)) {
		                    customer.setPassword(Update);
		                    isupdated = true;
		                }
		            }
		        }
		    }
		
		if (!UsernameExists) {
			for (Customers customer : DataArrayList.Customer) {
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
			for (Customers customer : DataArrayList.Customer) {
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
		 Customers customer = findCustomerByEmail(Email);
		if (customer != null) {
	        // Assuming that the customer has a list of orders
	        List<Customers> customerOrders = customer.getOrders();
	        
	        if (customerOrders.isEmpty()) {
	        	DisplayList = false;
	        }
	        else {
	        	 for (Customers order : customerOrders) {
	        		 if(customerOrders.size() >= 1) {
	        			 DisplayList = true;
	        		 }
	        	 }
	        }
		
	}
		return DisplayList;
	}
	public boolean DisplayInstallationRequests(String Email) {
		 Customers customer = findCustomerByEmail(Email);
		if (customer != null) {
	        // Assuming that the customer has a list of orders
	        List<Customers> customerRequest = customer.getRequest();
	        
	        if (customerRequest.isEmpty()) {
	        	DisplayList = false;
	        }
	        else {
	        	 for (Customers order : customerRequest) {
	        		 if(customerRequest.size() >= 1) {
	        			 DisplayList = true;
	        		 }
	        	 }
	        }
		
	}
		return DisplayList;
	}
	
	private Customers findCustomerByEmail(String email) {
	    // Search for the customer by email in your data source (DataArrayList.Customer)
	    for (Customers customer : DataArrayList.Customer) {
	        if (customer.getEmail().equals(email)) {
	            return customer;
	        }
	    }
	    return null; // Customer not found
	}


	public void PrintAdminMenu() {
		System.out.println("\tMenu");
		System.out.println("1.Admin Dashboard");
		System.out.println("2.My Profile");
		System.out.println("0.Sign out");
		
	}
	
}
