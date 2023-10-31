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
								System.out.println("1.Admin Dashboard");
								System.out.println("2.My profile");
								System.out.println("0.Sign out");
								Choice = input.nextInt();
								if(Choice == 1) {
									System.out.println("Admin Dashboard");
								}
								else if(Choice == 2) {
									System.out.println("My profile");
								}
								else if(Choice == 0) {
									System.out.println("GoodBye");
									break;
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
									break;
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
									break;
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
						break;
						
					}
					
					
				}
			}
		
	}
}
}
	
		
