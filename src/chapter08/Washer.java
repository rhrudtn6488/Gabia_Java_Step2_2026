package chapter08;

public class Washer extends Appliance{
	public Washer(String brand) {
		super(brand);
	}
	
	void turnOn() {
		// System.out.println(brand + " 전원을 켭니다.");
		super.turnOn();//부모 동작 유지
		System.out.println("세탁기 전원을 켭니다.");
	}
}
