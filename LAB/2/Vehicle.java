abstract class Vehicle{
	String fuel;

	public Vehicle(String fuel) {
		this.fuel = fuel;
	}
	
	public void fuelStatus(String vehicle){
		System.out.println("This "+vehicle+"\'s fuel tank is "+fuel);
	}
	
	abstract void topSpeed();
}