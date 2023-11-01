package CarAccessoriesCompany_Main;

import java.util.Scanner;
public class Main {

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
		
		int Choice;
		Scanner input = new Scanner(System.in);
			System.out.println("\t Menu");
			System.out.println("1.Sign in");
			System.out.println("2.Sign up");
			
			Choice = input.nextInt();
			System.out.print("Enter email:");
			while(Choice != 0) {
				if(Choice == 1) {
					Email = input.next();
					obj.InvalidEmailType(Email);
					if(obj.invalidEmail == true) {
						System.out.print("Invalid Email!, re-Enter your email:");
					}
					else {
						obj.UserID(Email);
						if(obj.isAdmin) {
							System.out.print("Enter your password:");
							Password = input.next();
							obj.AdminIncorrectPassword(Email, Password);
							if(obj.isLogedin == false) {
								System.out.print("Incorrect Password!, re-Enter your password:");
								Password = input.next();
								
							}
							obj.Adminlogin(Email, Password);
							 if(obj.isLogedin) {
								 	obj.PrintAdminMenu();
								 	Choice = input.nextInt();
								 	
								 	while(Choice != 0) {
								 		if(Choice == 1) {
											obj.PrintAdminDashoard();
											Choice = input.nextInt();
											if(Choice == 1) {
												System.out.print("Enter Product Name:");
												ProductName = input.next();
												System.out.print("Enter Product Description:");
												Description = input.next();
												System.out.print("Enter Product Price:");
												Price = input.next();
												System.out.print("Enter Product Avalibilty:");
												Avalibilty = input.next();
												System.out.print("Enter Product Category:");
												Category = input.next();
												obj.addProduct(ProductName,Description, Price, Avalibilty, Category );
												System.out.println("Add Done Successfully :)");
												
											}
											 if(Choice == 2) {
												obj.PrintEditChoices();
												System.out.print("What do you want to edit?:");
												Choice = input.nextInt();
													if(Choice == 1) {
														obj.PrintTheProducts();
														System.out.print("Enter the product name that you want to edit:");
														ProductName = input.next();
														System.out.print("Enter the new product name:");
														NewProductName = input.next();
														obj.updateProdName(ProductName, NewProductName);
														System.out.println("Edit Done Successfully :)");
													}	
													else if(Choice == 2) {
														obj.PrintTheProducts();
														System.out.print("Enter the product name that you want to edit:");
														ProductName = input.next();
														System.out.print("Enter the new product Discription:");
														NewProductDisc = input.next();
														obj.updateProdDescription(NewProductDisc, ProductName);
														System.out.println("Edit Done Successfully :)");
													}
													else if(Choice == 3) {
														obj.PrintTheProducts();
														System.out.print("Enter the product name that you want to edit:");
														ProductName = input.next();
														System.out.print("Enter the new product Price:");
														NewPrice = input.next();
														obj.updateProdPrice(NewPrice, ProductName);
														System.out.println("Edit Done Successfully :)");
													}
													else if(Choice == 4) {
														obj.PrintTheProducts();
														System.out.print("Enter the product name that you want to edit:");
														ProductName = input.next();
														System.out.print("Enter the new product Avalibility:");
														NewAvalibility = input.next();
														obj.updateProdAvailability(NewAvalibility, ProductName);
														System.out.println("Edit Done Successfully :)");
													}
													else if(Choice == 5) {
														obj.PrintTheProducts();
														System.out.print("Enter the product name that you want to edit:");
														ProductName = input.next();
														System.out.print("Enter the new product Category:");
														NewCategory = input.next();
														obj.updateProdCategory(NewCategory, ProductName);
														System.out.println("Edit Done Successfully :)");
													}
													
									 		}
											 if(Choice == 3) {
												 obj.PrintTheProducts();
												 System.out.println("Enter the Product that you want to delete:");
												 ProductName = input.next();
												 obj.deleteProd(ProductName);
												 System.out.println("The Product Deleted Succeffuly:");
											 }
											 
											 if(Choice == 4) {
//												 obj.PrintCat();
												 System.out.println("Enter Category name:");
												 Category = input.next();
												 obj.AddCategory(Category);
												 System.out.println("The Category added Succeffuly:");
											 }
											 if(Choice == 5) {
												 obj.PrintCat();
												 System.out.println("Enter Category name that you want to edit:");
												 Category = input.next();
												 System.out.println("Enter the new Category name:");
												 NewCategory = input.next();
												 obj.editCat(Category, NewCategory);
												 System.out.println("The Category had been edit Succeffuly:");
											 }
											 
											 if(Choice == 6) {
												 obj.PrintCat();
												 System.out.println("Enter the Category that you want to delete:");
												 Category = input.next();
												 obj.deleteCat(Category);
												 System.out.println("The Category Deleted Succeffuly:");
											 }
											 obj.PrintAdminDashoard();
//											 Choice = input.nextInt();
											 
//										
										}
								 		
								 	}
								 	
								 	
							 }
									
							}
							
						
						
						else if(obj.isCustomer) {
							System.out.print("Enter your password:");
							Password = input.next();
							obj.CustomerIncorrectPassword(Email, Password);
							if(obj.isLogedin == false) {
								System.out.print("Incorrect Password!, re-Enter your password:");
								Password = input.next();
								
							}
							obj.Customerlogin(Email, Password);
							 if(obj.isLogedin) {
									System.out.println("1.My profile");
									System.out.println("2.Search");
									System.out.println("0.Sign out");
									Choice = input.nextInt();
									if(Choice == 1) {
										System.out.println("My profile");
									}
									else if(Choice == 2) {
										System.out.println("Search");
									}
									else if(Choice == 0) {
										System.out.println("GoodBye");
										
									}
							}
						}
						else if(obj.isInstaller) {
							System.out.print("Enter your password:");
							Password = input.next();
							obj.InstallerIncorrectPassword(Email, Password);
							if(obj.isLogedin == false) {
								System.out.print("Incorrect Password!, re-Enter your password:");
								Password = input.next();
								
							}
							obj.Installerlogin(Email, Password);
							 if(obj.isLogedin) {
									System.out.println("1.My profile");
									System.out.println("2.My Request");
									System.out.println("0.Sign out");
									Choice = input.nextInt();
									if(Choice == 1) {
										System.out.println("My profile");
									}
									else if(Choice == 2) {
										System.out.println("My Request");
									}
									else if(Choice == 0) {
										System.out.println("GoodBye");
										
									}
							}
						}
					}
				}
				if(Choice == 2) {
					Email = input.next();
					obj.InvalidEmailType(Email);
					if(obj.invalidEmail == true) {
						System.out.print("Invalid Email!, re-Enter email:");
					}
					else {
						obj.ExistEmail(Email);
						if(obj.isSignedup == false) {
							System.out.print("You try to sign up with exist email:");
							Email = input.next();
						}
						System.out.print("Enter Password:");
						Password = input.next();
						obj.SignupWeakPassword(Email, Password);
						if(obj.isSignedup == false) {
							System.out.print("Weak Password!, Enter Strong password (minimum 8 characteres):");
							Password = input.next();
						}
						System.out.print("Enter Username:");
						Username = input.next();
						obj.ExistUsername(Username);
						if(obj.isSignedup == false) {
							System.out.print("You try to enter an exist Username try another one :");
							Username = input.next();
						}
						
						System.out.print("Enter Phone Number:");
						PhoneNumber = input.next();
						obj.ExistPhoneNumber(PhoneNumber);
						if(obj.isSignedup == false) {
							System.out.print("You try to enter an exist PhoneNumber try another one :");
							PhoneNumber = input.next();
						}
						
						obj.UserSignUp(Email, Password, Username, PhoneNumber);
						if(obj.isSignedup == true) {
							System.out.println("You Sign up successfully :)");
							
							
						}
						
						
					}
				}
			
}
		}
}

	
		
