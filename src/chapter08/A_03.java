package chapter08;

public class A_03 {
	
	//protected -> 같은 패키지에서는 public과 같음
	//다른 패키지에서는 pricvate처럼 제한이 있음(상속 받으면 사용 가능)
	protected String field;
	
	//생성자
	
	protected void method() {
		System.out.println("A Class");
		System.out.println(field);
	}
	
}
