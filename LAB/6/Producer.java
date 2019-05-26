class Producer implements Runnable{
	Q que;
	Producer(Q que){
		this.que = que;
		new Thread(this, "Producer").start();
		}
	
	public void run(){
		int amount = 10000;
		while(true){
			que.put(amount);
		}
	}
}