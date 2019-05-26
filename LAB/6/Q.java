class Q{
	int Balance_Amount;
	boolean valueSet = false;
	synchronized int get(){
		while(!valueSet){
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println("InterruptedException caught..!!");
			}
		}
	System.out.println("Got : " + Balance_Amount);
	valueSet = false;
	notify();
	return Balance_Amount;
	}
	
	synchronized void put(int amount){
		while(valueSet){
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println("InterruptedException caught..!!");
			}
		}
	Balance_Amount = amount;
	valueSet = true;
	System.out.println("Put : " + Balance_Amount);
	notify();
	}
}