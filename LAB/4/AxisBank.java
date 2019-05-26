class AxisBank{
	String name;
	String address;
	String phone;
	String pan;
	String aadhar;
	double balance;
	
	public AxisBank(String name, String address, String phone, String pan, String aadhar,double balance) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.pan = pan;
		this.aadhar = aadhar;
		this.balance=balance;
	}
	
	void depositAmount(double amt){
		balance +=amt;
	}
	
	void withdrawAmount(double amt){
		try{
			if(amt>4500)
				throw new TransactionNotAllowed("Exceeds per day limit (day limit is 4500)");
			
			if((balance-amt)<1000){
				throw new LessBalanceException("can\'t with this much amount due to insufficient balance, minimum 1000 has to be maintained");
			}
			
			else{
				balance-=amt;
			}
		}catch(LessBalanceException e){
			System.out.println(e);
		}catch(TransactionNotAllowed e){
			System.out.println(e);
		}
	}
	
	public void display() {
		System.out.println("Name : "+name+" "+"Address : "+address+" "+"Phone No : "+phone+" "+"PAN : "+pan+" "+"Aadhar : "+aadhar);
		System.out.println("Available Balanc in the account is "+balance);
	}
}