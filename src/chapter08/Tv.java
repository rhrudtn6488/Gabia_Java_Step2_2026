package chapter08;

public class Tv extends Appliance{
	
	
	public Tv(String brand) {
		super(brand);
	}

	@Override
	void turnOn() {
		// System.out.println(brand + " 전원을 켭니다.");
		super.turnOn();//부모 동작 유지
		System.out.println("TV 화면을 켭니다");
	}
	
	
	
}
