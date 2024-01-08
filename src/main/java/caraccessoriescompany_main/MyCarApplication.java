package caraccessoriescompany_main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

import java.util.regex.Pattern;
import java.util.List;
import java.util.regex.Matcher;
import java.util.logging.Logger;
public class MyCarApplication {
	
	private DataArrayList list = new DataArrayList();
	
	private boolean islogedin;
	private boolean invalidEmail;
	private boolean incorrectPassword;
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
	public boolean adminlogin(String email, String password) {
		invalidEmailType(email);
	    if (!invalidEmail) {
		for(User n : DataArrayList.admin) {
	        if(email.equals(n.getEmail()) && n.getPassword().equals(password)) {
	        	
	        	   islogedin = true;
		           break;
	        
	          
	        }
	    }
	    }
		return islogedin;
	}
	
	public boolean adminInvalidEmail(String email) {
		invalidEmailType(email);
	    if (!invalidEmail) {
	        for (User n : DataArrayList.admin) {
	            if (email.equals(n.getEmail())) {
	                islogedin = true;
	                break;
	            }
	        }
	    }

	    return islogedin;
	}
	
	public boolean adminIncorrectPassword(String email, String password) {
		invalidEmailType(email);
	    if (!invalidEmail) {
		for(User n : DataArrayList.admin) {
	        if(email.equals(n.getEmail()) && !password.equals(n.getPassword())) {
	        	incorrectPassword = true;
	           break;
	        }
	    }
		
	}
	    islogedin = !incorrectPassword;
		return islogedin;
	}
	
	
	// Customer sign-in functions
	public boolean customerlogin(String email, String password) {
		invalidEmailType(email);
	    if (!invalidEmail) {
		for(Customer n : list.getCustomers()) {
	        if(email.equals(n.getEmail()) && n.getPassword().equals(password)) {
	           islogedin = true;
	           break;
	        }
	    }
	    }
		return islogedin;
	}
	
	public boolean customerInvalidEmail(String email) {
		
		invalidEmailType(email);
	    if (!invalidEmail) {
	        for (Customer n : list.getCustomers()) {
	            if (email.equals(n.getEmail())) {
	                islogedin = true;
	                break;
	            }
	        }
	    }

	    return islogedin;
	}
	
	public boolean customerIncorrectPassword(String email, String password) {
		invalidEmailType(email);
	    if (!invalidEmail) {
		for(Customer n : list.getCustomers()) {
	        if(email.equals(n.getEmail()) && !password.equals(n.getPassword())) {
	           incorrectPassword = true;
	           break;
	        }
	    }
	    }
	    
	    islogedin = !incorrectPassword;
		return islogedin;
	}
	
	
	// Installer sign-in function
	public boolean installerlogin(String email, String password) {
		invalidEmailType(email);
	    if (!invalidEmail) {
		for(Installer n : DataArrayList.installers) {
	        if(email.equals(n.getEmail()) && n.getPassword().equals(password)) {
	           islogedin = true;
	           break;
	        }
	    }
	    }
		return islogedin;
	}
	
	public boolean installerInvalidEmail(String email) {
		
		invalidEmailType(email);
	    if (!invalidEmail) {
	        for (Installer n : DataArrayList.installers) {
	            if (email.equals(n.getEmail())) {
	                islogedin = true;
	                break;
	            }
	        }
	    }

	    return islogedin;
	}
	
