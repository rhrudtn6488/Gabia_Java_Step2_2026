package chapter13;

//제네릭
public class General <t>{
	
	public void printArr(t[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}
}
