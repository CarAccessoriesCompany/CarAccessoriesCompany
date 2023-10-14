package CarAccessoriesCompany_Main;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MyCarApplication {
	
	public boolean isLogedin;
	public boolean isSignedup;
	public boolean inMenu;
	public boolean validCommand;
	public boolean validCategory;
	public boolean validProduct; 
	
	DataArrayList list;
	
	public MyCarApplication() {
		isLogedin = false;
		isSignedup = false;
		inMenu = true;
		validCommand = false;
		validCategory = false;
		validProduct = false;
		
		list = new DataArrayList();
		
	}
	
	// Admin sign-in functions
	public boolean Adminlogin(String Email, String Password) {
		isLogedin = false;
		for(User n : DataArrayList.Admin) {
	        if(Email.equals(n.getEmail()) && n.getPassword().equals(Password)) {
	           isLogedin = true;
	           break;
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
		for(User n : DataArrayList.Customer) {
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
	        for (User n : DataArrayList.Customer) {
	            if (Email.equals(n.getEmail())) {
	                isLogedin = true;
	                break;
	            }
	        }
	    }

	    return isLogedin;
	}
	
	public boolean CustomerIncorrectPassword(String Email, String Password) {
		for(User n : DataArrayList.Customer) {
	        if(Email.equals(n.getEmail()) && Password.equals(n.getPassword())) {
	           isLogedin = true;
	           break;
	        }
	    }
		return isLogedin;
	}
	
	public boolean CustomerEmptyPassword(String Email, String Password) {
		isLogedin = true;
		for(User n : DataArrayList.Customer) {
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
	
	public boolean UserSignUp(String Email, String Password) {
		isSignedup = true;
		
		String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(Email);
	    
	    if (!matcher.matches()) {
	        isSignedup = false;
	        return isSignedup;
	    }
	    for (User n : DataArrayList.Customer) {
	        if (Email.equals(n.getEmail())) {
	            isSignedup = false;
	            return isSignedup;
	        }
	    }
	    
	    User newUser = new User(Email, Password);
	    DataArrayList.Customer.add(newUser);

	    return isSignedup;
	}
	
	public boolean ExistEmail(String Email, String Password) {
		
		isSignedup = true;
		for(User n : DataArrayList.Customer) {
	        if(Email.equals(n.getEmail())) {
	           isSignedup = false;
	           break;
	        }
	        
	    }
		return isSignedup;
	}
	
	public boolean SignupEmptyPassword(String Email, String Password) {
		isSignedup = true;
		User newUser = new User(Email, Password);
		if(Password.isEmpty()) {
			isSignedup = false;
		}
		
		
		return isSignedup;
	}
	
	public boolean SignupWeakPassword(String Email, String Password) {
		isSignedup = true;
		User newUser = new User(Email, Password);
		 if (Password.length() < 8) {
			 isSignedup = false;
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
		           System.out.println(ProductName);
		           System.out.println(n.getDescription());
		           System.out.println(n.getPrice());
		           System.out.println(n.getAvailability());
		    }
		}
	
	
	return validProduct;
	
}
}