	public boolean installerIncorrectPassword(String email, String password) {
		
		invalidEmailType(email);
	    if (!invalidEmail) {
		for(Installer n : DataArrayList.installers) {
	        if(email.equals(n.getEmail()) && !password.equals(n.getPassword())) {
	           incorrectPassword = true;
	           break;
	        }
	    }
	    }
	    islogedin = !incorrectPassword;
		return islogedin;
	}
	
	
	// User Sign-up functions
	public boolean userSignUp(String email, String password, String username, String phoneNumber) {
		setSignedup(true);
		
		invalidEmailType(email);
	    if (invalidEmail) {
	        setSignedup(false);
	        return getIsSignedup();
	    }
	    for (Customer n : list.getCustomers()) {
	        if (email.equals(n.getEmail()) || username.equals(n.getUsername()) || phoneNumber.equals(n.getPhoneNumber())) {
	            setSignedup(false);
	            return getIsSignedup();
	        }
	    }
	    
	    Customer newUser = new Customer(email, password, username, phoneNumber);
	    list.getCustomers().add(newUser);

	    return getIsSignedup();
	}
	
	
	public boolean existEmail(String email) {
	
		setSignedup(true);
	    if (!invalidEmail) {
	    	
		if(isCustomer(email)) {
	           setSignedup(false);
	        }
	        
		if(isadmin(email)) {
			 setSignedup(false);
		}
		
		if(isInstaller(email)) {
			setSignedup(false);
		}
	    
	    }
		return getIsSignedup();
	}
	
public boolean existUsername(String username) {
		
		setSignedup(true);
		for(Customer n : list.getCustomers()) {
	        if(username.equals(n.getUsername())) {
	           setSignedup(false);
	           break;
	        } 
	    }
	
		return getIsSignedup();
	}

public boolean existPhoneNumber(String phoneNumber) {
	
	setSignedup(true);
	
	for(Customer n : list.getCustomers()) {
        if(phoneNumber.equals(n.getPhoneNumber())) {
           setSignedup(false);
           break;
        } 
    }
	return getIsSignedup();
}

public boolean signupWeakPassword(String email, String password) {
    setSignedup(true);
    boolean isinvalidEmail = invalidEmailType(email);

    if (isinvalidEmail || password.length() < 8) {
        setSignedup(false);
    }

    return getIsSignedup();
}

public boolean invalidEmailType(String email) {
    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(email);
    
    boolean sinvalidEmail = !matcher.matches();
    setSignedup(!sinvalidEmail);

    return sinvalidEmail;
}
	
	// ProductCatalog functions
	public boolean category(String menu) {
		if(menu.equals("category") || menu.equals("Search")) {
			setValidCommand(true);
		}
		return true;
	}
	public boolean categoryName(String name) {
		if (name.equals(in) || name.equals(ex) || name.equals(el)) {
	        setValidcategory(true);
	    }
	    return getValidcategory();
	}
	String in = "Interior";
	String ex = "Exterior";
	String el = "Electronics";
	
