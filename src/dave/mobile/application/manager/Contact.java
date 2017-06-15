package dave.mobile.application.manager;

/*
 * author - Devang Sawant
 * 
 */

public class Contact {
	
	private String name;
	private String phoneNo;
	
	public Contact(String name, String phoneNo) {
		this.name = name;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
	
	
	

}
