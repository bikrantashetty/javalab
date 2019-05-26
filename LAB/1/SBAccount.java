public class SBAccount extends Bank{
	String accNum;
	double accBal;
	double interest;
	
	public SBAccount(String name, String address, String phone, String pan, String aadhar,String num) {
		super(name, address, phone, pan, aadhar);
		accNum=num;
		accBal=1000;
	}
	
	public SBAccount(String name, String address, String phone, String pan, String aadhar,String num,double bal) {
		super(name, address, phone, pan, aadhar);
		accNum=num;
		accBal=bal;
	}
	
	void calcInt(){
		interest=accBal*0.04;
		}

	void displayDetails(){
		super.displayDetails();
		System.out.println("Account Type : S/B Account\n"+"Account No : "+accNum+"\n"+"Interest paid per year : "+interest+"\nfor Amount : "+accBal);
		}
}
