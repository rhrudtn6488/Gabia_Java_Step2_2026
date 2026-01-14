package chapter13;

public class GeneralNoGenericMain {

	public static void main(String[] args) {
		
		// general
		GeneralNoGeneric general = new GeneralNoGeneric();
		
		//정수형 배열(오토박스)
		Integer[] Arr = {10, 20, 30, 40, 50};
		general.printIntArr(Arr);
		
		//실수형 배열(오토박스)
		Double[] dArr = {10.0, 20.0, 30.0, 40.0, 50.0};
		general.printIntArr(dArr);
		
		//문자형 배열(오토박스)
		Character[] cArr = {'A', 'B', 'C', 'D', 'E'};
		general.printIntArr(cArr);

	}

}
