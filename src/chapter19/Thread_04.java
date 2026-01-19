package chapter19;

class Counter {

	private int count = 0;

	// synchnonized: 공유 자원에 대해서 한 번에 하나의 스레드만 접근하게 함
	synchronized void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}
}

public class Thread_04 {

	public static void main(String[] args) {
		Counter counter = new Counter();

		Runnable task = () -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		};

		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);

		// 동시실행이 되어도 중복이 없음
		thread1.start();// Runnable task
		thread2.start();

		try {
			thread1.join();// thread1 이 끝날떄 까지 기다림
			thread2.join();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(counter.getCount());
	}

}
