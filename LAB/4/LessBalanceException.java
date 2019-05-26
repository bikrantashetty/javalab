class LessBalanceException extends Exception{
	String s1;
	
	LessBalanceException(String s2) {
		s1 = s2;
	}
	
	@Override
	public String toString() { 
		return ("LessBalanceException = "+s1);
	}
}