package CarAccessoriesCompany_Main;

public class User {
	public  String Email;
    public  String Password;
    public String RealName;
    public String PhoneNumber;
//    public String Address;
    
	public User(String Email, String Password) {
		// TODO Auto-generated constructor stub
		this.Email = Email;
		this.Password = Password;
		//h
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	
}
