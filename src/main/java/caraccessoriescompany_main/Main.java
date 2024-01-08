package caraccessoriescompany_main;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
	MyCarApplication obj = new MyCarApplication();
	private static final Logger logger = Logger.getLogger(Main.class.getName());
	public static void main(String[] args) {
	
		Main mn = new Main();	
		mn.start();
	
}
	String emailMsg = "Enter your email: ";
	public void printMenu() {
		logger.info("\t Menu");
        logger.info("1.Sign in");
        logger.info("2.Sign up");
	}
	
	public void start() {
	    Scanner input = new Scanner(System.in);
	    int choice;

	    do {
	        printMenu();
	        logger.info("Enter your choice (0 to exit): ");
	        choice = input.nextInt();
	        input.nextLine();

	        switch (choice) {
	            case 1:
	                logger.info(emailMsg);
	                String idEmail = input.nextLine();
	                if (obj.isadmin(idEmail)) {
	                    adminSignInMenu(idEmail);
	                } else if (obj.isCustomer(idEmail)) {
	                    customerSignInMenu(idEmail);
	                } else if (obj.isInstaller(idEmail)) {
	                    installerSignInMenu(idEmail);
	                }
	                break;
	            case 2:
	                signUp();
	                break;
	            case 0:
	                logger.info("Exiting...");
	                break;
	            default:
	                logger.info("Invalid choice. Please try again.");
	        }
	    } while (choice != 0);
	}
	public String adminSignInMenu(String email) {
	    Scanner stringInput = new Scanner(System.in);

	    do {
	        String emailInvalid = "Invalid email!, re-Enter your email: ";
	        String passwordMsg = "Enter your password: ";
	        String passwordInvalid = "Incorrect password!, re-Enter your password: ";
	        String prName = "Enter product name: ";
	        String prExist = "The Product is not exist !";
	        String prisExist = "The Product is exist !";
	        String prodEnter = "Enter the product name that you want to edit:";
	        String editSuccess = "Edit Done Successfully :)";
	        String catExist = "The category is not exist !";
	        String userNotExist = "The user does not exist";

	        obj.invalidEmailType(email);

	        if (obj.getInvalidEmail()) {
	            logger.info(emailInvalid);
	        }

	        logger.info(passwordMsg);
	        String password = stringInput.nextLine();

	        obj.adminIncorrectPassword(email, password);
	        if (!obj.getIsLogedin()) {
	            logger.info(passwordInvalid);
	            password = stringInput.next();
	        }

	        obj.adminlogin(email, password);
	        if (obj.getIsLogedin()) {
	        	int adminChoice;
	            do {
	                obj.printadminMenu();
	                 adminChoice = stringInput.nextInt();
	                switch (adminChoice) {
	                    case 1:
	                        adminCase1(stringInput, prName, prExist, prodEnter, editSuccess, catExist, userNotExist);
	                        break;
	                    case 0:
	                        obj.printadminMenu();
	                        break;
	                    default:
	                        logger.info("Invalid Choice");
	                }
	            } while (adminChoice != 0);
	        }
	    } while (obj.getInvalidEmail());

	    return email;
	}
	private void adminCase1(Scanner stringInput, String prName, String prExist, String prodEnter, String editSuccess, String catExist, String userNotExist) {
	    stringInput.nextLine();
	    obj.printadminDashoard();
	    logger.info("Enter your choice: ");
	    int innerAdmin = stringInput.nextInt();
	    switch (innerAdmin) {
	        case 1:
	            adminInnerCase1(stringInput, prName, prExist, prodEnter, editSuccess);
	            break;
	        case 2:
	        	adminInnerCase2(stringInput);
	            break;
	        case 3:
	        	adminInnerCase3(stringInput,prExist);
	        	break;
	        case 4:
	        	adminInnerCase4(stringInput, catExist);
	        	break;
	        case 5:
	        	adminInnerCase5(stringInput, catExist);
	        	break;
	        case 6:
	        	adminInnerCase6(stringInput, catExist);
	        	break;
	        case 7:
	        	adminInnerCase7(stringInput, userNotExist);
	        	break;
	        case 8:
	        	adminInnerCase8(stringInput, userNotExist);
	        	break;
	        case 0:
	            obj.printadminMenu();
	            break;
	        default:
	            logger.info("Invalid Choice");
	    }
	}

	private void adminInnerCase1(Scanner stringInput, String prName, String prExist, String prodEnter, String editSuccess) {
	    stringInput.nextLine();
	    logger.info(prName);
	    String prodName = stringInput.nextLine();
	    obj.isproductNameExist(prodName);

	    if (obj.getProdIsExist()) {
	        logger.info("The product is exist");
	    } 
	    else {
	        logger.info("Enter Product description: ");
	        String description = stringInput.nextLine();

	        logger.info("Enter Product price: ");
	        String price = stringInput.nextLine();
	        price = price + "$";

	        logger.info("Enter Product availability: ");
	        String availability = stringInput.nextLine();
	        
	        
	        logger.info("Enter Product category: ");
	        String category = stringInput.nextLine();
	        if(!obj.iscategoryNameExist(category)) {
	        	logger.info("Category does not exist");
	        	logger.info("The add operation is failed");
	        }
	        else {
	        	 obj.addProduct(prodName, description, price, availability, category);
	        	 logger.info("Add Done Successfully");
	        }

	    }

	    obj.printTheProducts(1);
	}
	private void adminInnerCase2(Scanner stringInput) {
	    stringInput.nextLine();
	    obj.printTheProducts(1);
	    logger.info("Enter Product name that you want to edit: ");
	    String editProductName = stringInput.nextLine();
	    obj.isproductNameExist(editProductName);

	    if (!obj.getProdIsExist()) {
	        logger.info("The Product does not exist !");
	    } 
	    else {
	        obj.printEditChoices();
	        logger.info("What do you want to edit?: ");
	        int innerInnerChoice = stringInput.nextInt();
	        stringInput.nextLine();
	        switch (innerInnerChoice) {
	            case 1:
	                logger.info("Enter new product name: ");
	                String newProductName = stringInput.nextLine();
	                obj.updateProdName(editProductName, newProductName);
	                logger.info("Edit Done Successfully");
	                break;
	            case 2:
	                logger.info("Enter new product Description: ");
	                String newProductDesc = stringInput.nextLine();
	                obj.updateProdDescription(newProductDesc, editProductName);
	                logger.info("Edit Done Successfully");
	                break;
	            case 3:
	                logger.info("Enter new product Price: ");
	                String newProductPrice = stringInput.nextLine();
	                obj.updateProdPrice(newProductPrice, editProductName);
	                logger.info("Edit Done Successfully");
	                break;
	            case 4:
	                logger.info("Enter new product Availability: ");
	                String newProductAvail = stringInput.nextLine();
	                obj.updateProdAvailability(newProductAvail, editProductName);
	                logger.info("Edit Done Successfully");
	                break;
	            case 5:
	                logger.info("Enter new product Category: ");
	                String newProductCategory = stringInput.nextLine();
	                if(!obj.iscategoryNameExist(newProductCategory)) {
	    	        	logger.info("Category does not exist");
	    	        	logger.info("The edit operation is failed");
	    	        }
	    	        else {
	    	        	 obj.updateProdcategory(newProductCategory, editProductName);
	    	        	 logger.info("Edit Done Successfully");
	    	        }
	                break;
	            default:
	                logger.info("Invalid Choice");
	        }
	        obj.printTheProducts(1);
	    }
	}
	private void adminInnerCase3(Scanner stringInput, String prExist) {
	    stringInput.nextLine();
	    obj.printTheProducts(1);
	    logger.info("Enter Product name that you want to delete: ");
	    String delProductName = stringInput.nextLine();
	    obj.isproductNameExist(delProductName);

	    if (!obj.getProdIsExist()) {
	        logger.info(prExist);
	    } else {
	        obj.deleteProd(delProductName);
	        logger.info("The Product Deleted Successfully");
	        obj.printTheProducts(1);
	    }

	    logger.info("\n");
	    obj.printadminDashoard();
	}
	private void adminInnerCase4(Scanner stringInput, String catExist) {
	    stringInput.nextLine();
	    logger.info("Enter new category name: ");
	    String category = stringInput.nextLine();
	    obj.iscategoryNameExist(category);

	    if (obj.getCatIsExist()) {
	        logger.info("The category already exists!");
	    } else {
	        obj.addCategory(category);
	        logger.info("The category added successfully!");
	    }

	    obj.printCat();
	    logger.info("\n");
	}
	private void adminInnerCase5(Scanner stringInput, String catExist) {
	    stringInput.nextLine();
	    obj.printCat();
	    logger.info("Enter category name that you want to edit: ");
	    String editCategory = stringInput.nextLine();
	    obj.iscategoryNameExist(editCategory);

	    if (!obj.getCatIsExist()) {
	        logger.info(catExist);
	    } else {
	        logger.info("Enter the new category name:");
	        String newCategory = stringInput.nextLine();
	        obj.editCat(editCategory, newCategory);
	        logger.info("The category has been edited successfully");
	    }

	    obj.printCat();
	    logger.info("\n");
	}
	private void adminInnerCase6(Scanner stringInput, String catExist) {
	    stringInput.nextLine();
	    obj.printCat();
	    logger.info("Enter the category that you want to delete: ");
	    String delCategory = stringInput.nextLine();
	    obj.iscategoryNameExist(delCategory);

	    if (!obj.getCatIsExist()) {
	        logger.info(catExist);
	    } else {
	        obj.deleteCat(delCategory);
	        logger.info("The category deleted successfully");
	    }

	    obj.printCat();
	    logger.info("\n");
	}
	private void adminInnerCase7(Scanner stringInput, String userNotExist) {
	    stringInput.nextLine();
	    obj.printUsers();
	    logger.info("Enter user username");
	    String customerUsername = stringInput.nextLine();
	    obj.selectCustomerAcc(customerUsername);

	    if (!obj.getDisplayCustomerInfo()) {
	        logger.info(userNotExist);
	    } else {
	    	
	        logger.info("Enter New username: ");
	        String newUsername = stringInput.nextLine();
	        obj.changeCustomerUsername(customerUsername, newUsername);
	        logger.info("Username changed successfully");
	    }

	}
	private void adminInnerCase8(Scanner stringInput, String userNotExist) {
	    stringInput.nextLine();
	    obj.printUsers();
	    logger.info("Enter user username");
	    String delUsername = stringInput.nextLine();
	    obj.selectCustomerAcc(delUsername);

	    if (!obj.getDisplayCustomerInfo()) {
	        logger.info(userNotExist);
	    } else {
	        obj.deleteCustomerAcc(delUsername);
	        logger.info("User deleted successfully");
	    }
	}
	
	public String customerSignInMenu(String email) {
	    Scanner stringInput = new Scanner(System.in);

	    String emailInvalid = "Invalid email!, re-Enter your email: ";
	    String password;

	    do {
	        obj.invalidEmailType(email);

	        if (obj.getInvalidEmail()) {
	            logger.info(emailInvalid);
	        }

	        String passwordMsg = "Enter your password: ";
	        String passwordInvalid = "Incorrect password!, re-Enter your password: ";
//	        String prName = "Enter product name: ";
	        String prExist = "The Product is not exist !";
	        String prisExist = "The Product is exist !";
	        logger.info(passwordMsg);
	        password = stringInput.nextLine();

	        obj.customerIncorrectPassword(email, password);
	        if (!obj.getIsLogedin()) {
	            logger.info(passwordInvalid);
	            password = stringInput.next();
	        }
	        obj.customerlogin(email, password);
	        if (obj.isCustomer(email)) {
	            int customerChoice;
	            do {
	                obj.printCustomerMenu();
	                customerChoice = stringInput.nextInt();

	                switch (customerChoice) {
	                    case 1:
	                    	customerChoice1(stringInput, prExist, email);
	                        break;
	                    case 2:
	                    	customerChoice2(stringInput, prExist, email);
	                        break;
	                    case 3:
//	                       obj.getCus
	                        break;
	                    case 4:
	                        obj.getOrderIsPlacedBy(email);
	                        break;
	                    case 0:
	                        break;
	                    default:
	                        logger.info("Invalid Choice");
	                }

	            } while (customerChoice != 0);

	        }
	    } while (obj.getInvalidEmail());

	    return email;
	}
	private void customerChoice1(Scanner stringInput, String prExist, String email) {
		logger.info("1.All Products");
		logger.info("2.Interior Products");
		logger.info("3.Exterior Products");
		logger.info("4.Electronic Products");
		logger.info("Enter category you want");
		
		logger.info("Enter your choice: ");
		int innerCustomer = stringInput.nextInt();
		if(innerCustomer == 1) {
		switch(innerCustomer) {
		case 1:
			stringInput.nextLine();
			obj.printTheProducts(1);
			logger.info("Enter Product name you want to buy: ");
			String productName = stringInput.nextLine(); 
	        obj.isproductNameExist(productName);
	        if(!obj.getProdIsExist()) {
	            logger.info(prExist);
	        } else {
	        	logger.info("Enter Car Model: ");
                String carModel = stringInput.nextLine();
                logger.info("Enter Installer name: ");
                String instName = stringInput.nextLine();
                logger.info("Enter Date: ");
                String date = stringInput.nextLine();                                    
	            obj.addProductToCustomerArray(email, productName);
	            obj.addReq(email, productName, carModel, instName, date);
	            logger.info("The Product is purchased successfully !");
	        }
	}
		}
	}
	private void customerChoice2(Scanner stringInput, String prName, String email) {
	    int innerchoice;
	    do {
	    	logger.info("1.My Orders");
			logger.info("2.My Requests");
			logger.info("3.Manage my account");
			logger.info("4.Inbox");
			logger.info("0.Back");
	        innerchoice = stringInput.nextInt();

	        switch (innerchoice) {
	            case 1:
	              stringInput.nextLine();
                  obj.displayCustomerOrders(email);
                  logger.info("Do you want to confirm any order ?: ");
                  String YesOrNo = stringInput.nextLine();
                  if(YesOrNo.equals("Yes")) {
                  	logger.info(prName);
                  	 String productName = stringInput.nextLine();
                          String conf;
                          logger.info("Enter Confirm: ");
                          conf = stringInput.nextLine();
                          if(conf.equals("Confirm")) {
                          	obj.orderIsPlacedBy(email, productName, conf);                	
                          }
                  }
	                break;
	                
	            case 2:
	                obj.displayInstallationRequests(email);
	                break;
	            case 3:
	            	handleCustomerAccountManagement(stringInput, email);
	                break;
	            case 4:
	            	obj.getOrderIsPlacedBy(email);
	                break;
	            default:
	                logger.info("Invalid Choice");
	        }

	    } while (innerchoice != 0);
	}
	private void handleCustomerAccountManagement(Scanner stringInput, String email) {
	    int accountchoice;
	    do {
	    	logger.info("1.Change my username");
			logger.info("2.Change my password");
			logger.info("3.Change my phone number");
			logger.info("0.Back");
	        accountchoice = stringInput.nextInt();

	        switch (accountchoice) {
	            case 1:
	                logger.info("Enter new username: ");
	                String nusername = stringInput.next();
	                obj.changeUsernameforCust(email, nusername);
	                logger.info("Username changed successfully");
	                break;
	            case 2:
	                logger.info("Enter new password: ");
	                String newpassword = stringInput.next();
	                obj.changePasswordforCust(email, newpassword);
	                logger.info("Password changed successfully");
	                break;
	            case 3:
	                logger.info("Enter new phone number: ");
	                String newPhone = stringInput.next();
	                obj.changePhoneforCust(email, newPhone);
	                logger.info("Phone number changed successfully");
	                break;
	            case 0:
	                break;
	            default:
	                logger.info("Invalid Choice");
	        }

	    } while (accountchoice != 0);
	}
	
	public String installerSignInMenu(String email) {
		Scanner stringInput = new Scanner(System.in);
		  
	    String emailInvalid = "Invalid email!, re-Enter your email: ";
	    String password;

	    do {
	        obj.invalidEmailType(email);

	        if (obj.getInvalidEmail()) {
	            logger.info(emailInvalid);
	        }
	        
	        String passwordMsg = "Enter your password: ";
	        String passwordInvalid = "Incorrect password!, re-Enter your password: ";
	        logger.info(passwordMsg);
	        password = stringInput.nextLine();
	        
	        obj.installerIncorrectPassword(email, password);
	        if(!obj.getIsLogedin()) {
	        	logger.info(passwordInvalid);
	        	password = stringInput.next();
	        }
	        obj.installerlogin(email, password);
	        if(obj.isInstaller(email)) {
	        	obj.printInstallerMenu();
	        	int installerChoice = stringInput.nextInt();
	        	if(installerChoice == 1) {
	        		String[] usernameSplit = email.split("@");
        			String un = usernameSplit[0];
        			obj.viewInstallerSchedule(un);
        			installerChoice = stringInput.nextInt();
	        		
        			if(installerChoice == 0) {            			
            			obj.setIsInstaller(false);            			
            		}           		 	
            		obj.printInstallerMenu();
            		installerChoice = stringInput.nextInt();
                   
                    
                }
                
	        }        
	    } while (obj.getInvalidEmail());
	   

	    return email;
	}
	
	public void signUp() {
		String emailInvalid = "Invalid email!, re-Enter your email: ";
		logger.info(emailMsg);
		Scanner scan = new Scanner(System.in);
    	String upEmail = scan.nextLine();
    	obj.invalidEmailType(upEmail);
    	if (obj.getInvalidEmail()) {
	        logger.info(emailInvalid);
	    } 
    	else {
    		obj.existEmail(upEmail);
    		if (!obj.getIsSignedup()) {
	            logger.info("Exist email!, re-Enter non exist email: ");
	        }
    		logger.info("Enter password the password must have at least 8 characters: ");
	        String password = scan.nextLine();
	        obj.signupWeakPassword(upEmail, password);

	        if (!obj.getIsSignedup()) {
	            logger.info("Weak password!, re-Enter Stronger password: ");
	        }

	        logger.info("Enter username: ");
	        String username = scan.nextLine();
	        obj.existUsername(username);

	        if (!obj.getIsSignedup()) {
	            logger.info("Exist username!, re-Enter non exist username: ");
	        }

	        logger.info("Phone Number: ");
	        String phoneNumber = scan.nextLine();
	        obj.existPhoneNumber(phoneNumber);

	        if (!obj.getIsSignedup()) {
	            logger.info("Exist Phone Number!, re-Enter non exist Phone Number: ");
	        } else {
	            obj.userSignUp(upEmail, password, username, phoneNumber);

	            if (obj.getIsSignedup()) {
	            	printMenu();
	                obj.setSignedup(false);
	            }
	        }
	    }
	}


	}
