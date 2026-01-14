package chapter09;

public class PhoneMain_04 {

	public static void main(String[] args) {
		
		//추상클래스이므로 객체생성 안됨
		//Phone p = new Phone("매개변수");
		
		smartPhone smartPhone = new smartPhone("김자바");

		
		System.out.println(smartPhone.owner+"님");
		smartPhone.turnOn();
		smartPhone.intersearch();
		smartPhone.turnOff();
	}

}
