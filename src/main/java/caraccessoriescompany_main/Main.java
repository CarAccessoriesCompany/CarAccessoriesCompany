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
	    
	    printMenu();
	   
	    do {
	    	
	        logger.info("Enter your choice (0 to exit): ");
	        choice = input.nextInt();
	        input.nextLine();
	        switch (choice) {
	            case 1: 
	            	logger.info(emailMsg);
	            	String idEmail = input.nextLine();
	            	if(obj.isadmin(idEmail)) {
	            		 adminSignInMenu(idEmail);
	            	}
	            	else if(obj.isCustomer(idEmail)) {
	            		customerSignInMenu(idEmail);
	            	}
	            	else if(obj.isInstaller(idEmail)) {
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
	  
	    String emailInvalid = "Invalid email!, re-Enter your email: ";
	    String password;

	    do {
	        obj.invalidEmailType(email);

	        if (obj.getInvalidEmail()) {
	            logger.info(emailInvalid);
	        }
	        
	        String passwordMsg = "Enter your password: ";
	        String passwordInvalid = "Incorrect password!, re-Enter your password: ";
	        String prName = "Enter product name: ";
	        String prExist = "The Product is not exist !";
	        String prodEnter = "Enter the product name that you want to edit:";
	        String editSuccess = "Edit Done Successfully :)";
	        String catExist = "The category is not exist !";
	        String userNotExist = "The user does not exist";
	        logger.info(passwordMsg);
	        password = stringInput.nextLine();
	        
	        obj.adminIncorrectPassword(email, password);
	        if(!obj.getIsLogedin()) {
	        	logger.info(passwordInvalid);
	        	password = stringInput.next();
	        }
	        obj.adminlogin(email, password);
	        if(obj.getIsLogedin()) {
	        	obj.printadminMenu();
	        	int adminChoice = stringInput.nextInt();
	        	if(adminChoice == 1) {
	        		obj.printadminDashoard();
	        		logger.info("Enter your choice: ");
	        		int innerAdmin = stringInput.nextInt();
	        		switch(innerAdmin) {
	        		case 1:
	        			stringInput.nextLine();
	        			logger.info(prName);
	        			String prodName = stringInput.nextLine();
                		obj.isproductNameExist(prodName);
                		
                		if(obj.getProdIsExist()) {
                			logger.info(prExist);
                		}
                		else {
                			logger.info("Enter Product description: ");
							String description = stringInput.nextLine();
							
							logger.info("Enter Product price: ");
							String price = stringInput.nextLine();
							price = price + "$";
							
							logger.info("Enter Product avalibilty: ");
							String avalibilty = stringInput.nextLine();
							logger.info("Enter Product category: ");
							
							String category = stringInput.nextLine();
							obj.addProduct(prodName,description, price, avalibilty, category );
							logger.info("Add Done Successfully");	
                		}
						obj.printTheProducts(1);
						obj.printadminDashoard();
						break;
	        		case 2:
	        			  obj.printEditChoices();
		        		    logger.info("What do you want to edit?: ");
		        		    int innerInnerChoice = stringInput.nextInt();
		        		    
		        		    stringInput.nextLine();
		        		    
		        		    if(innerInnerChoice == 1) {
		        		        obj.printTheProducts(1);
		        		        logger.info(prodEnter);
		        		        String prodnm = stringInput.nextLine();
		        		        obj.isproductNameExist(prodnm);
		        		        if(!obj.getProdIsExist()) {
		        		            logger.info(prExist);
		        		        }
		        		        else {
		        		            logger.info("Enter new product name: ");
		        		            String newProductName = stringInput.nextLine();
		        		            obj.updateProdName(prodnm, newProductName);
		        		            logger.info("Edit Done Successfully");
		        		        }
		        		        obj.printTheProducts(1);
		        		    }
		        		    else if (innerInnerChoice == 2) {
								obj.printTheProducts(1);
								logger.info(prodEnter);
								String discProd = stringInput.nextLine();
								obj.isproductNameExist(discProd);
								if(!obj.getProdIsExist()) {
	                    			logger.info(prExist);
	                    		}
								else {
									logger.info("Enter new product Discription: ");
									String newProductDisc = stringInput.nextLine();
									obj.updateProdDescription(newProductDisc, discProd);
									logger.info(editSuccess);
								}
								
								obj.printTheProducts(1);
						
		        		    }
		        		    else if (innerInnerChoice == 3) {
								obj.printTheProducts(1);
								logger.info(prodEnter);
								String priceProd = stringInput.nextLine();
								obj.isproductNameExist(priceProd);
								if(!obj.getProdIsExist()) {
	                    			logger.info(prExist);
	                    		}
								else {
									logger.info("Enter new product Price: ");
									String newProductPrice = stringInput.nextLine();
									obj.updateProdPrice(newProductPrice, priceProd);
									logger.info(editSuccess);
								}
								
								obj.printTheProducts(1);
					
		        		    }
		        		    else if (innerInnerChoice == 4) {
								obj.printTheProducts(1);
								logger.info(prodEnter);
								String avaProd = stringInput.nextLine();
								obj.isproductNameExist(avaProd);
								if(!obj.getProdIsExist()) {
	                    			logger.info(prExist);
	                    		}
								else {
									logger.info("Enter new product Avalibility: ");
									String newProductAva = stringInput.nextLine();
									obj.updateProdAvailability(newProductAva, avaProd);
									logger.info(editSuccess);
								}
								
								obj.printTheProducts(1);
					
		        		    }
		        		    
		        		    else if (innerInnerChoice == 5) {
								obj.printTheProducts(1);
								logger.info(prodEnter);
								String catProd = stringInput.nextLine();
								obj.isproductNameExist(catProd);
								if(!obj.getProdIsExist()) {
	                    			logger.info(prExist);
	                    		}
								else {
									logger.info("Enter new product Category: ");
									String newProductCat = stringInput.nextLine();
									obj.updateProdcategory(newProductCat, catProd);
									logger.info(editSuccess);
								}
								
								obj.printTheProducts(1);
								obj.printadminDashoard();
								continue;
		        		    }
	        		case 3:
	        			 stringInput.nextLine();
	        			 obj.printTheProducts(1);
						 logger.info("Enter Product name that you want to delete: ");
						 String delProductName = stringInput.nextLine();
						 obj.isproductNameExist(delProductName);
							if(!obj.getProdIsExist()) {
                    			logger.info(prExist);
                    		}
							else {
								obj.deleteProd(delProductName);
								 logger.info("The Product Deleted Succeffuly");
								 obj.printTheProducts(1);
								
							}
							logger.info("\n");
							obj.printadminDashoard();
							continue;
	        		case 4:
	        			stringInput.nextLine();
						 logger.info("Enter new category name: ");
						 String category = stringInput.nextLine();
						 obj.iscategoryNameExist(category);
						 if(obj.getCatIsExist()) {
							 logger.info("The category exist !");
						 }
						 else {
							 obj.addCategory(category);
							 logger.info("The category added Succeffuly: ");
						 }
						 
						 obj.printCat();
						 logger.info("\n"); 
						 obj.printadminDashoard();
						 continue;
	        		case 5:
	        			 stringInput.nextLine();
						 obj.printCat();
						 logger.info("Enter category name that you want to edit: ");
						 String editCategory = stringInput.nextLine();
						 obj.iscategoryNameExist(editCategory);
						 if(!obj.getCatIsExist()) {
							 logger.info(catExist);
						 }
						 else {
							 logger.info("Enter the new category name:");
							 String Strnewcategory = stringInput.nextLine();
							 obj.editCat(editCategory, Strnewcategory);
							 logger.info("The category had been edit Succeffuly");
						 }
						 obj.printCat();
						 logger.info("\n"); 
						 obj.printadminDashoard();
						 continue;
	        		case 6:
	        			stringInput.nextLine();
						 obj.printCat();
						 logger.info("Enter the category that you want to delete: ");
						 String delCategory = stringInput.nextLine();
						 obj.iscategoryNameExist(delCategory);
						 if(!obj.getCatIsExist()) {
							 logger.info(catExist);
						 }
						 else {
							 obj.deleteCat(delCategory);
							 logger.info("The category Deleted Succeffuly");
							 
						 }
						 obj.printCat();
						 logger.info("\n"); 
						 obj.printadminDashoard();
						 continue;
						 
	        		case 7:
	        			stringInput.nextLine();
						 obj.printUsers();
						 logger.info("Enter user username"); 
						 String customerUsername = stringInput.nextLine();
						 obj.selectCustomerAcc(customerUsername);
						 if(!obj.getDisplayCustomerInfo()) {
							 logger.info(userNotExist); 
						 }
						 else {
							 logger.info("Enter New username: ");
							 String newUsername = stringInput.nextLine();
							 obj.changeCustomerUsername(customerUsername, newUsername);
							 logger.info("username change successfully");
						 }
						 obj.printadminDashoard();
						 continue;
	        		case 8:
	        			 stringInput.nextLine();
						 obj.printUsers();
						 logger.info("Enter user username"); 
						 String delUsername = stringInput.nextLine();
						 obj.selectCustomerAcc(delUsername);
						 if(!obj.getDisplayCustomerInfo()) {
							 logger.info(userNotExist); 
						 }
						 else {
							 obj.deleteCustomerAcc(delUsername);
							 logger.info("User had been deleted successfully");
						 }
						 continue;
	        		case 0:
	        			obj.printadminMenu();
	        			continue;
						 
        		    	default: logger.info("Invalid Choice");
        		    	
	        		} while(innerAdmin != 0);
	        		 } 
	        		
       
	    } 
	    } while (obj.getInvalidEmail());
	   
	    return email;
	    
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
	        String prName = "Enter product name: ";
	        String prExist = "The Product is not exist !";
	        logger.info(passwordMsg);
	        password = stringInput.nextLine();
	        
	        obj.customerIncorrectPassword(email, password);
	        if(!obj.getIsLogedin()) {
	        	logger.info(passwordInvalid);
	        	password = stringInput.next();
	        }
	        obj.customerlogin(email, password);
	        if(obj.isCustomer(email)) {
	        	obj.printCustomerMenu();
	        	int customerChoice = stringInput.nextInt();
	        	if(customerChoice == 1) {
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
						continue;
	        		case 2:
	        			stringInput.nextLine();
	        			obj.printTheProducts(2);
						logger.info("Enter Product name you want to buy: ");
						String productNamein = stringInput.nextLine(); 
        		        obj.isproductNameExist(productNamein);
        		        if(!obj.getProdIsExist()) {
        		            logger.info(prExist);
        		        } else {
        		        	logger.info("Enter Car Model: ");
                            String carModel = stringInput.nextLine();
                            logger.info("Enter Installer name: ");
                            String instName = stringInput.nextLine();
                            logger.info("Enter Date: ");
                            String date = stringInput.nextLine();                                    
        		            obj.addProductToCustomerArray(email, productNamein);
        		            obj.addReq(email, productNamein, carModel, instName, date);
        		            logger.info("The Product is purchased successfully !");
        		        }
        		        continue;
	        		case 3:
	        			stringInput.nextLine();
	        			obj.printTheProducts(3);
						logger.info("Enter Product name you want to buy: ");
						String productNameex = stringInput.nextLine(); 
        		        obj.isproductNameExist(productNameex);
        		        if(!obj.getProdIsExist()) {
        		            logger.info(prExist);
        		        } else {
        		        	logger.info("Enter Car Model: ");
                            String carModel = stringInput.nextLine();
                            logger.info("Enter Installer name: ");
                            String instName = stringInput.nextLine();
                            logger.info("Enter Date: ");
                            String date = stringInput.nextLine();                                    
        		            obj.addProductToCustomerArray(email, productNameex);
        		            obj.addReq(email, productNameex, carModel, instName, date);
        		            logger.info("The Product is purchased successfully !");
        		        }
        		        continue;
	        		case 4:
	        			stringInput.nextLine();
	        			obj.printTheProducts(4);
						logger.info("Enter Product name you want to buy: ");
						String productNameel = stringInput.nextLine(); 
        		        obj.isproductNameExist(productNameel);
        		        if(!obj.getProdIsExist()) {
        		            logger.info(prExist);
        		        } else {
        		        	logger.info("Enter Car Model: ");
                            String carModel = stringInput.nextLine();
                            logger.info("Enter Installer name: ");
                            String instName = stringInput.nextLine();
                            logger.info("Enter Date: ");
                            String date = stringInput.nextLine();                                    
        		            obj.addProductToCustomerArray(email, productNameel);
        		            obj.addReq(email, productNameel, carModel, instName, date);
        		            logger.info("The Product is purchased successfully !");
        		        }
        		        continue;
	        							 
        		    	default: logger.info("Invalid Choice");
	        		} 
	        		
	        		 } while(customerChoice != 0);
	        	}
	        	
        		if(customerChoice == 2) {
    			
    			logger.info("1.My Orders");
    			logger.info("2.My Requests");
    			logger.info("3.Manage my account");
    			logger.info("4.Inbox");
    			logger.info("0.Back");
    			int innerchoice = stringInput.nextInt(); // Use a different variable for inner loop
    			
                if (innerchoice == 1) {
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
                   
                    
                }
                else if (innerchoice == 2) {
                	stringInput.nextLine();
                	obj.displayInstallationrequests(email);
                }
                else if(innerchoice == 3) {
        			logger.info("1.Change my username");
        			logger.info("2.Change my password");
        			logger.info("3.Change my phone number");
        			
        			logger.info("0.Back");
        			 int accountchoice = stringInput.nextInt();
        			 stringInput.nextLine(); // Consume the newline character
                     if(accountchoice == 1) {
                         logger.info("Enter new username: ");
                         String nusername = stringInput.nextLine();
                         obj.changeUsernameforCust(email, nusername);
                         logger.info("username change successfully");
                     }
                     else if(accountchoice == 2) {
                    	 logger.info("Enter new password: ");
                         String newpassword = stringInput.nextLine();
                         obj.changePasswordforCust(email, newpassword);
                         logger.info("password change successfully");
                     }
                     else if(accountchoice == 3) {
                    	 logger.info("Enter new phone number: ");
                         String newPhone = stringInput.nextLine();
                         obj.changePhoneforCust(email, newPhone);
                         logger.info("Phone number change successfully");
                     }
//            
                }
                else if(innerchoice == 4) {
                	obj.getorderIsPlacedBy(email);
                }
                else if(innerchoice == 0) {
                	 obj.printCustomerMenu();
                	 customerChoice = stringInput.nextInt();
                	 if(customerChoice == 1) {
                		 obj.printTheProducts(1);
                	 }
                }
               
    			
    			
    		}
	        }        
	    } while (obj.getInvalidEmail());
	   

	    return email;
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
	        String prName = "Enter product name: ";
	        String prExist = "The Product is not exist !";
	        String prodEnter = "Enter the product name that you want to edit:";
	        String editSuccess = "Edit Done Successfully :)";
	        String catExist = "The category is not exist !";
	        String userNotExist = "The user does not exist";
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
