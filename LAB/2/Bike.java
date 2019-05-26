class Bike extends Vehicle{
	int speed;
	public Bike(String fuel,int bikeSpeed) {
		super(fuel);	
		speed=bikeSpeed;
	}

		void topSpeed() {
System.out.println("Bike runs at "+speed+" Km/Hr top speed");
	}
}