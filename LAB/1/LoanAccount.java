public class LoanAccount extends Bank{
	String accNum;
	double loanAmt;
	double interest;
	
	public LoanAccount(String name, String address, String phone, String pan, String aadhar,String num,double loan) {
		super(name, address, phone, pan, aadhar);
		accNum=num;
		loanAmt=loan;
	}
	void calcInt(){
			interest=loanAmt*0.10;
		}
	void displayDetails(){
		super.displayDetails();
		System.out.println("Account Type : Loan Account\n"+"Account No : "+accNum+"\n"+"Interest demand for 1st year : "+interest+"\nfor Amount : "+loanAmt);
		}
}
