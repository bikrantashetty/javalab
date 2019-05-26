public class Bank {
	String name;
	String address;
	String phone;
	String pan;
	String aadhar;
	
	public Bank() {
	}
	
	public Bank(String name, String address, String phone, String pan, String aadhar) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.pan = pan;
		this.aadhar = aadhar;
	}
	
	void calcInt(){
	}
	
	void displayDetails(){
		System.out.println("Name : "+name+"Address : "+address+"Phone No : "+phone+"PAN : "+pan+"Aadhar : "+aadhar);
	}
}
