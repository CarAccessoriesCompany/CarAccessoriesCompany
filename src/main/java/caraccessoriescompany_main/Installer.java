package caraccessoriescompany_main;

import java.util.ArrayList;
import java.util.List;
//j
public class Installer {
	private String email;
	private String password;
    private String username;
    private String installerAvalibilty;
    protected List<String> schedule = new ArrayList<>();
   
    
    
    public Installer(String email, String password, String username, String installerAvalibilty) {
    	this.email = email;
    	this.password = password;
    	this.username = username;
    	this.installerAvalibilty = installerAvalibilty;
    }	
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	 public String getInstallerAvalibilty() {
			return installerAvalibilty;
		}
		public void setInstallerAvalibilty(String installerAvalibilty) {
			this.installerAvalibilty = installerAvalibilty;
		}
	public List<String> getschedule() {
		return schedule;
	}
	
}
