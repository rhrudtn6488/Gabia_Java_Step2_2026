package chapter13;

public class GenericCintainer <T>{
	
	private T[] items;
	private int count;
	
	public GenericCintainer(int size) {
		items = (T[]) new Object[size];
		count = 0;
		}
	//아이템을 추가하는 제네릭 메서드
	public void addItem(T item) {
		if(count< items.length) {
			//items[count] = item;
			//count++;
			items[count++] = item;
		}
		else {
			System.out.println("Container is full");
		}
	}
	public void printems() {
		for(int i=0; i<count; i++) {
			System.out.println(items[i] + " ");
		}
		System.out.println();
	}
	
	// E extends Number: 숫자 타입만 호환
	public <E extends Number>double sum(E[] numbers) {
		double total = 0;
		for(E number:numbers) {
			total += number.doubleValue(); //언박싱
		}
		return total;
	}
}
