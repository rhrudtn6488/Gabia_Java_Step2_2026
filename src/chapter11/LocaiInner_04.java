package chapter11;

class Outter{
	
	//외부 클래스 맴버변수
	int outnum = 100;
	static int sNum = 200;
	
	//class(X) 익명의 클래스
	Runnable getRunnable(int i) {//int i final
		
		int num = 100; //final
		
		class MyRunnable implements Runnable{

			int localNum=10; //맴버변수
			
			@Override
			public void run() {
				//int num=200; //final
				//int i=200; //final
				System.out.println("num="+num);
				System.out.println("localnum="+localNum);
				System.out.println("(외부)outnum"+outnum);
				
				System.out.println("(외부 Metapace)sNum=" + Outter.sNum);
				
			}
			
		}
		return new MyRunnable();
	}
}

public class LocaiInner_04 {

	public static void main(String[] args) {
		Outter out = new Outter();
		out.getRunnable(10);
		Runnable runner = out.getRunnable(10);

	}

}
