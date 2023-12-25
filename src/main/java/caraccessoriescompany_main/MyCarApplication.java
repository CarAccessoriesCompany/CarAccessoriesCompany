package caraccessoriescompany_main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import java.util.regex.Pattern;
import java.util.List;
import java.util.regex.Matcher;
import java.util.logging.Logger;
public class MyCarApplication {
	
	private DataArrayList list = new DataArrayList();
	private MyCarApplication app;
	
	private boolean islogedin;
	private boolean invalidEmail;
	private boolean incorrectPassword;
	private boolean isEmpty;
	private boolean isSignedup;
	private boolean inMenu;
	private boolean validCommand;
	private boolean validcategory;
	private boolean validProduct; 
	private boolean isadmin; 
	private boolean isCustomer; 
	private boolean isInstaller; 
	private boolean inProfile;
	private boolean isExist;
	private boolean isupdated;
	private boolean displayOrder;
	private boolean noOrder;
	private boolean displayList;
	
	private boolean inDashboard;
	private boolean catIsExist;
	private boolean catIsAdded;
	private boolean catIsEdited;
	private boolean catIsDeleted;
	
	private boolean prodIsExist;
	private boolean prodIsAdded;
	private boolean prodIsValid;
	
	private boolean prodnameIsUpdated;
	private boolean proddescriptionIsUpdated;
	private boolean prodpriceIsUpdated;
	private boolean prodavlIsUpdated;
	private boolean prodcatIsUpdated;
	
	
	
	
	private boolean customerAccIsExist;
	private boolean displayCustomerInfo;
	private boolean customerNameUpdated;
	private boolean customerIsDeleted;
	private boolean productIsDeleted;
	
	
	private boolean isInproductPage;
	private boolean isreviewed;
	private boolean israted;
	private boolean displayreview;
	private boolean displayRate;
					
	private boolean isInServicePage;
	private boolean validrequest;
	private boolean isAvailable;
	
	private boolean isConfirmed;
	
	
	
	private boolean appIsSechduled;
	private boolean viewAppointment;
	private boolean appReschduled;
	private boolean appCanceled;
	private boolean installerScheduleViewd;
	
	
	
	private boolean isOrdered;
	private boolean sendEmail;
	private boolean installationReqReceived;
	private static final Logger logger = Logger.getLogger(MyCarApplication.class.getName());
	
	public MyCarApplication() {
		setIsLogedin(false);
		setInvalidEmail(false);
		setIncorrectPassword(false);
		setIsEmpty(false);
		setSignedup(false);
		setInMenu(true);
		setValidCommand(false);
		setValidcategory(false);
		setValidProduct(false);
		
		setIsadmin(false);
		setIsCustomer(false);
		setIsInstaller(false);
		
		setInProfile(false);
		setExist(false);
		setIsupdated(false);
		setDisplayOrder(false);
		setNoOrder(false);
		setDisplayList(false);
		
		setInDashboard(true);
		setCatIsExist(false);
		setCatIsAdded(false);
		setCatIsEdited(false);
		setCatIsDeleted(false);
		
		
		setProdIsExist(false);
		setProdIsAdded(false);
	    setProdIsValid(true);
	    setProdnameIsUpdated(false);
	    setProddescriptionIsUpdated(false);
	    setProdpriceIsUpdated(false);
	    setProdavlIsUpdated(false);
	    setProdcatIsUpdated(false);
	    
	    setProductIsDeleted(false);
	    
	    
	    
	    setCustomerAccIsExist(false);
	    setDisplayCustomerInfo(false);
	    setCustomerNameUpdated(false);
	    setCustomerIsDeleted(false);
	    
	 	setInproductPage(true);
	 	setreviewed(false);
	 	setrated(false);
	 	setDisplayreview(false);
	 	setDisplayRate(false);

	    
	 	setInServicePage(true);
	 	setValidrequest(true);
	 	setAvailable(false);
	 	
	 	
	 	setAppIsSechduled(false);
	 	setViewAppointment(false);
	 	setAppReschduled(false);
	 	setAppCanceled(false);
	 	setInstallerScheduleViewd(false);
	 	
	 	
	 	
	 	setOrdered(false);
	 	setSendEmail(false);
	 	setInstallationReqReceived(false);
	 	
		
		
	}
	
	
	
	public boolean userID(String email) {
	    invalidEmailType(email);

	    return isadmin(email) || isCustomer(email) || isInstaller(email);
	}

	public boolean isadmin(String email) {
	    for (User user : DataArrayList.admin) {
	        if (email.equals(user.getEmail())) {
	            return true;
	        }
	    }
	   return false;
	}

	public boolean isCustomer(String email) {
	    for (Customer customer : list.getCustomers()) {
	        if (email.equals(customer.getEmail())) {
	            return true;
	        }
	    }
	    return false;
	}

	public boolean isInstaller(String email) {
	    for (Installer installer : DataArrayList.installers) {
	        if (email.equals(installer.getEmail())) {
	            return true;
	        }
	    }
	    return false;
	}
	
	

	// admin sign-in functions
	public boolean adminlogin(String Email, String Password) {
		invalidEmailType(Email);
	    if (invalidEmail == false) {
		for(User n : DataArrayList.admin) {
	        if(Email.equals(n.getEmail())) {
	        	if(n.getPassword().equals(Password)) {
	        	   islogedin = true;
		           break;
	        }
	          
	        }
	    }
	    }
		return islogedin;
	}
	
