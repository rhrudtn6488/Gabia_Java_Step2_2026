package chapter13;

public class GenericCintainerMain04 {

	public static void main(String[] args) {
		//문자열 아이템을 저장하는 객체(stringcontainer)
		GenericCintainer<Object> stringcontainer1 = new GenericCintainer<Object>(20);
		stringcontainer1.addItem("Apple");
		stringcontainer1.addItem("Bann");
		stringcontainer1.addItem("Apple");
		stringcontainer1.printems();
		System.out.println();
		
		// 타입제한으로 사용 불가능
		
		//String[] stringArray = { "1", "2", "3", "4", "5" };
		//System.out.println("Sum of int array: "+ stringcontainer1.sum(stringArray));
		
		
		stringcontainer1.addItem(10);
		stringcontainer1.addItem(20);
		stringcontainer1.addItem(30);
		stringcontainer1.printems();
		System.out.println();
		
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println("Sum of int array: "+ stringcontainer1.sum(intArray));
		
		stringcontainer1.addItem("10.1");
		stringcontainer1.addItem("20.1");
		stringcontainer1.addItem("30.1");
		stringcontainer1.printems();
		
		Double[] doubleArray = { 1.1, 2.1, 3.1, 4.1, 5.1 };
		System.out.println("Sum of int array: "+ stringcontainer1.sum(doubleArray));
	}
	
}
