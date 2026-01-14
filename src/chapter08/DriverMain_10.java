package chapter08;

public class DriverMain_10 {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		//Vehicel vehicle = new Bus();
		//driver.driver(vehicle);
		driver.driver(new Bus());
		driver.driver(new Taxi());
	}

}
