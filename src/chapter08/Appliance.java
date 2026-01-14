package chapter08;

public class Appliance {
	
	String brand;
	
	public Appliance() {
		// TODO Auto-generated constructor stub
	}
	//오버라이딩
	public Appliance(String brand) {
		this.brand = brand;
	}
	void turnOn() {
		System.out.println(brand + " 전원을 켭니다.");
	}

	void turnOff() {
		System.out.println(brand + " 전원을 끕니다.");
	}
	
}
