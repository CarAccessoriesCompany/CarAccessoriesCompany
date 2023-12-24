package CarAccessoriesCompany_Main;

import java.util.Scanner;
public class Main {
//h
	public static void main(String[] args) {
		
		MyCarApplication obj;
		obj = new MyCarApplication();
		
		String Email;
		String Password;
		String Username;
		String PhoneNumber;
		
		String ProductName;
		String Description;
		String Price;
		String Avalibilty;
		String Category;
		
		String NewProductName;
		String NewProductDisc;
		String NewPrice;
		String NewAvalibility;
		String NewCategory;
		
		String NewUsername;
	
		
		int Choice = 0;
		Scanner input = new Scanner(System.in);
			System.out.println("\t Menu");
			System.out.println("1.Sign in");
			System.out.println("2.Sign up");
			
			Choice = input.nextInt();
			
			while(true) {
				 if (Choice == 1) {
		                System.out.print("Enter your email:");
		                Email = input.next();
		                obj.InvalidEmailType(Email);

		                if (obj.invalidEmail) {
		                    System.out.print("Invalid Email!, re-Enter your email:");
		                } 
		                else {
		                    // Consume the newline character in the input buffer
		                    input.nextLine();
		                    obj.UserID(Email);
		                    if (obj.isAdmin) {
		                        System.out.print("Enter your password:");
		                        Password = input.nextLine();
		                        obj.AdminIncorrectPassword(Email, Password);
		                        if(obj.isLogedin == false) {
									System.out.print("Incorrect Password!, re-Enter your password:");
									Password = input.next();
								}
		                        obj.Adminlogin(Email, Password);
		                        if(obj.isLogedin) {
		                        	int AdminChoice = 0;
		                        	obj.PrintAdminMenu();	
		                        	AdminChoice = input.nextInt();
		                        	while(Choice == 1) {
		                        		if(AdminChoice == 1) {
			                        		obj.PrintAdminDashoard();
			                        		AdminChoice = input.nextInt();
			                        		if(AdminChoice == 1) {
			                        			input.nextLine();
			                        			
				                        		System.out.print("Enter Product Name: ");
				                        		ProductName = input.nextLine();
				                        		obj.isProductNameExist(ProductName);
				                        		if(obj.prodIsExist) {
				                        			System.out.println("The Product is exist !");
				                        		}
				                        		else {
				                        			System.out.print("Enter Product Description: ");
													Description = input.nextLine();
													System.out.print("Enter Product Price: ");
													Price = input.nextLine();
													Price = Price + "$";
													System.out.print("Enter Product Avalibilty: ");
													Avalibilty = input.nextLine();
													System.out.print("Enter Product Category: ");
													Category = input.nextLine();
													obj.addProduct(ProductName,Description, Price, Avalibilty, Category );
													System.out.println("Add Done Successfully :)");	
				                        		}
												obj.PrintTheProducts(1);
			                        		}
			                        		if(AdminChoice == 2) {
			                        			obj.PrintEditChoices();
												System.out.print("What do you want to edit?: ");
												AdminChoice = input.nextInt();
												if(AdminChoice == 1) {
													input.nextLine();
													obj.PrintTheProducts(1);
													System.out.print("Enter product name that you want to edit: ");
													ProductName = input.nextLine();
													obj.isProductNameExist(ProductName);
													if(obj.prodIsExist == false) {
					                        			System.out.println("The Product is not exist !");
					                        		}
													else {
														System.out.print("Enter new product name: ");
														NewProductName = input.nextLine();
														obj.updateProdName(ProductName, NewProductName);
														System.out.println("Edit Done Successfully :)");
													}
													obj.PrintTheProducts(1);
												}	
												else if(AdminChoice == 2) {
													input.nextLine();
													obj.PrintTheProducts(1);
													System.out.print("Enter product name that you want to edit:");
													ProductName = input.nextLine();
													obj.isProductNameExist(ProductName);
													if(obj.prodIsExist == false) {
					                        			System.out.println("The Product is not exist !");
					                        		}
													else {
														System.out.print("Enter new product Discription:");
														NewProductDisc = input.nextLine();
														obj.updateProdDescription(NewProductDisc, ProductName);
														System.out.println("Edit Done Successfully :)");
													}
													
													obj.PrintTheProducts(1);
												}
												else if(AdminChoice == 3) {
													input.nextLine();
													obj.PrintTheProducts(1);
													System.out.print("Enter the product name that you want to edit:");
													ProductName = input.nextLine();
													obj.isProductNameExist(ProductName);
													if(obj.prodIsExist == false) {
					                        			System.out.println("The Product is not exist !");
					                        		}
													else {
														System.out.print("Enter the new product Price:");
														NewPrice = input.nextLine();
														NewPrice = NewPrice + "$";
														obj.updateProdPrice(NewPrice, ProductName);
														System.out.println("Edit Done Successfully :)");
													}
													obj.PrintTheProducts(1);
												}
												else if(AdminChoice == 4) {
													input.nextLine();
													obj.PrintTheProducts(1);
													System.out.print("Enter the product name that you want to edit:");
													ProductName = input.nextLine();
													obj.isProductNameExist(ProductName);
													if(obj.prodIsExist == false) {
					                        			System.out.println("The Product is not exist !");
					                        		}
													else {
														System.out.print("Enter the new product Avalibility:");
														NewAvalibility = input.nextLine();
														obj.updateProdAvailability(NewAvalibility, ProductName);
														System.out.println("Edit Done Successfully :)");
													}
													
													obj.PrintTheProducts(1);
													
												}
												else if(AdminChoice == 5) {
													input.nextLine();
													obj.PrintTheProducts(1);
													System.out.print("Enter the product name that you want to edit:");
													ProductName = input.nextLine();
													obj.isProductNameExist(ProductName);
													if(obj.prodIsExist == false) {
					                        			System.out.println("The Product is not exist !");
					                        		}
													else {
														System.out.print("Enter the new product Category:");
														NewCategory = input.nextLine();
														obj.updateProdCategory(NewCategory, ProductName);
														System.out.println("Edit Done Successfully :)");
													}
													obj.PrintTheProducts(1);
												}		
			                        		}
			                        		if(AdminChoice == 3) {
			                        			 input.nextLine();
												 obj.PrintTheProducts(1);
												 System.out.print("Enter Product name that you want to delete:");
												 ProductName = input.nextLine();
												 obj.isProductNameExist(ProductName);
													if(obj.prodIsExist == false) {
					                        			System.out.println("The Product is not exist !");
					                        		}
													else {
														obj.deleteProd(ProductName);
														 System.out.println("The Product Deleted Succeffuly:");
														 obj.PrintTheProducts(1);
													}

											 }
			                        		 if(AdminChoice == 4) {
			                        			 input.nextLine();
												 System.out.print("Enter new Category name:");
												 Category = input.nextLine();
												 obj.isCategoryNameExist(Category);
												 if(obj.catIsExist) {
													 System.out.println("The Category exist !");
												 }
												 else {
													 obj.AddCategory(Category);
													 System.out.println("The Category added Succeffuly:");
												 }
												 
												 obj.PrintCat();
												 System.out.println("\n"); 
											 }
			                        		 if(AdminChoice == 5) {
			                        			 input.nextLine();
												 obj.PrintCat();
												 System.out.print("Enter Category name that you want to edit:");
												 Category = input.nextLine();
												 obj.isCategoryNameExist(Category);
												 if(obj.catIsExist == false) {
													 System.out.println("The Category is not exist !");
												 }
												 else {
													 System.out.print("Enter the new Category name:");
													 NewCategory = input.nextLine();
													 obj.editCat(Category, NewCategory);
													 System.out.println("The Category had been edit Succeffuly:");
												 }
												 obj.PrintCat();
												 System.out.println("\n"); 
											 }
											 
											 if(AdminChoice == 6) {
												 input.nextLine();
												 obj.PrintCat();
												 System.out.print("Enter the Category that you want to delete:");
												 Category = input.nextLine();
												 obj.isCategoryNameExist(Category);
												 if(obj.catIsExist == false) {
													 System.out.println("The Category is not exist !");
												 }
												 else {
													 obj.deleteCat(Category);
													 System.out.println("The Category Deleted Succeffuly:");
													 
												 }
												 obj.PrintCat();
												 System.out.println("\n"); 
											 }
											 if(AdminChoice == 7) {
												 input.nextLine();
												 obj.PrintUsers();
												 System.out.print("Enter user username"); 
												 Username = input.nextLine();
												 obj.selectCustomerAcc(Username);
												 if(obj.displayCustomerInfo == false) {
													 System.out.println("User does not exist"); 
												 }
												 else {
													 System.out.print("Enter New username: ");
													 NewUsername = input.nextLine();
													 obj.changeCustomerUsername(Username, NewUsername);
													 System.out.println("Username change successfully");
												 }
												 
												 
												 
											 }
											 if(AdminChoice == 8) {
												 input.nextLine();
												 obj.PrintUsers();
												 System.out.print("Enter user username"); 
												 Username = input.nextLine();
												 obj.selectCustomerAcc(Username);
												 if(obj.displayCustomerInfo == false) {
													 System.out.println("User does not exist"); 
												 }
												 else {
													 System.out.print("Enter New username: ");
													 obj.deleteCustomerAcc(Username);
													 System.out.println("User had been deleted successfully");
												 }
												 
												 
												 
											 }

											 obj.PrintAdminMenu();
											 AdminChoice = input.nextInt();
											 if(AdminChoice == 0) {
												 System.out.println("\t Menu");
												 System.out.println("1.Sign in");
												 System.out.println("2.Sign up");
												 obj.isAdmin = false;
							                     Choice = input.nextInt();

											 }
											 
										
											
			                        	}
		                        		
		                        	}
		                        	
		                        	if(AdminChoice == 0) {
	                        			 System.out.println("\t Menu");
										 System.out.println("1.Sign in");
										 System.out.println("2.Sign up");
										 obj.isAdmin = false;
					                     Choice = input.nextInt();
					                     
	                        			
	                        		}
									 
		                        	
		                        }
		                    }
		                    else if(obj.isCustomer) {
		                    	System.out.print("Enter your password:");
		                        Password = input.nextLine();
		                        obj.CustomerIncorrectPassword(Email, Password);
		                        if(obj.isLogedin == false) {
									System.out.print("Incorrect Password!, re-Enter your password:");
									Password = input.next();
								}
		                        obj.Customerlogin(Email, Password);
		                        if(obj.isLogedin) {	
		                        	int CustomerChoice = 0;
		                        	obj.PrintCustomerMenu();
		                        	CustomerChoice = input.nextInt();
		                        	while(CustomerChoice != 0) {
		                        		
		                        		if(CustomerChoice == 1) {
		                        			System.out.println("1.All Products");
		                        			System.out.println("2.Interior Products");
		                        			System.out.println("3.Exterior Products");
		                        			System.out.println("4.Electronic Products");
		                        			System.out.println("Enter Category you want");
		                        			int Cat = input.nextInt();
		                        			
		                        			obj.PrintTheProducts(Cat);
		                        			 input.nextLine();
		                        			 System.out.print("Enter Product name you want to buy: ");
		                        		        ProductName = input.nextLine();  // Use nextLine() instead of next()
		                        		        obj.isProductNameExist(ProductName);
		                        		        if(obj.prodIsExist == false) {
		                        		            System.out.println("The Product is not exist !");
		                        		        } else {
		                        		        	System.out.print("Enter Car Model: ");
			                                        String CarModel = input.nextLine();
			                                        System.out.print("Enter Installer name: ");
			                                        String InstName = input.nextLine();
			                                        System.out.print("Enter Date: ");
			                                        String Date = input.nextLine();                                    
		                        		            obj.addProductToCustomerArray(Email, ProductName);
		                        		            obj.addReq(Email, ProductName, CarModel, InstName, Date);
		                        		            System.out.println("The Product is purchased successfully !");
//		                        		            obj.displayCustomerOrders(Email);
		                        		        }
		                        		        obj.PrintCustomerMenu();
//		                        		        CustomerChoice = input.nextInt();
		                        		        

		                        		        // Consume the newline character
		                        		        CustomerChoice = input.nextInt();
		                        			
		                        		}
		                        		if(CustomerChoice == 2) {
		                        			
		                        			System.out.println("1.My Orders");
		                        			System.out.println("2.My Requests");
		                        			System.out.println("3.Manage my account");
		                        			System.out.println("4.Inbox");
		                        			System.out.println("0.Back");
		                        			int innerChoice = input.nextInt(); // Use a different variable for inner loop

		                                    if (innerChoice == 1) {
		                                    	input.nextLine();
		                                        obj.displayCustomerOrders(Email);
		                                        System.out.print("Do you want to confirm any order ?: ");
		                                        String YesOrNo = input.nextLine();
		                                        if(YesOrNo.equals("Yes")) {
		                                        	System.out.print("Enter Product name: ");
		                                        	 ProductName = input.nextLine();
				                                        String Conf;
				                                        System.out.print("Enter Confirm: ");
				                                        Conf = input.nextLine();
				                                        if(Conf.equals("Confirm")) {
				                                        	obj.orderIsPlacedBy(Email, ProductName, Conf);
				                                        	
				                                        }
		                                        }
		                                       
		                                        
		                                    }
		                                    else if (innerChoice == 2) {
		                                    	input.nextLine();
		                                    	obj.displayInstallationRequests(Email);
		                                    }
		                                    else if(innerChoice == 3) {
			                        			System.out.println("1.Change my username");
			                        			System.out.println("2.Change my password");
			                        			System.out.println("3.Change my phone number");
			                        			
			                        			System.out.println("0.Back");
			                        			 int accountChoice = input.nextInt();
			                                     input.nextLine(); // Consume the newline character
			                                     if(accountChoice == 1) {
			                                         System.out.print("Enter new Username: ");
			                                         String newUsername = input.nextLine();
			                                         obj.changeUsernameforCust(Email, newUsername);
			                                         System.out.println("Username change successfully");
			                                     }
			                                     else if(accountChoice == 2) {
			                                    	 System.out.print("Enter new Password: ");
			                                         String newPassword = input.nextLine();
			                                         obj.changePasswordforCust(Email, newPassword);
			                                         System.out.println("Password change successfully");
			                                     }
			                                     else if(accountChoice == 3) {
			                                    	 System.out.print("Enter new phone number: ");
			                                         String newPhone = input.nextLine();
			                                         obj.changePhoneforCust(Email, newPhone);
			                                         System.out.println("Phone number change successfully");
			                                     }
//			                                     else {
//			                                    	 obj.PrintCustomerMenu();
//			                                    	 
//			                                     }
		                                    }
		                                    else if(innerChoice == 4) {
		                                    	obj.getorderIsPlacedBy(Email);
		                                    }
		                                    else if(innerChoice == 0) {
		                                    	 obj.PrintCustomerMenu();
		                                    	 CustomerChoice = input.nextInt();
		                                    	 if(CustomerChoice == 1) {
		                                    		 obj.PrintTheProducts(1);
		                                    	 }
		                                    }
		                                   
		                        			
		                        			
		                        		}
		                        		
		                        		
		                        		 
//		                                 CustomerChoice = input.nextInt();
		                        	}
		                        	if(CustomerChoice == 0) {
	                        			System.out.println("\t Menu");
	                        			System.out.println("1.Sign in");
	                        			System.out.println("2.Sign up");
	                        			obj.isCustomer = false;
	                        			Choice = input.nextInt();
	                        			
	                        			
	                        			
	                        		}
		                        	
		                        }
		                        
		                    	
		                    	
		                    }
		                    else if(obj.isInstaller) {
		                    	System.out.print("Enter your password:");
		                    	Password = input.nextLine();
		                        obj.InstallerIncorrectPassword(Email, Password);
		                        if(obj.isLogedin == false) {
									System.out.print("Incorrect Password!, re-Enter your password:");
									Password = input.next();
								}
		                        obj.Installerlogin(Email, Password);
		                        if(obj.isLogedin) {
		                        	 obj.PrintInstallerMenu();
		                        	 
		                        	 int InstallerChoice = 0;
			                         InstallerChoice = input.nextInt();
			                        	while(InstallerChoice != 0) {
			                        		if(InstallerChoice == 1) {
			                        			
			                        			String[] UsernameSplit = Email.split("@");
			                        			String un = UsernameSplit[0];
//			                        			System.out.println(un);
			                        			obj.ViewInstallerSchedule(un);
			                        			Choice = input.nextInt();
			                        		}
			                        		 if(InstallerChoice == 0) {
			                        			
			                        			obj.isInstaller = false;
			                        			
			                        		}
			                        		 	
//			                        		obj.PrintInstallerMenu();
//			                        		InstallerChoice = input.nextInt();
			                        		
			                        	}
			                        	System.out.println("\t Menu");
	                        			System.out.println("1.Sign in");
	                        			System.out.println("2.Sign up");
	                        			Choice = input.nextInt();
		                        }
		                       
		                    }
		                }
		               
		            }
				 if (Choice == 2) {
					    input.nextLine();
					    System.out.print("Enter your email:");
					    Email = input.nextLine();
					    obj.InvalidEmailType(Email);

					    if (obj.invalidEmail) {
					        System.out.print("Invalid Email!, re-Enter your email:");
					    } else {
					        obj.ExistEmail(Email);
					        if (obj.isSignedup == false) {
					            System.out.print("Exist Email!, re-Enter non exist email: ");
					        }

					       
					        System.out.print("Enter Password the password must have at least 8 characters: ");
					        Password = input.nextLine();
					        obj.SignupWeakPassword(Email, Password);

					        if (obj.isSignedup == false) {
					            System.out.print("Weak Password!, re-Enter Stronger Password: ");
					        }

					        System.out.print("Enter Username: ");
					        Username = input.nextLine();
					        obj.ExistUsername(Username);

					        if (obj.isSignedup == false) {
					            System.out.print("Exist Username!, re-Enter non exist Username: ");
					        }

					        System.out.print("Phone Number: ");
					        PhoneNumber = input.nextLine();
					        obj.ExistPhoneNumber(PhoneNumber);

					        if (obj.isSignedup == false) {
					            System.out.print("Exist Phone Number!, re-Enter non exist Phone Number: ");
					        } else {
					            obj.UserSignUp(Email, Password, Username, PhoneNumber);

					            if (obj.isSignedup == true) {
					                System.out.println("Signed Up success :)");
					                System.out.println("\t Menu");
					                System.out.println("1.Sign in");
					                System.out.println("2.Sign up");
					                obj.isSignedup = false;
					                Choice = input.nextInt();
					            }
					        }
					    }
					}

				 
			}
			
		}
}
