package chapter08;

public class Taxi extends Vehicel{
	private int taxiNum = 1005;

	@Override
	public void run() {
		System.out.println(taxiNum+"번 택시가 달립니다.");
	}
	
	
}
