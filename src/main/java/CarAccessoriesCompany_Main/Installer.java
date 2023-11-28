package CarAccessoriesCompany_Main;

import java.util.ArrayList;
//j
public class Installer {
	public String Email;
    public String Password;
    public String Username;
    public String InstallerAvalibilty;
    public static ArrayList<String> schedule = new ArrayList<String>();
    
    
    public Installer(String Email, String Password, String Username, String InstallerAvalibilty) {
    	this.Email = Email;
    	this.Password = Password;
    	this.Username = Username;
    	this.InstallerAvalibilty = InstallerAvalibilty;
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
	public String getUsername() {
		return Username;
	}
	public void setUsername(String Username) {
		this.Username = Username;
	}
	 public String getInstallerAvalibilty() {
			return InstallerAvalibilty;
		}
		public void setInstallerAvalibilty(String InstallerAvalibilty) {
			this.InstallerAvalibilty = InstallerAvalibilty;
		}
	public ArrayList<String> getschedule() {
		return schedule;
	}
}