	public boolean adminInvalidEmail(String Email) {
		invalidEmailType(Email);
	    if (invalidEmail == false) {
	        for (User n : DataArrayList.admin) {
	            if (Email.equals(n.getEmail())) {
	                islogedin = true;
	                break;
	            }
	        }
	    }

	    return islogedin;
	}
	
	public boolean adminIncorrectPassword(String Email, String Password) {
		invalidEmailType(Email);
	    if (invalidEmail == false) {
		for(User n : DataArrayList.admin) {
	        if(Email.equals(n.getEmail()) && !Password.equals(n.getPassword())) {
	        	incorrectPassword = true;
	           break;
	        }
	    }
		
	}
	    islogedin = !incorrectPassword;
		return islogedin;
	}
	
	public boolean adminEmptyPassword(String Email, String Password) {
		invalidEmailType(Email);
	    if (invalidEmail == false) {
		for(User n : DataArrayList.admin) {
	        if(Email.equals(n.getEmail()) && Password.isEmpty()) {
	           isEmpty = true;
	           break;
	        }
	    }
	    }
	    islogedin = !isEmpty;
		return islogedin;
	}
	
	// Customer sign-in functions
	public boolean customerlogin(String Email, String Password) {
		invalidEmailType(Email);
	    if (invalidEmail == false) {
		for(Customer n : list.getCustomers()) {
	        if(Email.equals(n.getEmail()) && n.getPassword().equals(Password)) {
	           islogedin = true;
	           break;
	        }
	    }
	    }
		return islogedin;
	}
	
	public boolean customerInvalidEmail(String Email) {
		
		invalidEmailType(Email);
	    if (invalidEmail == false) {
	        for (Customer n : list.getCustomers()) {
	            if (Email.equals(n.getEmail())) {
	                islogedin = true;
	                break;
	            }
	        }
	    }

	    return islogedin;
	}
	
	public boolean customerIncorrectPassword(String Email, String Password) {
		invalidEmailType(Email);
	    if (invalidEmail == false) {
		for(Customer n : list.getCustomers()) {
	        if(Email.equals(n.getEmail()) && !Password.equals(n.getPassword())) {
	           incorrectPassword = true;
	           break;
	        }
	    }
	    }
	    
	    islogedin = !incorrectPassword;
		return islogedin;
	}
	
	public boolean customerEmptyPassword(String Email, String Password) {
		invalidEmailType(Email);
	    if (invalidEmail == false) {
		for(Customer n : list.getCustomers()) {
	        if(Email.equals(n.getEmail()) && Password.isEmpty()) {
	        	isEmpty = true;
	            break;
	        }
	    }
	    }
		
	    islogedin = !isEmpty;
		return islogedin;
	}
	
	// Installer sign-in function
	public boolean installerlogin(String Email, String Password) {
		invalidEmailType(Email);
	    if (invalidEmail == false) {
		for(Installer n : DataArrayList.installers) {
	        if(Email.equals(n.getEmail()) && n.getPassword().equals(Password)) {
	           islogedin = true;
	           break;
	        }
	    }
	    }
		return islogedin;
	}
	
	public boolean installerInvalidEmail(String Email) {
		
		invalidEmailType(Email);
	    if (invalidEmail == false) {
	        for (Installer n : DataArrayList.installers) {
	            if (Email.equals(n.getEmail())) {
	                islogedin = true;
	                break;
	            }
	        }
	    }

	    return islogedin;
	}
	
	public boolean installerIncorrectPassword(String Email, String Password) {
		
		invalidEmailType(Email);
	    if (invalidEmail == false) {
		for(Installer n : DataArrayList.installers) {
	        if(Email.equals(n.getEmail()) && !Password.equals(n.getPassword())) {
	           incorrectPassword = true;
	           break;
	        }
	    }
	    }
	    islogedin = !incorrectPassword;
		return islogedin;
	}
	
	public boolean installerEmptyPassword(String Email, String Password) {
		invalidEmailType(Email);
	    if (invalidEmail == false) {
		for(Installer n : DataArrayList.installers) {
	        if(Email.equals(n.getEmail()) && Password.isEmpty()) {
	        	isEmpty = true;
	            break;
	        }
	    }
	    }
		
	    islogedin = !isEmpty;
		return islogedin;
	}
	
	// User Sign-up functions
	public boolean userSignUp(String Email, String Password, String Username, String PhoneNumber) {
		setSignedup(true);
		
		invalidEmailType(Email);
	    if (invalidEmail == true) {
	        setSignedup(false);
	        return getIsSignedup();
	    }
	    for (Customer n : list.getCustomers()) {
	        if (Email.equals(n.getEmail()) || Username.equals(n.getUsername()) || PhoneNumber.equals(n.getPhoneNumber())) {
	            setSignedup(false);
	            return getIsSignedup();
	        }
	    }
	    
	    Customer newUser = new Customer(Email, Password, Username, PhoneNumber);
	    list.getCustomers().add(newUser);

	    return getIsSignedup();
	}
	
