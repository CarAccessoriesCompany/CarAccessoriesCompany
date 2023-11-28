package CarAccessoriesCompany_Main;

public class Appointment {

	
	public String Date;
	public String InstallerName;
	public String CustomerName;
	public String ProductName;
	
	
	public Appointment(String date,String insName,String cusName,String proName) {
		this.Date=date;
		this.InstallerName=insName;
		this.CustomerName=cusName;
		this.ProductName=proName;
	}
	
	public Appointment() {
		// TODO Auto-generated constructor stub
	}

	public void setDate(String date) {
		this.Date=date;
	}
	
	
	public void setInsName(String name) {
		this.InstallerName=name;
	}
	
	public void setCusName(String name) {
		this.CustomerName=name;
	}
	
	public void setProName(String name) {
		this.ProductName=name;
	}
	
	
	public String getDate() {
		return this.Date;
	}
	
	public String getInsName() {
		return this.InstallerName;
	}
	
	public String getCusName() {
		return this.CustomerName;
	}
	
	public String getProName() {
		return this.ProductName;
	}
	
	
	
}
