class Six{
	public static void main(String args[]){
		Q que = new Q();
		new Producer(que);
		new Consumer(que);
		System.out.println("Press Control-C to stop...");
	}
}