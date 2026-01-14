package chapter11;

import javax.swing.JOptionPane;

class Out{
	
	//맴버변수
	static int a=1;
	
	//생성자
	
	//메소드
	
	//내부 클래스
	public class In{
		
		//맴버변수
		
		//생성자
		
		//메소드
		public String Infun() {
			
			return a + "번째 Non-static 내부";
		}
	}
}
public class NonStatic_01 {

	public static void main(String[] args) {
		// #1 Out class
		Out obj1 = new Out();
		// #2 In class
		Out.In obj2= obj1.new In();
		String str =obj2.Infun();
		JOptionPane.showMessageDialog(null, str + "\n Success");
		
	}

}
