class Consumer implements Runnable{
	Q que;
	Consumer(Q que){
		this.que = que;
		new Thread(this, "Consumer").start();
	}
	
	public void run(){
		while(true){
			que.get();
		}
	}
}