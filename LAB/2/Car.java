class Car extends Vehicle{
	int speed;
	
	public Car(String fuel,int carSpeed) {
		super(fuel);	
		speed=carSpeed;
	}
	
	void topSpeed() {
		System.out.println("Car runs at "+speed+" Km/Hr top speed");
	}
}