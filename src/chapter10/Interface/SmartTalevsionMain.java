package chapter10.Interface;

public class SmartTalevsionMain {

	public static void main(String[] args) {
		SmartTelevision s = new SmartTelevision();
		s.turnOn();
		s.search("naver");
		s.setVolume(20);
		s.turnOff();
		System.out.println();
		
		Remote r = s;
		r.turnOn();
		r.setVolume(10);
		r.turnOff();
		System.out.println();
		
		Searchable se = s;
		se.search("naver");
	}

}
