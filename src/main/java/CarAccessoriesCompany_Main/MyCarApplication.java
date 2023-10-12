package CarAccessoriesCompany_Main;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MyCarApplication {
	
	public boolean isLogedin;
	public boolean isSignedup;
	
	DataArrayList list;
	
	public MyCarApplication() {
		isLogedin = false;
		isSignedup = false;
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
	
}