	public boolean productName(String categoryName, String productName) {
	if(categoryName.equals(in) || categoryName.equals(ex) || categoryName.equals(el)) {
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
	public boolean userProfile(String command) {
		if(command.equals("My Profile")) {
			setInProfile(true);
		}
		
		return getInProfile();
	}
	public boolean editCommand() {
		setValidCommand(true);
		return getValidCommand();
	}
	
	static final  String EM = "email";
	static final  String PASS = "password";
	static final  String FN = "username";
	static final  String PH = "phoneNumber";
	
	public boolean editField(String email, String fieldName, String update) {
	    boolean emailExists = checkFieldExists(EM, update);
	    boolean usernameExists = checkFieldExists(FN, update);
	    boolean phoneNumberExists = checkFieldExists(FN, update);

	    if (!emailExists) {
	        updateField(EM, email, update);
	    }

	    if (fieldName.equals("Password")) {
	        updatePasswordField(email, update);
	    }

	    if (!usernameExists) {
	        updateField(FN, email, update);
	    }

	    if (!phoneNumberExists) {
	        updateField(PH, email, update);
	    }

	    return getIsupdated();
	}

	private boolean checkFieldExists(String fieldName, String update) {
	    return list.getCustomers().stream()
	            .anyMatch(customer -> getField(customer, fieldName).equals(update));
	}

	private void updateField(String fieldName, String email, String update) {
	    for (Customer customer : list.getCustomers()) {
	        if (customer.getEmail().equals(email) && (!update.equals(getField(customer, fieldName)))) {
	             
	                setField(customer, fieldName, update);
	                setIsupdated(true);
	            
	        }
	    }
	}

	public void updatePasswordField(String email, String update) {
	    if (update != null && !update.isEmpty() && update.length() >= 8) {
	        for (Customer customer : list.getCustomers()) {
	            if (customer.getEmail().equals(email)) {
	                customer.setPassword(update);
	                setIsupdated(true);
	            }
	        }
	    }
	}
	
	public String getField(Customer customer, String fieldName) {
	    switch (fieldName) {
	        case EM:
	            return customer.getEmail();
	        case FN:
	            return customer.getUsername();
	        case PH:
	            return customer.getPhoneNumber();
	        default:
	            return " ";
	    }
	}

	public void setField(Customer customer, String fieldName, String value) {
	    switch (fieldName) {
	        case EM:
	            customer.setEmail(value);
	            break;
	        case FN:
	            customer.setUsername(value);
	            break;
	        case PH:
	            customer.setPhoneNumber(value);
	            break;
            default: break;
	    }
	}
	
		
	public void addProductToCustomerArray(String email, String prodName) {
	    for (Customer customer : list.getCustomers()) {
	        if (email.equals(customer.getEmail())) {
	            for (Product product : list.getProducts()) {
	                if (prodName.equals(product.getProductName())) {
	                    List<String> customerOrders = customer.getOrders();

	                    customerOrders.add("Product name: " + prodName);
	                    customerOrders.add("Price: " + product.getPrice()); // Assuming getPrice returns a numeric value
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
	                // Ensure that there are enough elements in the list before accessing them
	                if (i + 2 < customerOrders.size()) {
	                    String formattedOrder = String.format("%d. %s %s %s", 
	                                                          orderNumber, 
	                                                          customerOrders.get(i), 
	                                                          customerOrders.get(i + 1), 
	                                                          customerOrders.get(i + 2));
	                    logger.info(formattedOrder);
	                    orderNumber++;
	                }
	            }
	            logger.info("\n");
	        } else {
	            logger.info("No orders");
	        }
	    } else {
	        logger.info("Customer not found with email: " + email);
	    }
	}

	

	public boolean displayInstallationRequests(String email) {
	    boolean displayList = false;
	    Customer customer = findCustomerByEmail(email);

	    if (customer != null) {
	        List<String> customerRequests = customer.getRequest();

	        if (!customerRequests.isEmpty()) {
	            int requestNumber = 1;

	            for (int i = 0; i < customerRequests.size(); i += 4) {
	                // Check if there are enough elements in the list to avoid IndexOutOfBoundsException
	                if (i + 3 < customerRequests.size()) {
	                    String formattedRequest = String.format("%d. %s %s %s %s", 
	                                                             requestNumber, 
	                                                             customerRequests.get(i), 
	                                                             customerRequests.get(i + 1), 
	                                                             customerRequests.get(i + 2), 
	                                                             customerRequests.get(i + 3));
	                    logger.info(formattedRequest);
	                    requestNumber++;
	                }
	            }
	            logger.info("\n");
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
	
	public boolean deleteProd(String prodName) {
		java.util.Iterator<Product> iterator = list.getProducts().iterator();
	    

	    while (iterator.hasNext()) {
	    	Product product = iterator.next();
	        if (product.getProductName().equals(prodName)) {
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
        if(parsedPrice >=0) {
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
	            iterator.remove();
	            setCustomerIsDeleted(true);
	            break;
	        }
	    }
	    
	    return getCustomerIsDeleted();
	}
	
		
		
	public boolean review(String prodName,String review) {
		for(Product n : list.getProducts()) {
	        if(prodName.equals(n.getProductName()) && !review.isEmpty()) {
	        	
	        		n.setReview(review);
		        	setreviewed(true);
		        	break;
	        	
	        }
	        }
		return getIsreviewed();
	}
	
	public boolean rated(String prodName,int rate) {
		for(Product n : list.getProducts()) {
	        if(prodName.equals(n.getProductName()) && rate <= 5 && rate >= 0) {
	        	
	        		n.setRating(rate);
	        		setrated(true);
		        	break;
	        	
	        }
	        }
		return getIsrated();
	}
	
	
	
	public boolean dispalyreview(String prodName) {
		for(Product n : list.getProducts()) {
	        if(prodName.equals(n.getProductName())) {
	        		displayreview = true;
	        	}
	        }
	        return displayreview;
	}
	public boolean dispalyRate(String prodName) {
		for(Product n : list.getProducts()) {
	        if(prodName.equals(n.getProductName()) && n.getRating() >= 0 && n.getRating() <= 5) {
	        	
	        		displayRate = true;
	        	
	        	}
	        }
	        return displayRate;
	}
	public boolean request(String username, String email, String carModel, String descriptions , String date) {
		
		for(Customer u : list.getCustomers()) {
	        	if(email.equals(u.getEmail()) && username.equals(u.getUsername()) && !carModel.isEmpty() && !descriptions.isEmpty() && !date.isEmpty()) {
	        		

	                		u.getRequest().add(carModel);
	                		u.getRequest().add(descriptions);
	                		u.getRequest().add(date);
	                	
	            	}
	        		validrequest = true;
	        		
	        	}
		return validrequest;
        	}
	
		
	
	public boolean instAvalibilty(String username) {
		for(Installer installer: DataArrayList.installers) {
			if(username.equals(installer.getUsername()) && installer.getInstallerAvalibilty().equals("Available")) {
				
					setAvailable(true);
				
			}
		}
		return getIsAvailable();
	}

	public void printadminMenu() {
		logger.info("\tWelcome admin");
		logger.info("1.admin Dashboard");
		logger.info(signOut);
		
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
		logger.info(signOut);
	}
	public void printInstallerMenu() {
		logger.info("1.My Installation requests and Schedule Appointments");
		logger.info(signOut);
	}
	
	
	
	
	public void printTheProducts(int cat) {
		for (Product p : list.getProducts()) {
		    if (cat == 1 || (cat == 2 && p.getCategory().equals("Interior"))
		            || (cat == 3 && p.getCategory().equals("Exterior"))
		            || (cat == 4 && p.getCategory().equals("Electronic"))) {
	            logger.info(PRONAME+ p.getProductName());
	            logger.info("productDescription: "+ p.getDescription());
	            logger.info("productPrice: "+ p.getPrice());
	            logger.info("productAvailability: "+ p.getAvailability());
	            logger.info("productCategory: "+ p.getCategory());
	            logger.info("////////////////////////////////////////////////////");
	        }
	    }
	}

	String signOut = "0.Sign out";
	
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
			logger.info(index + ". " + cat.getCatName());
			index++;
			}
		
	}
	public void printUsers() {
	    logger.info("customers:");
	    int i = 1;

	    for(Customer n : list.getCustomers()) {
	        String customerInfo = String.format("%d. %s", i, n.getUsername());
	        logger.info(customerInfo);
	        logger.info("/////////////////////////////////////////////////////");
	        i++;
	    }

	    for(Installer J : DataArrayList.installers) {
	        String installerInfo = String.format("%d. %s", i, J.getUsername());
	        logger.info(installerInfo);
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
			if(ap.getDate().equals(date)) {
				setViewAppointment(true);
			}

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
	
	
	public boolean appCancel(String cusName, String date, String insName) {
		for(Appointment ap:list.getAppointment()) {
			if(ap.getCusName().equals(cusName) && ap.getDate().equals(date) && ap.getInsName().equals(insName)) {
				list.getAppointment().remove(ap);
				setAppCanceled(true);
				
			}
		}
		return getAppCanceled();
	}
	
	
	
	
	
	public boolean viewInstallerSchedule(String insName) {
	    Installer installer = findInstallerByName(insName);

	    if (installer == null) {
	        return false;
	    }

	    List<String> installerSchedule = installer.getschedule();
	    sortInstallerSchedule(installerSchedule);

	    displayInstallerSchedule(installerSchedule);

	    return true;
	}

	public Installer findInstallerByName(String insName) {
	    for (Installer installer : DataArrayList.installers) {
	        if (insName.equals(installer.getUsername())) {
	            return installer;
	        }
	    }
	    return null;
	}

	public void sortInstallerSchedule(List<String> installerSchedule) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    Collections.sort(installerSchedule, (str1, str2) -> {
	        if (isDate(str1, dateFormat) && isDate(str2, dateFormat)) {
	            try {
	                Date date1 = dateFormat.parse(str1);
	                Date date2 = dateFormat.parse(str2);
	                return date1.compareTo(date2);
	            } catch (ParseException e) {
	                // Adjust the log level and message according to your logger's capabilities
	                logger.info("Unable to parse dates: " + str1 + " and " + str2);
	                return 0;
	            }
	        }
	        // If not both are dates, compare as strings
	        return str1.compareTo(str2);
	    });
	}




	public void displayInstallerSchedule(List<String> installerSchedule) {
	    int index = 1;

	    for (int i = 0; i < installerSchedule.size(); i += 3) {
	        // Check if there are enough elements in the list to avoid IndexOutOfBoundsException
	        if (i + 2 < installerSchedule.size()) {
	            String formattedSchedule = String.format("%d. %s %s %s", 
	                                                     index, 
	                                                     installerSchedule.get(i), 
	                                                     installerSchedule.get(i + 1), 
	                                                     installerSchedule.get(i + 2));
	            logger.info(formattedSchedule);
	        } else {
	            // Handle the case where the remaining elements are less than 3
	            StringBuilder partialSchedule = new StringBuilder(index + ".");
	            for (int j = i; j < installerSchedule.size(); j++) {
	                partialSchedule.append(" ").append(installerSchedule.get(j));
	            }
	            logger.info(partialSchedule.toString());
	        }
	        index++;
	    }
	    logger.info("\n");
	}

	public boolean isDate(String str, SimpleDateFormat dateFormat) {
	    try {
	        dateFormat.parse(str);
	        return true;
	    } catch (ParseException e) {
	        return false;
	    }
	}

	
	
	static final String PRONAME = "productName: ";
	public boolean orderIsPlacedBy(String email, String prodname, String status) {
	   

	    for (Customer customer : list.getCustomers()) {
	        if (email.equals(customer.getEmail())) {
	            for (Product product : list.getProducts()) {
	                if (prodname.equals(product.getProductName())) {
	                    
	                    List<String> inbox = customer.getInbox();
	                    

	                    if ("Confirm".equals(status)) { // Use equals() for string comparison
	                    	inbox.add(PRONAME + product.getProductName());
	                    	inbox.add("Price: " + product.getPrice());
	                    	inbox.add("category: " + product.getCategory());
	                        sendEmail = true; // Set sendEmail to true if the status is "Confirm"
	                        
	                    }
	                    
	                    
	                    break; // Exit the product loop once a match is found
	                }
	            }
	        }
	    }

	    return sendEmail;
	}
	
	public boolean getOrderIsPlacedBy(String email) {
	    for (Customer customer : list.getCustomers()) {
	        if (email.equals(customer.getEmail())) {
	            List<String> inbox = customer.getInbox();
	            int index = 1;

	            for (int i = 0; i < inbox.size(); i += 3) {
	                // Check if there are enough elements in the list to avoid IndexOutOfBoundsException
	                if (i + 2 < inbox.size()) {
	                    String formattedInboxEntry = String.format("%d. %s %s %s", 
	                                                               index, 
	                                                               inbox.get(i), 
	                                                               inbox.get(i + 1), 
	                                                               inbox.get(i + 2));
	                    logger.info(formattedInboxEntry);
	                } else {
	                    // Handle the case where the remaining elements are less than 3
	                    StringBuilder partialInboxEntry = new StringBuilder(index + ".");
	                    for (int j = i; j < inbox.size(); j++) {
	                        partialInboxEntry.append(" ").append(inbox.get(j));
	                    }
	                    logger.info(partialInboxEntry.toString());
	                }
	                index++;
	            }
	            logger.info("\n");
	            return true; 
	        }
	    }
	    return false;
	}


	
	
	public boolean getAnInsallationReqFot(String name) {
		for(Installer n:DataArrayList.installers) {
			if(n.getUsername().equals(name) && n.getInstallerAvalibilty().equals("Available")) {
				installationReqReceived=true;
			}
		}
		return installationReqReceived;
	}
	
	public boolean isproductNameExist(String prodName) {
		for(Product p : list.getProducts()) {
	        if(prodName.equals(p.getProductName())) {
	        	setProdIsExist(true);
	           break;
	        } 
	    }
		return getProdIsExist();
	}	
	public boolean iscategoryNameExist(String catName) {
		for (Category s : list.getCategories()) {
	        if (s.getCatName().equals(catName)) {
	        	setCatIsExist(true);
	            break; 
	        } 
	    }
		return getCatIsExist();
	}	
	static final String BEFORE = "BEFORE ";
	public void changeUsernameforCust(String email, String nname) {
		for(Customer c : list.getCustomers()) {
			logger.info(BEFORE + c.getUsername());
	        if(email.equals(c.getEmail())) {
	        	c.setUsername(nname);
	        	logger.info(c.getUsername());
	           break;
	        } 
	        
	    }
	}
	public void changePasswordforCust(String email, String nPass) {
		for(Customer c : list.getCustomers()) {
			logger.info(BEFORE + c.getPassword());
	        if(email.equals(c.getEmail())) {
	        	c.setPassword(nPass);
	        	logger.info(c.getPassword());
	           break;
	        } 
	        
	    }
	}
	public void changePhoneforCust(String email, String nPhone) {
		for(Customer c : list.getCustomers()) {
			logger.info(BEFORE + c.getPhoneNumber());
	        if(email.equals(c.getEmail())) {
	        	c.setPhoneNumber(nPhone);
	        	logger.info(c.getPhoneNumber());
	           break;
	        } 
	        
	    }
	}
	
	
	public void addReq(String email, String prodname, String carModel, String installer, String date) {
	    Customer customer = findCustomerByEmaill(email);

	    if (customer == null) {
	        logger.info(String.format("Customer not found with email: %s", email));
	        return;
	    }

	    Product product = findProductByName(prodname);

	    if (product == null) {
	        logger.info(String.format("Product not found with name: %s", prodname));
	        return;
	    }

	    Installer selectedInstaller = findInstallerByNamee(installer);

	    if (selectedInstaller == null) {
	        logger.info("No installer with this name! Re-enter new order with a valid Installer");
	        return;
	    }

	    if (isDateBookedd(selectedInstaller.getschedule(), date)) {
	        logger.info("Installer is busy on the selected date.");
	        return;
	    }

	    addRequestToCustomer(customer, prodname, carModel, installer, date);
	    addRequestToInstaller(selectedInstaller, customer.getUsername(), prodname, date);
	}


	public Customer findCustomerByEmaill(String email) {
	    return list.getCustomers().stream()
	            .filter(c -> email.equals(c.getEmail()))
	            .findFirst()
	            .orElse(null);
	}

	public Product findProductByName(String prodname) {
	    return list.getProducts().stream()
	            .filter(p -> prodname.equals(p.getProductName()))
	            .findFirst()
	            .orElse(null);
	}

	public Installer findInstallerByNamee(String installerName) {
	    return DataArrayList.installers.stream()
	            .filter(installer -> installerName.equals(installer.getUsername()))
	            .findFirst()
	            .orElse(null);
	}

	public void addRequestToCustomer(Customer customer, String prodname, String carModel, String installer, String date) {
	    List<String> customerRequest = customer.getRequest();
	    customerRequest.add(PRONAME + prodname);
	    customerRequest.add("carModel: " + carModel);
	    customerRequest.add("installerName: " + installer);
	    customerRequest.add("preferredDate: " + date);
	}

	public void addRequestToInstaller(Installer installer, String customerName, String prodname, String date) {
	    List<String> installerRequest = installer.getschedule();
	    installerRequest.add("customerName: " + customerName);
	    installerRequest.add(PRONAME + prodname);
	    installerRequest.add("preferredDate: " + date);
	}

	public boolean isDateBookedd(List<String> installerSchedule, String date) {
	    return installerSchedule.contains("Preferred Date: " + date);
	}

	

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