	public boolean existEmail(String Email) {
		
		setSignedup(true);
		invalidEmailType(Email);
	    if (invalidEmail == false) {
		for(Customer n : list.getCustomers()) {
	        if(Email.equals(n.getEmail())) {
	           setSignedup(false);
	           break;
	        }
	        
	    }
		for(User n : DataArrayList.admin) {
	        if(Email.equals(n.getEmail())) {
	           setSignedup(false);
	           break;
	        }
	        
	    }
		for(Installer n : DataArrayList.installers) {
	        if(Email.equals(n.getEmail())) {
	           setSignedup(false);
	           break;
	        }
	        
	    }
	    }
		return getIsSignedup();
	}
	
public boolean existUsername(String Username) {
		
		setSignedup(true);
		for(Customer n : list.getCustomers()) {
	        if(Username.equals(n.getUsername())) {
	           setSignedup(false);
	           break;
	        } 
	    }
	
		return getIsSignedup();
	}

public boolean existPhoneNumber(String PhoneNumber) {
	
	setSignedup(true);
	
	for(Customer n : list.getCustomers()) {
        if(PhoneNumber.equals(n.getPhoneNumber())) {
           setSignedup(false);
           break;
        } 
    }
	return getIsSignedup();
}
	public boolean signupEmptyPassword(String Email, String Password) {
		
		setSignedup(true);
		invalidEmailType(Email);
	    if (invalidEmail == false) {
		Customer newUser = new Customer(Email, Password, null, null);
		if(Password.isEmpty()) {
			setSignedup(false);
		}
	    }
		return getIsSignedup();
	}
	
	public boolean signupWeakPassword(String Email, String Password) {
		setSignedup(true);
		invalidEmail = true;
		invalidEmailType(Email);
	    if (invalidEmail == false) {
		User newUser = new User(Email, Password);
		 if (Password.length() < 8) {
			 setSignedup(false);
			 invalidEmail = false;
		 }
	    }
		    return getIsSignedup(); 
	}
	
	public boolean invalidEmailType(String Email) {
		invalidEmail = false;
	    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(Email);
	    	if(!matcher.matches()) {
	    		return true;
	    	}
	    	setSignedup(!invalidEmail);
	    	return false;
	}
	
