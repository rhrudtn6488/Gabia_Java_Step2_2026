package chapter11;

class OutterRun{

		//익명의 클래스
	Runnable gettRunnable(int i) {
		int num = 100;
		
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
		};
		
	}
	
}

public class AnonyMousInnerMain_05 {

	public static void main(String[] args) {
		OutterRun out = new OutterRun();
		Runnable runnable = out.gettRunnable(10);
		runnable.run();
	}

}
