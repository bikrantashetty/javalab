
public class Two {
	public static void main(String[] args) {
		
		Car car=new Car("FULL",150);
		car.fuelStatus("CAR");
		car.topSpeed();
		
		System.out.println("\n");
		
		Bike bike=new Bike("HALF",100);
		bike.fuelStatus("BIKE");
		bike.topSpeed();
		
	}
}