	// ProductCatalog functions
	public boolean category(String Menu) {
		if(Menu.equals("category")) {
			setValidCommand(true);
		}
		else if(Menu.equals("Search")) {
			setValidCommand(true);
		}
		return getValidCommand();
	}
	public boolean categoryName(String Name) {
		if (Name.equals("Interior") || Name.equals("Exterior") || Name.equals("Electronics")) {
	        setValidcategory(true);
	    }
	    return getValidcategory();
	}
	public boolean productName(String categoryName, String productName) {
	if(categoryName.equals("Interior")) {
		for(Product n : list.getProducts()) {
	        if(productName.equals(n.getProductName())) {
	           setValidProduct(true);
	           break;
	        }
	    }
	}
		else if(categoryName.equals("Exterior")) {
			for(Product n : list.getProducts()) {
		        if(productName.equals(n.getProductName())) {
		           setValidProduct(true);
		           break;
		        }
		    }
		}
		else if(categoryName.equals("Electronics")) {
			for(Product n : list.getProducts()) {
		        if(productName.equals(n.getProductName())) {
		           setValidProduct(true);
		           break;
		        }
		    }
		}
	
	
	return getValidProduct();
	
}
	///// userProfile
	public boolean userProfile(String Command) {
		if(Command.equals("My Profile")) {
			setInProfile(true);
		}
		
		return getInProfile();
	}
	public boolean EditCommand() {
		setValidCommand(true);
		return getValidCommand();
	}
	
	
	public boolean editField(String Email, String FieldName, String Update) {
		
		boolean EmailExists = list.getCustomers().stream()
	            .anyMatch(customer -> customer.getEmail().equals(Update));
		boolean UsernameExists = list.getCustomers().stream()
		        .anyMatch(customer -> customer.getUsername().equals(Update));
		boolean PhoneNumber = list.getCustomers().stream()
		        .anyMatch(customer -> customer.getPhoneNumber().equals(Update));
		

		if (!EmailExists) {
			for (Customer customer : list.getCustomers()) {
		        if (customer.getEmail().equals(Email)) {
		            if (FieldName.equals("Email")) {
		                if (!Update.equals(customer.getEmail())) {
		                    customer.setEmail(Update);
		                    setIsupdated(true);
		                }
		            } 
		        }
			}
			}
		
		 if (FieldName.equals("Password")) {
		        if (Update != null && !Update.isEmpty() && Update.length() >= 8) {
		            for (Customer customer : list.getCustomers()) {
		                if (customer.getEmail().equals(Email)) {
		                    customer.setPassword(Update);
		                    setIsupdated(true);
		                }
		            }
		        }
		    }
		
		if (!UsernameExists) {
			for (Customer customer : list.getCustomers()) {
		        if (customer.getEmail().equals(Email)) {
		            if (FieldName.equals("Username")) {
		                if (!Update.equals(customer.getUsername())) {
		                    customer.setUsername(Update);
		                    setIsupdated(true);
		                }
		            } 
		        }
			}
			}
		if (!PhoneNumber) {
			for (Customer customer : list.getCustomers()) {
		        if (customer.getEmail().equals(Email)) {
		            if (FieldName.equals("PhoneNumber")) {
		                if (!Update.equals(customer.getPhoneNumber())) {
		                    customer.setPhoneNumber(Update);
		                    setIsupdated(true);
		                }
		            } 
		        }
			}
			}
		
	    return getIsupdated();
		}
	public void addProductToCustomerArray(String email, String prodName) {
	    for (Customer customer : list.getCustomers()) {
	        if (email.equals(customer.getEmail())) {
	            for (Product product : list.getProducts()) {
	                if (prodName.equals(product.getProductName())) {
	                    // Assuming that the customer has a list to store orders
	                    List<String> customerOrders = customer.getOrders();

	                    // Add product information to the customer's orders
	                    customerOrders.add("Product name: " + prodName);
	                    customerOrders.add("Price: " + String.valueOf(product.getPrice())); // Assuming getPrice returns a numeric value
	                    customerOrders.add("category: " + product.getCategory());

	                    
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
	                logger.info(orderNumber + ". " +
	                        customerOrders.get(i) + " " +
	                        customerOrders.get(i + 1) + " " +
	                        customerOrders.get(i + 2));
	                orderNumber++;
	            }
	            System.out.print("\n");
	        } else {
	            logger.info("No orders");
	        }
	    } else {
	        logger.info("Customer not found with email: ");
	    }
	}

	public boolean displayInstallationrequests(String email) {
	    Customer customer = findCustomerByEmail(email);

	    boolean displayList = false; // Initialize the variable outside the conditions

	    if (customer != null) {
	        // Assuming that the customer has a list of requests
	        List<String> customerRequests = customer.getRequest();

	        if (!customerRequests.isEmpty()) {
	            int requestNumber = 1;
	            // Iterate through the list of requests and print them
	            for (int i = 0; i < customerRequests.size(); i += 4) {
	                logger.info(requestNumber + ". " +
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
	    for (Customer customer : list.getCustomers()) {
	        if (customer.getEmail().equals(email)) {
	            return customer;
	        }
	    }
	    return null; // Customer not found
	}
	
	
	
	public boolean addCategory(String cat) {
		 setCatIsExist(false);
		
	    java.util.Iterator<Category> iterator = list.getCategories().iterator();
	    Category c=new Category(cat);

	    while (iterator.hasNext()) {
	    	Category s = iterator.next();
	        if (c.getCatName().equals(s.getCatName())) {
	            setCatIsExist(true);
	            break;
	        }
	    }

	    if (!getCatIsExist()) {
	    	list.getCategories().add(c);
	    }

	    return getCatIsExist();
	}
	
	public boolean editCat(String oldname, String newName) {
	    for (Category s : list.getCategories()) {
	        if (s.getCatName().equals(oldname)) {
	            s.setCatName(newName);
	            setCatIsEdited(true);
	            break; // Exit the loop after updating the category name
	        }
	        
	        
	    }
	    return getCatIsEdited();
	}
	
	public boolean deleteCat(String catName) {
		java.util.Iterator<Category> iterator = list.getCategories().iterator();
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
		java.util.Iterator<Product> iterator = list.getProducts().iterator();
	    boolean productIsDeleted = false;

	    while (iterator.hasNext()) {
	    	Product product = iterator.next();
	        if (product.getProductName().equals(ProdName)) {
	            iterator.remove(); // Removes the category from the list
	            productIsDeleted = true;
	            break; // Exit the loop after deleting the category
	        }
	    }

	    return productIsDeleted;
	}
	
	
	public boolean addProduct(String name, String description, String price, String availability, String categoryName) {
		 setProdIsExist(false);
			
		    java.util.Iterator<Product> iterator = list.getProducts().iterator();
	        Product p = new Product(name,description,price,availability,categoryName);
		    while (iterator.hasNext()) {
		       Product s = iterator.next();
		        if (p.getProductName().equals(s.getProductName())) {
		           setProdIsExist(true);
		            break;
		        }
		    }

		        if (!getProdIsExist()) {
		        	list.getProducts().add(p);
		    }
		    
		    return getProdIsExist();
	}
		
	public boolean isValidProductData(String name, String description, String price, String availability, String category) {
	       

        setProdIsValid(!name.isEmpty() && !description.isEmpty() && !category.isEmpty());
      
           double parsedPrice = Double.parseDouble(price);
          if(parsedPrice <=0) {
       	   setProdIsValid(false);
          }
           

         

      
       return getProdIsValid();
   }
	
	public boolean updateProdName(String oName, String nName ) {	
		if(!nName.isEmpty()) {
			for(Product p:list.getProducts()) {
				if(p.getProductName().equals(oName)) {
					p.setProductName(nName);
					setProdnameIsUpdated(true);
					break;
					
				}
			}
		}
		
		return getProdnameIsUpdated();
	}
	
	public boolean updateProdPrice(String nprice, String name) {
		
		 double parsedPrice = Double.parseDouble(nprice);
        if(parsedPrice <=0) {
			for(Product p:list.getProducts()) {
				if(p.getProductName().equals(name)) {
					p.setPrice(nprice);
					setProdpriceIsUpdated(true);
					
				}
			}
		}
		
		return getProdpriceIsUpdated();
	}
	
	public boolean updateProdDescription(String nDescription, String name){
		
		 
		if(!nDescription.isEmpty()){
			for(Product p:list.getProducts()) {
				if(p.getProductName().equals(name)) {
					p.setDescription(nDescription);
					setProddescriptionIsUpdated(true);
					break;
					
				}
			}
		}
		
		return getProddescriptionIsUpdated();
	}
	
	public boolean updateProdAvailability(String avl, String name){
		
		if(!avl.isEmpty()){
			for(Product p:list.getProducts()) {
				if(p.getProductName().equals(name)) {
					p.setAvailability(avl);
					setProdavlIsUpdated(true);
					
				}
			}
		}
		
		return getProdavlIsUpdated();
	}
	
	
	public boolean isExistProduct(String pName) {
		for(Product p:list.getProducts()) {
			if(p.getProductName().equals(pName)) {
				setProdIsExist(true);
				
			}
		}
		return getProdIsExist();
	}
	
	
	
	
	
	
	
public boolean updateProdcategory(String cat, String name){
		
		for(Category c:list.getCategories()) {
			if(c.getCatName().equals(cat)) {
				
				for(Product p:list.getProducts()) {
					if(p.getProductName().equals(name)) {
						p.setCategory(cat);
						setProdcatIsUpdated(true);
						
					}
				}
			}
			
		}
		
		
		
		return getProdcatIsUpdated();
	}
	
	public boolean selectCustomerAcc(String name) {
		for(Customer c:list.getCustomers()) {
			if(c.getUsername().equals(name)) {
				setDisplayCustomerInfo(true);
			}
		}
		
		return getDisplayCustomerInfo();
	}
	
	
	public boolean changeCustomerUsername(String oName,String nName) {
		for(Customer c:list.getCustomers()) {
			if(c.getUsername().equals(oName)) {
				c.setUsername(nName);
				setCustomerNameUpdated(true);
			}
		}
		
		return getCustomerNameUpdated();
	}
	
	public boolean deleteCustomerAcc(String name) {
		java.util.Iterator<Customer> iterator = list.getCustomers().iterator();
		setCustomerIsDeleted(false);

	    while (iterator.hasNext()) {
	        Customer c = iterator.next();
	        if (c.getUsername().equals(name)) {
	            iterator.remove(); // Removes the category from the list
	            setCustomerIsDeleted(true);
	            break; // Exit the loop after deleting the category
	        }
	    }
	    
	    return getCustomerIsDeleted();
	}
	
		
		
	public boolean review(String ProdName,String review) {
		for(Product n : list.getProducts()) {
	        if(ProdName.equals(n.getProductName())) {
	        	if(!review.isEmpty()) {
	        		n.setReview(review);
		        	setreviewed(true);
		        	break;
	        	}
	        }
	        }
		return getIsreviewed();
	}
	
	public boolean rated(String ProdName,int Rate) {
		for(Product n : list.getProducts()) {
	        if(ProdName.equals(n.getProductName())) {
	        	if(Rate <= 5 && Rate >= 0) {
	        		n.setRating(Rate);
	        		setrated(true);
		        	break;
	        	}
	        }
	        }
		return getIsrated();
	}
	
	
	
	public boolean dispalyreview(String ProdName) {
		for(Product n : list.getProducts()) {
	        if(ProdName.equals(n.getProductName())) {
	        		displayreview = true;
	        	}
	        }
	        return displayreview;
	}
	public boolean DispalyRate(String ProdName) {
		for(Product n : list.getProducts()) {
	        if(ProdName.equals(n.getProductName())) {
	        	if(n.getRating() >= 0 && n.getRating() <= 5){
	        		displayRate = true;
	        	}
	        	}
	        }
	        return displayRate;
	}
	public boolean request(String Username, String Email, String Car_Model, String Descriptions , String Date) {
		
		for(Customer u : list.getCustomers()) {
	        	if(Email.equals(u.getEmail()) && Username.equals(u.getUsername())) {
	        		for(String c : u.getRequest()) {
	                	if(!Car_Model.isEmpty() && !Descriptions.isEmpty() && !Date.isEmpty()) {
	                		u.getRequest().add(Car_Model);
	                		u.getRequest().add(Descriptions);
	                		u.getRequest().add(Date);
	                		
	                	}
	                	
	            	}
	        		validrequest = true;
	        		break;
	        	}
	        	
        	}
	
		return validrequest;
	}
	
	public boolean instAvalibilty(String Username) {
		for(Installer in: DataArrayList.installers) {
			if(Username.equals(in.getUsername())) {
				if(in.getInstallerAvalibilty().equals("Available")) {
					setAvailable(true);
				}
			}
		}
		return getIsAvailable();
	}

	public void printadminMenu() {
		logger.info("\tWelcome admin");
		logger.info("1.admin Dashboard");
		logger.info("0.Sign out");
		
	}
	public void printadminDashoard() {
		logger.info("1.Add Product");
		logger.info("2.Edit Product");
		logger.info("3.Delete Product");
		
		logger.info("4.Add category");
		logger.info("5.Edit category");
		logger.info("6.Delete category");
		
		logger.info("7.Change Username");
		logger.info("8.Delete User");
		
		logger.info("0.Back to Menu");
	}
	public void printCustomerMenu() {
		logger.info("1.Browse products");
		logger.info("2.My Profile");
		logger.info("0.Sign out");
	}
	public void printInstallerMenu() {
		logger.info("1.My Installation requests and Schedule Appointments");
		logger.info("0.Sign out");
	}
	
	public void printTheProducts(int Cat) {
		if(Cat == 1) {
			for(Product p:list.getProducts()) {
				logger.info("Product Name:" + p.getProductName());
				logger.info("Product Discription:" + p.getDescription());
				logger.info("Product Price:" + p.getPrice());
				logger.info("Product Availability:" + p.getAvailability());
				logger.info("Product category:" + p.getCategory());
				logger.info("/////////////////////////////////////////////////////");
				}
		}
		else if(Cat == 2) {
			for(Product p:list.getProducts()) {
				if (p.getCategory().equals("Interior")) {
				logger.info("Product Name:" + p.getProductName());
				logger.info("Product Discription:" + p.getDescription());
				logger.info("Product Price:" + p.getPrice());
				logger.info("Product Availability:" + p.getAvailability());
				logger.info("Product category:" + p.getCategory());
				logger.info("/////////////////////////////////////////////////////");
				}
			}
		}
		else if(Cat == 3) {
			for(Product p:list.getProducts()) {
				if (p.getCategory().equals("Exterior")) {
				logger.info("Product Name:" + p.getProductName());
				logger.info("Product Discription:" + p.getDescription());
				logger.info("Product Price:" + p.getPrice());
				logger.info("Product Availability:" + p.getAvailability());
				logger.info("Product category:" + p.getCategory());
				logger.info("/////////////////////////////////////////////////////");
				}
			}
		}
		else if(Cat == 4) {
			for(Product p:list.getProducts()) {
				if (p.getCategory().equals("Electronic")) {
				logger.info("Product Name:" + p.getProductName());
				logger.info("Product Discription:" + p.getDescription());
				logger.info("Product Price:" + p.getPrice());
				logger.info("Product Availability:" + p.getAvailability());
				logger.info("Product category:" + p.getCategory());
				logger.info("/////////////////////////////////////////////////////");
				}
			}
		}
		
		
	}
	public void printEditChoices(){
		logger.info("1.Product Name" );
		logger.info("2.Product Discription");
		logger.info("3.Product Price");
		logger.info("4.Product Availability");
		logger.info("5.Product category");
		logger.info("0.Back");
	}
	
	public void printCat() {
		logger.info("Categories:");
		int index = 1;
		for(Category cat:list.getCategories()) {
			logger.info(index +"." + cat.getCatName());
			index++;
			}
		
	}
	public void printUsers() {
		logger.info("customers:");
		int i = 1;
		for(Customer n : list.getCustomers()) {
	       logger.info(i + "." + n.getUsername());
	       logger.info("/////////////////////////////////////////////////////");
	       i++;
	        }
	    }
	
	
	
	
	
	public boolean appointmentSchedule(String date,String insName,String cusName,String proName) {
		Appointment ap1=new Appointment();
		ap1.setDate(date);
		ap1.setInsName(insName);
		ap1.setCusName(cusName);
		ap1.setProName(proName);
		
		list.getAppointment().add(ap1);
		setAppIsSechduled(true);
		return getAppIsSechduled();
	}
	
	
	public boolean appointmentView(String date) {
		for(Appointment ap:list.getAppointment()) {
			if(ap.getDate().equals(date));
			setViewAppointment(true);

		}
		return getViewAppointment();
	}
	
	
	public boolean appReschdule(String oDate, String insName, String cusName, String nDate) {
		for(Appointment ap:list.getAppointment()) {
			if(ap.getCusName().equals(cusName) && ap.getDate().equals(oDate) && ap.getInsName().equals(insName)) {
			ap.setDate(nDate);
			
			setAppReschduled(true);
			}

		}
		return getAppReschduled();
	}
	
	
	public boolean appCancel(String cusName, String Date, String insName) {
		for(Appointment ap:list.getAppointment()) {
			if(ap.getCusName().equals(cusName) && ap.getDate().equals(Date) && ap.getInsName().equals(insName)) {
				list.getAppointment().remove(ap);
				setAppCanceled(true);
				
			}
		}
		return getAppCanceled();
	}
	
	
	public boolean viewInstallerSchedule(String insName) {

	    boolean InstallerScheduleViewed = false;

	    for (Installer in : DataArrayList.installers) {
	        List<String> installerRequest = in.getschedule();
	        if (!insName.equals(in.getUsername())) {
	            // logger.info("No installer with this name! Re-enter new order with valid Installer");
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
	            Collections.sort(installerRequest, dateComparator);

	            for (int i = 0; i < installerRequest.size(); i += 3) {
	                logger.info(index + ". " +
	                        installerRequest.get(i) + " " +
	                        installerRequest.get(i + 1) + " " +
	                        installerRequest.get(i + 2));
	                index++;
	            }
	            logger.info("\n");

	            InstallerScheduleViewed = true;
	        }
	    }

	    return InstallerScheduleViewed;
	}

	
	

	
	public boolean orderIsPlacedBy(String email, String prodname, String status) {
	    boolean sendEmail = false;

	    for (Customer customer : list.getCustomers()) {
	        if (email.equals(customer.getEmail())) {
	            for (Product product : list.getProducts()) {
	                if (prodname.equals(product.getProductName())) {
	                    
	                    List<String> Inbox = customer.getInbox();
	                    

	                    if ("Confirm".equals(status)) { // Use equals() for string comparison
	                        Inbox.add("Product Name: " + product.getProductName());
	                        Inbox.add("Price: " + product.getPrice());
	                        Inbox.add("category: " + product.getCategory());
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
	    for (Customer customer : list.getCustomers()) {
	        List<String> Inbox = customer.getInbox();
	        if (email.equals(customer.getEmail())) {
	            int index = 1;
	            for (int i = 0; i < Inbox.size(); i += 3) {
	                logger.info(index + ". " +
	                        Inbox.get(i) + " " +
	                        Inbox.get(i + 1) + " " +
	                        Inbox.get(i + 2));
	                index++;
	            }
	            logger.info("\n");
	            return true; // Return true if the email is found
	        }
	    }
	    return false; // Return false if the email is not found
	}

	
	
	public boolean getAnInsallationReqFot(String name) {
		for(Installer n:DataArrayList.installers) {
			if(n.getUsername().equals(name) && n.getInstallerAvalibilty().equals("Available")) {
				installationReqReceived=true;
			}
		}
		return installationReqReceived;
	}
	
	public boolean isproductNameExist(String ProdName) {
		for(Product p : list.getProducts()) {
	        if(ProdName.equals(p.getProductName())) {
	        	setProdIsExist(true);
	           break;
	        } 
	    }
		return getProdIsExist();
	}	
	public boolean iscategoryNameExist(String CatName) {
		for (Category s : list.getCategories()) {
	        if (s.getCatName().equals(CatName)) {
	        	setCatIsExist(true);
	            break; 
	        } 
	    }
		return getCatIsExist();
	}	
	public void changeUsernameforCust(String email, String nname) {
		for(Customer c : list.getCustomers()) {
			logger.info("Before " + c.getUsername());
	        if(email.equals(c.getEmail())) {
	        	c.setUsername(nname);
	        	logger.info(c.getUsername());
	           break;
	        } 
	        
	    }
	}
	public void changePasswordforCust(String email, String nPass) {
		for(Customer c : list.getCustomers()) {
			logger.info("Before " + c.getPassword());
	        if(email.equals(c.getEmail())) {
	        	c.setPassword(nPass);
	        	logger.info(c.getPassword());
	           break;
	        } 
	        
	    }
	}
	public void changePhoneforCust(String email, String nPhone) {
		for(Customer c : list.getCustomers()) {
			logger.info("Before " + c.getPhoneNumber());
	        if(email.equals(c.getEmail())) {
	        	c.setPhoneNumber(nPhone);
	        	logger.info(c.getPhoneNumber());
	           break;
	        } 
	        
	    }
	}
	
	public void addReq(String email, String prodname, String carModel, String installer, String date) {
	    for (Customer customer : list.getCustomers()) {
	        if (email.equals(customer.getEmail())) {
	            for (Product product : list.getProducts()) {
	                if (prodname.equals(product.getProductName())) {
	                    // Assuming that the customer has a list to store orders
	                    List<String> customerRequest = customer.getRequest();

	                    List<String> installerRequest = null; // Create a list to store installer requests

	                    for (Installer in : DataArrayList.installers) {
	                        if (installer.equals(in.getUsername())) {
	                            installerRequest = in.getschedule();
	                            break; // Exit the loop once the installer is found
	                        }
	                    }

	                    if (installerRequest == null) {
	                        logger.info("No installer with this name! Re-enter new order with a valid Installer");
	                        return; // Exit the method if no valid installer is found
	                    }

	                    // Check if the preferred date is already booked for the installer
	                    if (isDateBooked(installerRequest, date)) {
	                        logger.info("Installer is busy on the selected date.");
	                        
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
	
	
	//NEW Setters & Getters :
	public boolean getInMenu() {
		return inMenu;
	}
	public void setInMenu(boolean inMenu) {
		this.inMenu = inMenu;
	}
	public boolean getInProfile() {
		return inProfile;
	}
	public void setInProfile(boolean inProfile) {
		this.inProfile = inProfile;
	}
	public boolean getisExist() {
		return isExist;
	}
	public void setExist(boolean isExist) {
		this.isExist = isExist;
	}
	public boolean getisDisplayOrder() {
		return displayOrder;
	}
	public void setDisplayOrder(boolean displayOrder) {
		this.displayOrder = displayOrder;
	}
	public boolean getisNoOrder() {
		return noOrder;
	}
	public void setNoOrder(boolean noOrder) {
		this.noOrder = noOrder;
	}
	public boolean getDisplayList() {
		return displayList;
	}
	public void setDisplayList(boolean displayList) {
		this.displayList = displayList;
	}
	public boolean getInDashboard() {
		return inDashboard;
	}
	public void setInDashboard(boolean inDashboard) {
		this.inDashboard = inDashboard;
	}
	public boolean getCatIsAdded() {
		return catIsAdded;
	}
	public void setCatIsAdded(boolean catIsAdded) {
		this.catIsAdded = catIsAdded;
	}
	public boolean getCatIsDeleted() {
		return catIsDeleted;
	}
	public void setCatIsDeleted(boolean catIsDeleted) {
		this.catIsDeleted = catIsDeleted;
	}
	public boolean getProdIsAdded() {
		return prodIsAdded;
	}
	public void setProdIsAdded(boolean prodIsAdded) {
		this.prodIsAdded = prodIsAdded;
	}
	public boolean getCustomerAccIsExist() {
		return customerAccIsExist;
	}
	public void setCustomerAccIsExist(boolean customerAccIsExist) {
		this.customerAccIsExist = customerAccIsExist;
	}
	public boolean getProductIsDeleted() {
		return productIsDeleted;
	}
	public void setProductIsDeleted(boolean productIsDeleted) {
		this.productIsDeleted = productIsDeleted;
	}
	public boolean getInproductPage() {
		return isInproductPage;
	}
	public void setInproductPage(boolean isInproductPage) {
		this.isInproductPage = isInproductPage;
	}
	public boolean getInServicePage() {
		return isInServicePage;
	}
	public void setInServicePage(boolean isInServicePage) {
		this.isInServicePage = isInServicePage;
	}
	public boolean getisConfirmed() {
		return isConfirmed;
	}
	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
	public boolean getInstallerScheduleViewd() {
		return installerScheduleViewd;
	}
	public void setInstallerScheduleViewd(boolean installerScheduleViewd) {
		this.installerScheduleViewd = installerScheduleViewd;
	}
	public boolean getisOrdered() {
		return isOrdered;
	}
	public void setOrdered(boolean isOrdered) {
		this.isOrdered = isOrdered;
	}
	public boolean getisSendEmail() {
		return sendEmail;
	}
	public void setSendEmail(boolean sendEmail) {
		this.sendEmail = sendEmail;
	}
	public boolean getCatIsExist() {
		return catIsExist;
	}
	public void setCatIsExist(boolean catIsExist) {
		this.catIsExist = catIsExist;
	}
	public boolean getCatIsEdited() {
		return catIsEdited;
	}
	public void setCatIsEdited(boolean catIsEdited) {
		this.catIsEdited = catIsEdited;
	}
	public boolean getProdIsExist() {
		return prodIsExist;
	}
	public void setProdIsExist(boolean prodIsExist) {
		this.prodIsExist = prodIsExist;
	}
	public boolean getProdIsValid() {
		return prodIsValid;
	}
	public void setProdIsValid(boolean prodIsValid) {
		this.prodIsValid = prodIsValid;
	}
	public boolean getProdnameIsUpdated() {
		return prodnameIsUpdated;
	}
	public void setProdnameIsUpdated(boolean prodnameIsUpdated) {
		this.prodnameIsUpdated = prodnameIsUpdated;
	}
	public boolean getProdpriceIsUpdated() {
		return prodpriceIsUpdated;
	}
	public void setProdpriceIsUpdated(boolean prodpriceIsUpdated) {
		this.prodpriceIsUpdated = prodpriceIsUpdated;
	}
	public boolean getProddescriptionIsUpdated() {
		return proddescriptionIsUpdated;
	}
	public void setProddescriptionIsUpdated(boolean proddescriptionIsUpdated) {
		this.proddescriptionIsUpdated = proddescriptionIsUpdated;
	}
	public boolean getProdavlIsUpdated() {
		return prodavlIsUpdated;
	}
	public void setProdavlIsUpdated(boolean prodavlIsUpdated) {
		this.prodavlIsUpdated = prodavlIsUpdated;
	}
	public boolean getProdcatIsUpdated() {
		return prodcatIsUpdated;
	}
	public void setProdcatIsUpdated(boolean prodcatIsUpdated) {
		this.prodcatIsUpdated = prodcatIsUpdated;
	}
	public boolean getDisplayCustomerInfo() {
		return displayCustomerInfo;
	}
	public void setDisplayCustomerInfo(boolean displayCustomerInfo) {
		this.displayCustomerInfo = displayCustomerInfo;
	}
	public boolean getCustomerNameUpdated() {
		return customerNameUpdated;
	}
	public void setCustomerNameUpdated(boolean customerNameUpdated) {
		this.customerNameUpdated = customerNameUpdated;
	}
	public boolean getCustomerIsDeleted() {
		return customerIsDeleted;
	}
	public void setCustomerIsDeleted(boolean customerIsDeleted) {
		this.customerIsDeleted = customerIsDeleted;
	}
	public boolean getAppIsSechduled() {
		return appIsSechduled;
	}
	public void setAppIsSechduled(boolean appIsSechduled) {
		this.appIsSechduled = appIsSechduled;
	}
	public boolean getViewAppointment() {
		return viewAppointment;
	}
	public void setViewAppointment(boolean viewAppointment) {
		this.viewAppointment = viewAppointment;
	}
	public boolean getAppReschduled() {
		return appReschduled;
	}
	public void setAppReschduled(boolean appReschduled) {
		this.appReschduled = appReschduled;
	}
	public boolean getAppCanceled() {
		return appCanceled;
	}
	public void setAppCanceled(boolean appCanceled) {
		this.appCanceled = appCanceled;
	}
	public boolean getIsLogedin() {
		return islogedin;
	}
	public void setIsLogedin(boolean islogedin) {
		this.islogedin = islogedin;
	}
	public boolean getValidrequest() {
		return validrequest;
	}
	public void setValidrequest(boolean validrequest) {
		this.validrequest = validrequest;
	}
	public boolean getIsAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public boolean getInstallationReqReceived() {
		return installationReqReceived;
	}
	public void setInstallationReqReceived(boolean installationReqReceived) {
		this.installationReqReceived = installationReqReceived;
	}
	public boolean getValidCommand() {
		return validCommand;
	}
	public void setValidCommand(boolean validCommand) {
		this.validCommand = validCommand;
	}
	public boolean getValidcategory() {
		return validcategory;
	}
	public void setValidcategory(boolean validcategory) {
		this.validcategory = validcategory;
	}
	public boolean getValidProduct() {
		return validProduct;
	}
	public void setValidProduct(boolean validProduct) {
		this.validProduct = validProduct;
	}
	public boolean getIsreviewed() {
		return isreviewed;
	}
	public void setreviewed(boolean isreviewed) {
		this.isreviewed = isreviewed;
	}
	public boolean getIsrated() {
		return israted;
	}
	public void setrated(boolean israted) {
		this.israted = israted;
	}
	public boolean getDisplayreview() {
		return displayreview;
	}
	public void setDisplayreview(boolean displayreview) {
		this.displayreview = displayreview;
	}
	public boolean getDisplayRate() {
		return displayRate;
	}
	public void setDisplayRate(boolean displayRate) {
		this.displayRate = displayRate;
	}
	public boolean getIsupdated() {
		return isupdated;
	}
	public void setIsupdated(boolean isupdated) {
		this.isupdated = isupdated;
	}
	public boolean getIsSignedup() {
		return isSignedup;
	}
	public void setSignedup(boolean isSignedup) {
		this.isSignedup = isSignedup;
	}
	public boolean getInvalidEmail() {
		return invalidEmail;
	}
	public void setInvalidEmail(boolean invalidEmail) {
		this.invalidEmail = invalidEmail;
	}
	public boolean getIncorrectPassword() {
		return incorrectPassword;
	}
	public void setIncorrectPassword(boolean incorrectPassword) {
		this.incorrectPassword = incorrectPassword;
	}
	public boolean getIsempty() {
		return isEmpty;
	}
	public void setIsEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	public boolean getIsadmin() {
		return isadmin;
	}
	public void setIsadmin(boolean isadmin) {
		this.isadmin = isadmin;
	}
	public boolean getIsCustomer() {
		return isCustomer;
	}
	public void setIsCustomer(boolean isCustomer) {
		this.isCustomer = isCustomer;
	}
	public boolean getIsInstaller() {
		return isInstaller;
	}
	public void setIsInstaller(boolean isInstaller) {
		this.isInstaller = isInstaller;
	}

}