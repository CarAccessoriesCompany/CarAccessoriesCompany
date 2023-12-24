package caraccessoriescompany_main;

public class Appointment {

	private String date;
	private String installerName;
	private String customerName;
	private String productName;
	
	
	public Appointment(String date, String insName, String cusName, String proName) {
		this.date = date;
		this.installerName = insName;
		this.customerName = cusName;
		this.productName = proName;
	}
	
	public Appointment() {
	
	}

	public void setDate(String date) {
		this.date=date;
	}
	
	
	public void setInsName(String name) {
		this.installerName=name;
	}
	
	public void setCusName(String name) {
		this.customerName=name;
	}
	
	public void setProName(String name) {
		this.productName=name;
	}
	
	
	public String getDate() {
		return this.date;
	}
	
	public String getInsName() {
		return this.installerName;
	}
	
	public String getCusName() {
		return this.customerName;
	}
	
	public String getProName() {
		return this.productName;
	}
	
	
	
}
