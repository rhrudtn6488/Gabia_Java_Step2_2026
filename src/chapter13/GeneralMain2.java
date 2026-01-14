package chapter13;

public class GeneralMain2 {

	public static void main(String[] args) {
		
		// general
		General general = new General();
		
		//정수형 배열(오토박스)
		Integer[] Arr = {10, 20, 30, 40, 50};
		general.printArr(Arr);
		
		//실수형 배열(오토박스)
		Double[] dArr = {10.0, 20.0, 30.0, 40.0, 50.0};
		general.printArr(dArr);
		
		//문자형 배열(오토박스)
		Character[] cArr = {'A', 'B', 'C', 'D', 'E'};
		general.printArr(cArr);

	}

}
