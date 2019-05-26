class TransactionNotAllowed extends Exception{
	String s1;
	
	TransactionNotAllowed(String s2) {
		s1 = s2;
	}
	
	@Override
	public String toString() { 
		return ("TransactionNotAllowed = "+s1);
	}
}