//while(Choice != 0) {
//	if(Choice == 1) {
//		obj.PrintAdminDashoard();
//		Choice = input.nextInt();
//		if(Choice == 1) {
//			System.out.print("Enter Product Name:");
//			ProductName = input.next();
//			System.out.print("Enter Product Description:");
//			Description = input.next();
//			System.out.print("Enter Product Price:");
//			Price = input.next();
//			System.out.print("Enter Product Avalibilty:");
//			Avalibilty = input.next();
//			System.out.print("Enter Product Category:");
//			Category = input.next();
//			obj.addProduct(ProductName,Description, Price, Avalibilty, Category );
//			System.out.println("Add Done Successfully :)");
//			
//		}
//		else if(Choice == 2) {
//			obj.PrintEditChoices();
//			System.out.print("What do you want to edit?:");
//			Choice = input.nextInt();
//			 
//				if(Choice == 1) {
//					obj.PrintTheProducts();
//					System.out.print("Enter the product name that you want to edit:");
//					ProductName = input.next();
//					System.out.println("Enter the new product name:");
//					NewProductName = input.next();
//					obj.updateProdName(ProductName, NewProductName);
//					System.out.println("Edit Done Successfully :)");
//				}							
//		}
//		else if(Choice == 0) {
//			obj.PrintAdminMenu();
//			Choice = input.nextInt();
//		}
//	}
//	
//	
//	}