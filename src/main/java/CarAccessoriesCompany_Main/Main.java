package CarAccessoriesCompany_Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MyCarApplication app = new MyCarApplication();
		int Choice = 0;
		String Email;
		String Password;
		String Category;
		Scanner Input = new Scanner(System.in);
		System.out.println("\tMenu");
		System.out.println("1.Sign in");
		System.out.println("2.Sign Up");
		Choice = Input.nextInt();
		Input.nextLine();	
		
//		Password = Input.nextLine();
		while(Choice != 0) {
			switch(Choice) {
			case 1:
				System.out.print("Enter Your Email:");
				Email = Input.nextLine();
				app.ValidEmail(Email);
				if(app.validEmail) {
//					System.out.print("Invalid Email enter valid email !: ");
//					Email = Input.nextLine();
						System.out.print("Enter Your Password:");
						Password = Input.nextLine();
						app.UserID(Email);
						if(app.isAdmin) {
							while(!app.isLogedin) {
								app.AdminIncorrectPassword(Email, Password);
								System.out.print("Incorrect Password re-enter it:");
								Password = Input.nextLine();
								app.Adminlogin(Email, Password);
								if(app.isLogedin) {
									break;
								}
								
							}
						}
						
						else if(app.isCustomer) {
							app.CustomerIncorrectPassword(Email, Password);
							System.out.print("Incorrect Password re-enter it:");
							Password = Input.nextLine();
						}
						else if(app.isInstaller) {
							app.InstallerIncorrectPassword(Email, Password);
							System.out.print("Incorrect Password re-enter it:");
							Password = Input.nextLine();
						}
						if(app.isAdmin) {
							app.Adminlogin(Email, Password);
						}
						else if(app.isCustomer) {
							app.Customerlogin(Email, Password);
						}
						else if(app.isInstaller) {
							app.Installerlogin(Email, Password);
						}
						else {
							System.out.println("User does no exist");
						}
					
				}
			}
		}
		
		
//		while(true) {
//			app.va
//		}
		
		
	}

}


//if(Choice != 0) {
//	switch(Choice) {
//		case 1:
//			
//			Email = Input.nextLine();
//			app.AdminInvalidEmail(Email);
//			while(!app.isLogedin) {
//				
//				
//				app.AdminInvalidEmail(Email);
//			}
//			
//			app.Adminlogin(Email, Password);
//			app.AdminIncorrectPassword(Email, Password);
//			while(!app.isLogedin) {
//				System.out.print("Incorrect Password enter correct password !: ");
//				Password = Input.nextLine();
//				app.AdminIncorrectPassword(Email, Password);
//
//			}
//			app.PrintMenu();
//			Choice = Input.nextInt();
//			if(Choice == 1) {
//				System.out.println("Admin Dashboard not implemented yet");
//			}
//			else if (Choice == 2) {
//				System.out.println("1.Interior");
//				System.out.println("2.Exterior");
//				System.out.println("3.Electronics");
//				System.out.println("0.Back");
//				Choice = Input.nextInt();
//				if(Choice == 1) {
//					System.out.println("Interior not implemented yet");
//				}
//				else if (Choice == 2) {
//					System.out.println("Exterior not implemented yet");
//				}
//				else if (Choice == 3) {
//					System.out.println("Electronics not implemented yet");
//				}
//				else if (Choice == 0) {
//					app.PrintMenu();
//				}
//				else {
//					System.out.println("Invalid Input");
//				}
//				
//			}
//			else if(Choice == 0) {
//				System.out.println("Electronics not implemented yet");
//			}
//			break;
//			
//		case 0:
//            System.exit(0);  // Exit the program
//			break;
//			
//		default: 
//			System.out.println("Invalid choice.");
//            break;
//		}
//	}
