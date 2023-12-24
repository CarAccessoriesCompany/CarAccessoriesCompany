//package caraccessoriescompany_main;
//
//import java.util.Scanner;
//import java.util.logging.Logger;
//
//
//public class Main {
//	private static final Logger logger = Logger.getLogger(Main.class.getName());
//	public static void main(String[] args) {
//		
//		MyCarApplication obj;
//		Main mn = new Main();
//		obj = new MyCarApplication();
//		
//		String emailMsg = "Enter your email: ";
//		String emailInvalid = "Invalid email!, re-Enter your email: ";
//		String passwordMsg = "Enter your password: ";
//		String passwordInvalid = "Incorrect password!, re-Enter your password: ";
//		String prName = "Enter product name: ";
//		String prExist = "The Product is not exist !";
//		String prodEnter = "Enter the product name that you want to edit:";
//		String editSuccess = "Edit Done Successfully :)";
//		
//		String email;
//		String password;
//		String username;
//		String phoneNumber;
//		
//		String productName;
//		String description;
//		String price;
//		String avalibilty;
//		String category;
//		
//		String newproductName;
//		String newProductDisc;
//		String newprice;
//		String newAvalibility;
//		String newcategory;
//		String newusername;
//		int choice = 0;
//		Scanner input = new Scanner(System.in);
//	
//		mn.printMenu();
//		choice = input.nextInt();
//			while(true) {
//				 if (choice == 1) {
//					 	logger.info(emailMsg);
//		                email = input.next();
//		                obj.InvalidemailType(email);
//
//		                if (obj.invalidemail) {
//		                	logger.info(emailInvalid);
//		                } 
//		                else {
//		                    input.nextLine();
//		                    obj.UserID(email);
//		                    if (obj.isAdmin) {
//		                    	logger.info(passwordMsg);
//		                        password = input.nextLine();
//		                        obj.AdminIncorrectpassword(email, password);
//		                        if(!obj.isLogedin) {
//									logger.info(passwordInvalid);
//									password = input.next();
//								}
//		                        obj.Adminlogin(email, password);
//		                        if(obj.isLogedin) {
//		                        	int adminchoice = 0;
//		                        	obj.PrintAdminMenu();	
//		                        	adminchoice = input.nextInt();
//		                        	while(choice == 1) {
//		                        		if(adminchoice == 1) {
//			                        		obj.PrintAdminDashoard();
//			                        		adminchoice = input.nextInt();
//			                        		if(adminchoice == 1) {
//			                        			input.nextLine();
//			                        			
//				                        		logger.info(prName);
//				                        		productName = input.nextLine();
//				                        		obj.isproductNameExist(productName);
//				                        		if(obj.prodIsExist) {
//				                        			logger.info("The Product is exist !");
//				                        		}
//				                        		else {
//				                        			logger.info("Enter Product description: ");
//													description = input.nextLine();
//													logger.info("Enter Product price: ");
//													price = input.nextLine();
//													price = price + "$";
//													logger.info("Enter Product avalibilty: ");
//													avalibilty = input.nextLine();
//													logger.info("Enter Product category: ");
//													category = input.nextLine();
//													obj.addProduct(productName,description, price, avalibilty, category );
//													logger.info("Add Done Successfully");	
//				                        		}
//												obj.PrintTheProducts(1);
//			                        		}
//			                        		if(adminchoice == 2) {
//			                        			obj.PrintEditchoices();
//												logger.info("What do you want to edit?: ");
//												adminchoice = input.nextInt();
//												if(adminchoice == 1) {
//													input.nextLine();
//													obj.PrintTheProducts(1);
//													logger.info(prodEnter);
//													productName = input.nextLine();
//													obj.isproductNameExist(productName);
//													if(!obj.prodIsExist) {
//					                        			logger.info(prExist);
//					                        		}
//													else {
//														logger.info("Enter new product name: ");
//														newproductName = input.nextLine();
//														obj.updateProdName(productName, newproductName);
//														logger.info("Edit Done Successfully");
//													}
//													obj.PrintTheProducts(1);
//												}	
//												else if(adminchoice == 2) {
//													input.nextLine();
//													obj.PrintTheProducts(1);
//													logger.info(prodEnter);
//													productName = input.nextLine();
//													obj.isproductNameExist(productName);
//													if(!obj.prodIsExist) {
//					                        			logger.info(prExist);
//					                        		}
//													else {
//														logger.info("Enter new product Discription:");
//														newProductDisc = input.nextLine();
//														obj.updateProddescription(newProductDisc, productName);
//														logger.info(editSuccess);
//													}
//													
//													obj.PrintTheProducts(1);
//												}
//												else if(adminchoice == 3) {
//													input.nextLine();
//													obj.PrintTheProducts(1);
//													logger.info(prodEnter);
//													productName = input.nextLine();
//													obj.isproductNameExist(productName);
//													if(!obj.prodIsExist) {
//					                        			logger.info(prExist);
//					                        		}
//													else {
//														logger.info("Enter the new product price:");
//														newprice = input.nextLine();
//														newprice = newprice + "$";
//														obj.updateProdprice(newprice, productName);
//														logger.info(editSuccess);
//													}
//													obj.PrintTheProducts(1);
//												}
//												else if(adminchoice == 4) {
//													input.nextLine();
//													obj.PrintTheProducts(1);
//													logger.info(prodEnter);
//													productName = input.nextLine();
//													obj.isproductNameExist(productName);
//													if(!obj.prodIsExist) {
//					                        			logger.info(prExist);
//					                        		}
//													else {
//														logger.info("Enter the new product Avalibility:");
//														newAvalibility = input.nextLine();
//														obj.updateProdAvailability(newAvalibility, productName);
//														logger.info(editSuccess);
//													}
//													
//													obj.PrintTheProducts(1);
//													
//												}
//												else if(adminchoice == 5) {
//													input.nextLine();
//													obj.PrintTheProducts(1);
//													logger.info(prodEnter);
//													productName = input.nextLine();
//													obj.isproductNameExist(productName);
//													if(!obj.prodIsExist) {
//					                        			logger.info(prExist);
//					                        		}
//													else {
//														logger.info("Enter the new product category:");
//														newcategory = input.nextLine();
//														obj.updateProdcategory(newcategory, productName);
//														logger.info(editSuccess);
//													}
//													obj.PrintTheProducts(1);
//												}		
//			                        		}
//			                        		if(adminchoice == 3) {
//			                        			 input.nextLine();
//												 obj.PrintTheProducts(1);
//												 logger.info("Enter Product name that you want to delete: ");
//												 productName = input.nextLine();
//												 obj.isproductNameExist(productName);
//													if(!obj.prodIsExist) {
//					                        			logger.info(prExist);
//					                        		}
//													else {
//														obj.deleteProd(productName);
//														 logger.info("The Product Deleted Succeffuly");
//														 obj.PrintTheProducts(1);
//													}
//
//											 }
//			                        		 if(adminchoice == 4) {
//			                        			 input.nextLine();
//												 logger.info("Enter new category name: ");
//												 category = input.nextLine();
//												 obj.iscategoryNameExist(category);
//												 if(obj.catIsExist) {
//													 logger.info("The category exist !");
//												 }
//												 else {
//													 obj.Addcategory(category);
//													 logger.info("The category added Succeffuly: ");
//												 }
//												 
//												 obj.PrintCat();
//												 logger.info("\n"); 
//											 }
//			                        		 if(adminchoice == 5) {
//			                        			 input.nextLine();
//												 obj.PrintCat();
//												 logger.info("Enter category name that you want to edit: ");
//												 category = input.nextLine();
//												 obj.iscategoryNameExist(category);
//												 if(!obj.catIsExist) {
//													 logger.info("The category is not exist !");
//												 }
//												 else {
//													 logger.info("Enter the new category name:");
//													 newcategory = input.nextLine();
//													 obj.editCat(category, newcategory);
//													 logger.info("The category had been edit Succeffuly");
//												 }
//												 obj.PrintCat();
//												 logger.info("\n"); 
//											 }
//											 
//											 if(adminchoice == 6) {
//												 input.nextLine();
//												 obj.PrintCat();
//												 logger.info("Enter the category that you want to delete: ");
//												 category = input.nextLine();
//												 obj.iscategoryNameExist(category);
//												 if(!obj.catIsExist) {
//													 logger.info("The category is not exist !");
//												 }
//												 else {
//													 obj.deleteCat(category);
//													 logger.info("The category Deleted Succeffuly");
//													 
//												 }
//												 obj.PrintCat();
//												 logger.info("\n"); 
//											 }
//											 if(adminchoice == 7) {
//												 input.nextLine();
//												 obj.PrintUsers();
//												 logger.info("Enter user username"); 
//												 username = input.nextLine();
//												 obj.selectCustomerAcc(username);
//												 if(!obj.displayCustomerInfo) {
//													 logger.info("User does not exist"); 
//												 }
//												 else {
//													 logger.info("Enter New username: ");
//													 newusername = input.nextLine();
//													 obj.changeCustomerusername(username, newusername);
//													 logger.info("username change successfully");
//												 }
//												 
//												 
//												 
//											 }
//											 if(adminchoice == 8) {
//												 input.nextLine();
//												 obj.PrintUsers();
//												 logger.info("Enter user username"); 
//												 username = input.nextLine();
//												 obj.selectCustomerAcc(username);
//												 if(!obj.displayCustomerInfo) {
//													 logger.info("User does not exist"); 
//												 }
//												 else {
//													 logger.info("Enter New username: ");
//													 obj.deleteCustomerAcc(username);
//													 logger.info("User had been deleted successfully");
//												 }
//												 
//												 
//												 
//											 }
//
//											 obj.PrintAdminMenu();
//											 adminchoice = input.nextInt();
//											 if(adminchoice == 0) {
//												 mn.printMenu();
//												 obj.isAdmin = false;
//							                     choice = input.nextInt();
//
//											 }
//											 
//										
//											
//			                        	}
//		                        		
//		                        	}
//		                        	
//		                        	if(adminchoice == 0) {
//		                        		 mn.printMenu();
//										 obj.isAdmin = false;
//					                     choice = input.nextInt();
//					                     
//	                        			
//	                        		}
//									 
//		                        	
//		                        }
//		                    }
//		                    else if(obj.isCustomer) {
//		                    	logger.info(passwordMsg);
//		                        password = input.nextLine();
//		                        obj.CustomerIncorrectpassword(email, password);
//		                        if(!obj.isLogedin) {
//									logger.info(passwordInvalid);
//									password = input.next();
//								}
//		                        obj.Customerlogin(email, password);
//		                        if(obj.isLogedin) {	
//		                        	int customerChoice = 0;
//		                        	obj.PrintCustomerMenu();
//		                        	customerChoice = input.nextInt();
//		                        	while(customerChoice != 0) {
//		                        		
//		                        		if(customerChoice == 1) {
//		                        			logger.info("1.All Products");
//		                        			logger.info("2.Interior Products");
//		                        			logger.info("3.Exterior Products");
//		                        			logger.info("4.Electronic Products");
//		                        			logger.info("Enter category you want");
//		                        			int Cat = input.nextInt();
//		                        			
//		                        			obj.PrintTheProducts(cat);
//		                        			 input.nextLine();
//		                        			 logger.info("Enter Product name you want to buy: ");
//		                        		        productName = input.nextLine();  // Use nextLine() instead of next()
//		                        		        obj.isproductNameExist(productName);
//		                        		        if(!obj.prodIsExist) {
//		                        		            logger.info(prExist);
//		                        		        } else {
//		                        		        	logger.info("Enter Car Model: ");
//			                                        String carModel = input.nextLine();
//			                                        logger.info("Enter Installer name: ");
//			                                        String instName = input.nextLine();
//			                                        logger.info("Enter Date: ");
//			                                        String date = input.nextLine();                                    
//		                        		            obj.addProductToCustomerArray(email, productName);
//		                        		            obj.addReq(email, productName, carModel, instName, date);
//		                        		            logger.info("The Product is purchased successfully !");
////		                        		            obj.displayCustomerOrders(email);
//		                        		        }
//		                        		        obj.PrintCustomerMenu();
////		                        		        customerChoice = input.nextInt();
//		                        		        
//
//		                        		        // Consume the newline character
//		                        		        customerChoice = input.nextInt();
//		                        			
//		                        		}
//		                        		if(customerChoice == 2) {
//		                        			
//		                        			logger.info("1.My Orders");
//		                        			logger.info("2.My Requests");
//		                        			logger.info("3.Manage my account");
//		                        			logger.info("4.Inbox");
//		                        			logger.info("0.Back");
//		                        			int innerchoice = input.nextInt(); // Use a different variable for inner loop
//
//		                                    if (innerchoice == 1) {
//		                                    	input.nextLine();
//		                                        obj.displayCustomerOrders(email);
//		                                        logger.info("Do you want to confirm any order ?: ");
//		                                        String YesOrNo = input.nextLine();
//		                                        if(YesOrNo.equals("Yes")) {
//		                                        	logger.info(prName);
//		                                        	 productName = input.nextLine();
//				                                        String conf;
//				                                        logger.info("Enter Confirm: ");
//				                                        conf = input.nextLine();
//				                                        if(conf.equals("Confirm")) {
//				                                        	obj.orderIsPlacedBy(email, productName, conf);
//				                                        	
//				                                        }
//		                                        }
//		                                       
//		                                        
//		                                    }
//		                                    else if (innerchoice == 2) {
//		                                    	input.nextLine();
//		                                    	obj.displayInstallationRequests(email);
//		                                    }
//		                                    else if(innerchoice == 3) {
//			                        			logger.info("1.Change my username");
//			                        			logger.info("2.Change my password");
//			                        			logger.info("3.Change my phone number");
//			                        			
//			                        			logger.info("0.Back");
//			                        			 int accountchoice = input.nextInt();
//			                                     input.nextLine(); // Consume the newline character
//			                                     if(accountchoice == 1) {
//			                                         logger.info("Enter new username: ");
//			                                         String nusername = input.nextLine();
//			                                         obj.changeusernameforCust(email, nusername);
//			                                         logger.info("username change successfully");
//			                                     }
//			                                     else if(accountchoice == 2) {
//			                                    	 logger.info("Enter new password: ");
//			                                         String newpassword = input.nextLine();
//			                                         obj.changepasswordforCust(email, newpassword);
//			                                         logger.info("password change successfully");
//			                                     }
//			                                     else if(accountchoice == 3) {
//			                                    	 logger.info("Enter new phone number: ");
//			                                         String newPhone = input.nextLine();
//			                                         obj.changePhoneforCust(email, newPhone);
//			                                         logger.info("Phone number change successfully");
//			                                     }
////			                                     else {
////			                                    	 obj.PrintCustomerMenu();
////			                                    	 
////			                                     }
//		                                    }
//		                                    else if(innerchoice == 4) {
//		                                    	obj.getorderIsPlacedBy(email);
//		                                    }
//		                                    else if(innerchoice == 0) {
//		                                    	 obj.PrintCustomerMenu();
//		                                    	 customerChoice = input.nextInt();
//		                                    	 if(customerChoice == 1) {
//		                                    		 obj.PrintTheProducts(1);
//		                                    	 }
//		                                    }
//		                                   
//		                        			
//		                        			
//		                        		}
//		                        		
//		                        		
//		                        		 
////		                                 customerChoice = input.nextInt();
//		                        	}
//		                        	if(customerChoice == 0) {
//		                        		mn.printMenu();
//	                        			obj.isCustomer = false;
//	                        			choice = input.nextInt();
//	                        			
//	                        			
//	                        			
//	                        		}
//		                        	
//		                        }
//		                        
//		                    	
//		                    	
//		                    }
//		                    else if(obj.isInstaller) {
//		                    	logger.info(passwordMsg);
//		                    	password = input.nextLine();
//		                        obj.InstallerIncorrectpassword(email, password);
//		                        if(!obj.isLogedin) {
//									logger.info(passwordInvalid);
//									password = input.next();
//								}
//		                        obj.Installerlogin(email, password);
//		                        if(obj.isLogedin) {
//		                        	 obj.PrintInstallerMenu();
//		                        	 
//		                        	 int installerChoice = 0;
//			                         installerChoice = input.nextInt();
//			                        	while(installerChoice != 0) {
//			                        		if(installerChoice == 1) {
//			                        			
//			                        			String[] usernameSplit = email.split("@");
//			                        			String un = usernameSplit[0];
////			                        			logger.info(un);
//			                        			obj.ViewInstallerSchedule(un);
//			                        			choice = input.nextInt();
//			                        		}
//			                        		 if(installerChoice == 0) {
//			                        			
//			                        			obj.isInstaller = false;
//			                        			
//			                        		}
//			                        		 	
////			                        		obj.PrintInstallerMenu();
////			                        		installerChoice = input.nextInt();
//			                        		
//			                        	}
//			                        	mn.printMenu();
//	                        			choice = input.nextInt();
//		                        }
//		                       
//		                    }
//		                }
//		               
//		            }
//				 if (choice == 2) {
//					    input.nextLine();
//					    logger.info(emailMsg);
//					    email = input.nextLine();
//					    obj.InvalidemailType(email);
//
//					    if (obj.invalidemail) {
//					        logger.info(emailInvalid);
//					    } else {
//					        obj.Existemail(email);
//					        if (!obj.isSignedup) {
//					            logger.info("Exist email!, re-Enter non exist email: ");
//					        }
//
//					       
//					        logger.info("Enter password the password must have at least 8 characters: ");
//					        password = input.nextLine();
//					        obj.SignupWeakpassword(email, password);
//
//					        if (!obj.isSignedup) {
//					            logger.info("Weak password!, re-Enter Stronger password: ");
//					        }
//
//					        logger.info("Enter username: ");
//					        username = input.nextLine();
//					        obj.Existusername(username);
//
//					        if (!obj.isSignedup) {
//					            logger.info("Exist username!, re-Enter non exist username: ");
//					        }
//
//					        logger.info("Phone Number: ");
//					        phoneNumber = input.nextLine();
//					        obj.ExistphoneNumber(phoneNumber);
//
//					        if (!obj.isSignedup) {
//					            logger.info("Exist Phone Number!, re-Enter non exist Phone Number: ");
//					        } else {
//					            obj.UserSignUp(email, password, username, phoneNumber);
//
//					            if (obj.isSignedup) {
//					            	mn.printMenu();
//					                obj.isSignedup = false;
//					                choice = input.nextInt();
//					            }
//					        }
//					    }
//					}
//
//				 
//			}
//			
//		}
//	public void printMenu() {
//		logger.info("\t Menu");
//        logger.info("1.Sign in");
//        logger.info("2.Sign up");
//	}
//	
//}
